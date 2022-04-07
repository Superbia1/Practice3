package com.bsbo_08_19.lipukhin.simplefragmentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Fragment1 fragment1;
    private Fragment2 fragment2;
    private Button button1,button2;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        button1 = findViewById(R.id.buttonFragment);
        button2 = findViewById(R.id.buttonFragmentTwo);
        fragmentManager = getSupportFragmentManager();

        button1.setOnClickListener(view -> {
            fragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment1).commit();
        });

        button2.setOnClickListener(view -> {
            fragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment2).commit();
        });
    }
}