package com.example.foodorderapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.Adapter;

import com.example.foodorderapp.Adapters.OrdersAdapters;
import com.example.foodorderapp.Models.OrderModels;
import com.example.foodorderapp.databinding.ActivityMainBinding;
import com.example.foodorderapp.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {
    @NonNull ActivityOrderBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        ArrayList<OrderModels> list = new ArrayList<>();
//
//        list.add(new OrderModels(R.drawable.momo , soldItemName: "momo" , price:"30" , orderNumber "45");
//        list.add(new OrderModels(R.drawable.momo , soldItemName:"momo" , price:"30" , orderNumber "45");
//        list.add(new OrderModels(R.drawable.momo , soldItemName: "momo" , price:"30" , orderNumber "45");
//        list.add(new OrderModels(R.drawable.momo , soldItemName: "momo" , price:"30" , orderNumber "45");
//        list.add(new OrderModels(R.drawable.momo , soldItemName: "momo" , price:"30" , orderNumber "45");
//
//        OrdersAdapters adapters =new OrdersAdapters((list, context this));
//        binding.orderRecyclerView.setAdapter(adapters);
//
//        LinearLayoutManager layoutManager = new LinearLayoutManager(context this);
//        binding.orderRecyclerView.setLayoutManager(layoutManager);

    }
}