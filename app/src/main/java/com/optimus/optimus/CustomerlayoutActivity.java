package com.optimus.optimus;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CustomerlayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer);
    }
    public void AddcusButton(View view) {
        Snackbar.make(view, "Customer added Successfully", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();

    }

    public void ResetcusButton(View view) {
        Snackbar.make(view, "All the fields Resetted", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }
}
