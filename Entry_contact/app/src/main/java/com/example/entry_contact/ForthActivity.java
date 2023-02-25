package com.example.entry_contact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class ForthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth);

        EditText firstName = findViewById(R.id.editView);
        EditText lastName = findViewById(R.id.editView2);
        EditText mobileNumber = findViewById(R.id.editView3);
        EditText eMail = findViewById(R.id.editView4);

        Intent i = getIntent();

        String first = i.getStringExtra("FirstName");
        String last = i.getStringExtra("LastName");
        String mobile = i.getStringExtra("MobileNumber");
        String email = i.getStringExtra("EMail");

        firstName.setText(first);
        lastName.setText(last);
        mobileNumber.setText(mobile);
        eMail.setText(email);

    }
}