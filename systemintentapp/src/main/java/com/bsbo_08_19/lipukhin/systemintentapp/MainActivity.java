package com.bsbo_08_19.lipukhin.systemintentapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button map, cal, browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        map = findViewById(R.id.buttonMap);
        cal = findViewById(R.id.buttonCall);
        browser = findViewById(R.id.buttonBrowser);

        map.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:55.749479,37.613944"));
            startActivity(intent);
        });

        cal.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:89811112233"));
            startActivity(intent);
        });

        browser.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://developer.android.com"));
            startActivity(intent);
        });
    }
}