package com.optimus.optimus;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OrderlayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orderlayout);
    }
    public void AddButton(View view) {
        Snackbar.make(view, "Order added Successfully", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();

    }
    public void ResetButton(View view) {
        Snackbar.make(view, "All the fields Resetted", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();

    }
}
