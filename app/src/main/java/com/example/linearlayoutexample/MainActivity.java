package com.example.linearlayoutexample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        button = findViewById(R.id.googleButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               startActivity();
            }
        });
    }



    private void startActivity() {
        Intent intent = new Intent(this, googleMapsLayout.class);
        startActivity(intent);

    }
}
