package com.example.entry_contact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        EditText firstName = findViewById(R.id.firstname);
        EditText lastName = findViewById(R.id.lastname);
        EditText mobileNumber = findViewById(R.id.mobileNumber);
        EditText eMail = findViewById(R.id.eMail);

        Button saveBtn = findViewById(R.id.saveBtn);

        saveBtn.setOnClickListener(v -> {

            String first = firstName.getText().toString();
            if (first == null ) {
                Toast.makeText(this, "Please Enter FirstName", Toast.LENGTH_SHORT).show();
            }else{
                return;
            }
            String last = lastName.getText().toString();
            if (last == null ) {
                Toast.makeText(this, "Please Enter LastName", Toast.LENGTH_SHORT).show();
            }else{
                return;
            }
            String mobile = mobileNumber.getText().toString();
            if (mobile == null ) {
                Toast.makeText(this, "Please Enter MobileNumber", Toast.LENGTH_SHORT).show();
            }else{
                return;
            }
            String mail = eMail.getText().toString();
            if (mail == null ) {
                Toast.makeText(this, "Please Enter E-Mail", Toast.LENGTH_LONG).show();
            }else{
                return;
            }

            Intent send2 = new Intent(getApplicationContext(), ThirdActivity.class);
            send2.putExtra("FirstName", first);
            send2.putExtra("LastName", last);
            send2.putExtra("MobileNumber", mobile);
            send2.putExtra("EMail", mail);
            startActivity(send2);
        });

    }

}