package com.cs.ajinmathew.project.library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button btnLog;
EditText edUserName,edPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        btnLog=(Button)findViewById( R.id.login );
        edUserName=(EditText)findViewById( R.id.user );
        edPassword=(EditText)findViewById( R.id.pass );
        btnLog.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=edUserName.getText().toString().trim();
                String password=edPassword.getText().toString().trim();
                if((username.equals( "admin" ))&&(password.equals( "12345" ))){
                    startActivity( new Intent( getApplicationContext(),Home.class ) );
                }
            }
        } );
    }
}
