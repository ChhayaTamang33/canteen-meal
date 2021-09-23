package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class myOrders extends AppCompatActivity {
    Dialog myDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_orders);
        myDialog = new Dialog((this);
    }
    public void ShowPopup(View v){
        ImageView imgclose;
        Button btnFollow;
        myDialog.setContentView(R.layout.activity_order_detail_popup);
        imgclose= (ImageView) myDialog.findViewById(R.id.imgclose);
        btnFollow = (Button) myDialog.findViewById(R.id.btnFollow);
        imgclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.show();
    }
}