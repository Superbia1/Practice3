package com.bsbo_08_19.lipukhin.resultactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editText = findViewById(R.id.editTextUniv);
        Button button = findViewById(R.id.buttonResult);

        button.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.putExtra("university", editText.getText().toString());
            setResult(RESULT_OK, intent);
            finish();
        });
    }
}