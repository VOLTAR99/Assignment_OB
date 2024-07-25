package com.example.assignment_onebanc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class GuidelinesActivity extends AppCompatActivity {

    ImageView cancel_Button;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guidelines);
        cancel_Button = findViewById(R.id.cancelButton);
        btn = findViewById(R.id.button2);
        cancel_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GuidelinesActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GuidelinesActivity.this, NameActivity.class);
                startActivity(intent);
            }
        });

    }
}