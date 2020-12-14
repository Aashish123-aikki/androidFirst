package com.gupta.vichat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class loginactivity extends AppCompatActivity {
    ProgressDialog dialog;
    EditText emailbox,passwdbox;
    Button loginbox,signupbox;

    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_loginactivity);
        dialog=new ProgressDialog (this);
        dialog.setMessage ("Please Wait...");
        auth=FirebaseAuth.getInstance ();


        emailbox = (EditText) findViewById (R.id.emailbtn);
        passwdbox=(EditText)findViewById (R.id.passwdbtn);
        loginbox=(Button)findViewById (R.id.loginbtn);
        signupbox=(Button)findViewById (R.id.signupbtn);

        loginbox.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                String email,pass;
                email=emailbox.getText ().toString ();
                pass=passwdbox.getText ().toString ();
                auth.signInWithEmailAndPassword (email,pass).addOnCompleteListener (new OnCompleteListener<AuthResult> ( ) {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful ()){
                            FirebaseUser user=auth.getCurrentUser ();
                            startActivity (new Intent ( loginactivity.this,dashbord.class));
                       }else {
                           Toast.makeText (loginactivity.this,task.getException ().getLocalizedMessage (),Toast.LENGTH_SHORT).show ();
                       }
                   }
               });
            }
        });

        signupbox.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (loginactivity.this,signupactivity.class ));
            }
        });



    }
}