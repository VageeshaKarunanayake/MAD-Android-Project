package com.optimus.optimus;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EmployeeLaoutActicvity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employeelayout);
    }

    public void AddempButton(View view) {
        Snackbar.make(view, "Employee added Successfully", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();

    }

    public void ResetempButton(View view) {
        Snackbar.make(view, "All the fields Resetted", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }
}

