package com.example.assignment_onebanc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;
import android.text.TextWatcher;
import android.text.Editable;

public class EmailActivity extends AppCompatActivity {

    EditText email;
    Button btn;
    private String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+.[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        email = findViewById(R.id.editTextTextEmailAddress);
        btn = findViewById(R.id.button3);

        // Disable the button initially
        btn.setEnabled(false);

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                checkInputs();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmailActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }

    private void checkInputs() {
        String emailText = email.getText().toString();
        if (emailText.matches(emailPattern)) {
            btn.setEnabled(true);
        } else {
            btn.setEnabled(false);
            email.setError("Invalid email address. Please enter a valid email address.");
            //Toast.makeText(EmailActivity.this, "Please enter a valid email address", Toast.LENGTH_SHORT).show();
        }
    }
}

