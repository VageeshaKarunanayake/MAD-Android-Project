package com.optimus.optimus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InventoryTableLaoutActivivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inventorytablelayout);
    }
        public void InsertInventoryButton(View view) {
            Intent inventoryL = new Intent(this,InventoryLayoutActivity.class);
            startActivity(inventoryL);

    }
}
