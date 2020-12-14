package com.gupta.vichat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class signupactivity extends AppCompatActivity {

    FirebaseAuth auth;
    FirebaseFirestore database;
    EditText emailbox,passwdbox,namebox;
    Button loginbox,signupbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_signupactivity);
        auth=FirebaseAuth.getInstance ();

        database=FirebaseFirestore.getInstance ();
        emailbox = (EditText) findViewById (R.id.emailbtn);
        passwdbox=(EditText)findViewById (R.id.passwdbtn);
        loginbox=(Button)findViewById (R.id.loginbtn);
        signupbox=(Button)findViewById (R.id.signupbtn);
        namebox=(EditText)findViewById (R.id.namebtn);



        signupbox.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                String email,pass,name;
                email=emailbox.getText ().toString ();
                pass = passwdbox.getText ().toString ();
                name=namebox.getText ().toString ();

                user User=new user ();
                User.setEmail (email);
                User.setPass (pass);
                User.setName (name);

                auth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener (new OnCompleteListener<AuthResult> ( ) {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful ()){
                            database.collection ("user")
                                    .document ().set (User).addOnSuccessListener (new OnSuccessListener<Void> ( ) {
                                        @Override
                                        public void onSuccess(Void aVoid) {
                                            Toast.makeText (signupactivity.this,"Account is created",Toast.LENGTH_SHORT).show ();
                                            startActivity(new Intent(signupactivity.this,dashbord.class));
                                }

                            });

                        }else{
                            Toast.makeText (signupactivity.this,"Failed? in Creating Account ",Toast.LENGTH_SHORT);
                        }

                    }
                });

            }
        });
        loginbox.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                startActivity (new Intent ( signupactivity.this,loginactivity.class ));
            }
        });
    }
}