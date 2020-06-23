package com.example.linearlayoutexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class googleMapsLayout extends AppCompatActivity {
   private ImageView photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_maps_layout);

        photo = findViewById(R.id.photo);




        Picasso.get().load("https://i.ytimg.com/vi/kBBnBF3sOws/maxresdefault.jpg").into(photo);
    }
}
