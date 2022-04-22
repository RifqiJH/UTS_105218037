package com.example.rifqijh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private MyAdapter.RecycleViewClickListener listener;

    String s1[], s2[], s3[], s4[], s5[];
    int images [] = {R.drawable.hotel1,R.drawable.hotel2,R.drawable.hotel3, R.drawable.hotel4,
            R.drawable.hotel5, R.drawable.hotel6, R.drawable.hotel7, R.drawable.hotel8,
            R.drawable.hotel9, R.drawable.hotel10} ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById (R.id.recycleview);

        s1 = getResources().getStringArray(R.array.namaHotel);
        s2 = getResources().getStringArray(R.array.descripton);
        s3 = getResources().getStringArray(R.array.alamat);
        s4 = getResources().getStringArray(R.array.destinasi);
        s5 = getResources().getStringArray(R.array.harga);

        setAdapter();


    }

    private void setAdapter() {
        setOnClickListener();
        MyAdapter myAdapter = new MyAdapter(this, s1, s2, s3, s4, s5, images, listener);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setOnClickListener() {
        listener = new MyAdapter.RecycleViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(),DetailActivity.class);
                startActivity(intent);
            }
        };
    } }
