package com.cs.ajinmathew.project.library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
Button btnStdAdd,btnStdSer,btnBookAdd,btnBookSer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_home );
        btnBookAdd=(Button)findViewById( R.id.img1 );
        btnStdAdd=(Button)findViewById( R.id.img2 );
        btnBookSer=(Button)findViewById( R.id.img3 );
        btnStdSer=(Button)findViewById( R.id.img4 );
        btnBookAdd.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( getApplicationContext(),AddBook.class ) );
            }
        } );
        btnBookSer.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( getApplicationContext(),SerBook.class ) );
            }
        } );
        btnStdAdd.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( getApplicationContext(),AddStd.class ) );
            }
        } );
        btnStdSer.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( getApplicationContext(),SerStd.class ) );
            }
        } );
    }
}
