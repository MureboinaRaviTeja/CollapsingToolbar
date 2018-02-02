package com.example.mravi.collapsingtoolbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.mravi.collapsingtoolbar.branch.CseActivity;

public class Zones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zones);
    }
   public  void department(View view){
        Intent dept=new Intent(this, MainActivity.class);
        startActivity(dept);
    }


}
