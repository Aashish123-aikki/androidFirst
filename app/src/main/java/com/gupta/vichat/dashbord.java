package com.gupta.vichat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.jitsi.meet.sdk.JitsiMeet;
import org.jitsi.meet.sdk.JitsiMeetActivity;
import org.jitsi.meet.sdk.JitsiMeetConferenceOptions;

import java.net.MalformedURLException;
import java.net.URL;

public class dashbord extends AppCompatActivity {
    EditText linkbox;
    Button joinbox,sharebox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_dashbord);
        linkbox=findViewById (R.id.callbtn);
        joinbox=findViewById (R.id.joinbtn);
        sharebox=findViewById (R.id.sharebtn);
        URL server;
        try{
                server=new URL("https://meet.jit.si");
                JitsiMeetConferenceOptions defaultoptions=
                        new  JitsiMeetConferenceOptions.Builder ()
                                .setServerURL (server)
                                .setWelcomePageEnabled (false)
                                .build ();
            JitsiMeet.setDefaultConferenceOptions (defaultoptions);
    } catch (MalformedURLException e) {
            e.printStackTrace ( );
        }


        joinbox.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                JitsiMeetConferenceOptions options=new JitsiMeetConferenceOptions.Builder ()
                        .setRoom (linkbox.getText ().toString ())
                        .setWelcomePageEnabled (false)
                        .build ();
                JitsiMeetActivity.launch (dashbord.this,options);
            }
        });
        sharebox.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                String a= (String) joinbox.getText ();
                Intent intent=new Intent ( Intent.ACTION_SEND );
                intent.setType ("text/plain");
                intent.putExtra (Intent.EXTRA_SUBJECT,a);
                startActivity(Intent.createChooser (intent,"share via"));

            }
        });

    }
}