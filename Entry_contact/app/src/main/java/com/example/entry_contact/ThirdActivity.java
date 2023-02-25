package com.example.entry_contact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ThirdActivity extends AppCompatActivity {
    ArrayList<person> contactList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        person person = new person();
        ListView listView = findViewById(R.id.listView);
        Intent intent = getIntent();
        String firstName = intent.getStringExtra("FirstName");
        String lastName = intent.getStringExtra("LastName");
        person.setFirstname(firstName);
        person.setLastName(lastName);
        contactList.add(person);

        contactAdapter contactAdapter = new contactAdapter(this,R.layout.row_contact,contactList);
        listView.setAdapter(contactAdapter);

    }

}