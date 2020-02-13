package com.optimus.optimus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CustomerTableLaoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_table_laout);
    }
    public void InsertCustomerButton(View view) {
        Intent customerL = new Intent(this,CustomerlayoutActivity.class);
        startActivity(customerL);

    }
}
