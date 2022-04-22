package com.example.rifqijh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    String s1[], s3[], s4[], s5[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        s1 = getResources().getStringArray(R.array.namaHotel);
        s3 = getResources().getStringArray(R.array.alamat);
        s4 = getResources().getStringArray(R.array.destinasi);
        s5 = getResources().getStringArray(R.array.harga);



    }
}

