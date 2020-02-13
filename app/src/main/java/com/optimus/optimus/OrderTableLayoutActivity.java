package com.optimus.optimus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OrderTableLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ordertablelayout);
    }

    public void InsertButton(View view) {
        Intent orderL = new Intent(this,OrderlayoutActivity.class);
        startActivity(orderL);
    }
}
