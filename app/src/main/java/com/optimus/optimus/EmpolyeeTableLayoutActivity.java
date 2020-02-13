package com.optimus.optimus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EmpolyeeTableLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empolyee_table_layout);

    }
    public void InsertEmpolyeeButton(View view) {
        Intent empL = new Intent(this,EmployeeLaoutActicvity.class);
        startActivity(empL);

    }
    }

