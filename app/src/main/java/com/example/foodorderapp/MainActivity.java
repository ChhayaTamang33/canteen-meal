package com.example.foodorderapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.foodorderapp.Adapters.MainAdapter;
import com.example.foodorderapp.Models.MainModel;
import com.example.foodorderapp.databinding.ActivityMainBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    String userName, userEmail, userAddress;
    String userNumber;
    FirebaseDatabase db;
    DatabaseReference reference;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.updateProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userName = binding.UserName.getText().toString();
                userAddress = binding.UserAddress.getText().toString();
                userEmail = binding.UserEmailAddress.getText().toString();
                userNumber = binding.UserPhone.getText().toString();

                if (!userName.isEmpty() && !userAddress.isEmpty() && !((String) userNumber).isEmpty() && !userEmail.isEmpty()) {

                    user user = new user(userNumber, userName, userEmail, userAddress);
                    db = FirebaseDatabase.getInstance();
                    reference = db.getReference("Users");
                    Task<Void> successfully_updated = reference.child(userName).setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            binding.UserName.setText("");
                            binding.UserAddress.setText("");
                            binding.UserEmailAddress.setText("");
                            binding.UserPhone.setText("");
                            Toast.makeText(MainActivity.this, "Successfully Updated", Toast.LENGTH_SHORT).show();

                        }
                    });

                }
            }
        });


    }
}