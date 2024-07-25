package com.example.assignment_onebanc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MobileActivity extends AppCompatActivity {

    EditText Phone;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile);
        Phone = findViewById(R.id.editTextText2);
        btn = findViewById(R.id.button5);
        Phone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String phoneNumber = Phone.getText().toString();
                if(phoneNumber.length()<10){
                    Phone.setError("Invalid Phone number. It should be at least 10 digits.");
                } else {
                    Phone.setError(null); // Clear the error if the phone number is valid
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = Phone.getText().toString();
                if(phoneNumber.length() >= 10) {
                    Toast.makeText(MobileActivity.this, "Registered successfully. Phone number: " + phoneNumber, Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MobileActivity.this, EmailActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MobileActivity.this, "Invalid phone number. Please enter a valid phone number.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}