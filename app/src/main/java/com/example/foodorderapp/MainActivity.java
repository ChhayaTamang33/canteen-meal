package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.foodorderapp.Adapters.MainAdapter;
import com.example.foodorderapp.Models.MainModel;
import com.example.foodorderapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




//
//        ArrayList<MainModel> list =new ArrayList<>();
//        list.add(new MainModel(R.drawable.images, name: "momo2" ,price:"200" , description: "Jhol momo extra juicy"));
//        list.add(new MainModel(R.drawable.momo, name: "momo1" ,price:"100" , description: "Steam momo extra juicy"));
//        list.add(new MainModel(R.drawable.images, name: "momo2" ,price:"50" , description: "Jhol momo extra juicy"));
//        list.add(new MainModel(R.drawable.images, name: "momo2" ,price:"50" , description: "Jhol momo extra juicy"));
//        list.add(new MainModel(R.drawable.images, name: "momo2" ,price:"50" , description: "Jhol momo extra juicy"));
//
//        MainAdapter adapter = new MainAdapter(list , context this);
//        binding.recyclerview.setAdapter(adapter);
//
//        LinearLayoutManager layoutManager = new LinearLayoutManager((context this));
//        binding.recyclerview.setLayoutManager(layoutManager);



    }
}