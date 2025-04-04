package com.example.task4;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityB extends AppCompatActivity {

    TextView textViewName, textViewPhone, textViewAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        textViewName = findViewById(R.id.textViewName);
        textViewPhone = findViewById(R.id.textViewPhone);
        textViewAge = findViewById(R.id.textViewAge);

        // Get data from bundle
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String name = bundle.getString("name");
            String phone = bundle.getString("phone");
            int age = bundle.getInt("age");

            textViewName.setText("Name: " + name);
            textViewPhone.setText("Phone: " + phone);
            textViewAge.setText("Age: " + age);
        }
    }
}
