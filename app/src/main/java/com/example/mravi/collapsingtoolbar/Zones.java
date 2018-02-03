package com.example.mravi.collapsingtoolbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.mravi.collapsingtoolbar.branch.CseActivity;

public class Zones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zones);


    }


    public void go1(View view){
        Toast.makeText(this, "hello clicked", Toast.LENGTH_SHORT).show();

        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);


    }


    public  void department(View view){
        Intent dept=new Intent(this, MainActivity.class);
        startActivity(dept);
    }


}
