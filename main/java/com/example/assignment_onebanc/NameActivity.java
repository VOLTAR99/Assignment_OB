package com.example.assignment_onebanc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.jar.Attributes;

public class NameActivity extends AppCompatActivity {

    EditText name;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        name = findViewById(R.id.editTextText);
        btn = findViewById(R.id.button4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Toast.makeText(NameActivity.this, "Registered successfully "+ name.getText(), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(NameActivity.this, MobileActivity.class);
                startActivity(intent);
            }
        });
    }
}