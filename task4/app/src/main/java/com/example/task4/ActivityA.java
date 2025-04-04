package com.example.task4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityA extends AppCompatActivity {

    EditText editTextName, editTextPhone, editTextAge;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        editTextName = findViewById(R.id.editTextName);
        editTextPhone = findViewById(R.id.editTextPhone);
        editTextAge = findViewById(R.id.editTextAge);
        btnSend = findViewById(R.id.btnSend);

        btnSend.setOnClickListener(v -> {
            String name = editTextName.getText().toString();
            String phone = editTextPhone.getText().toString();
            int age = Integer.parseInt(editTextAge.getText().toString());

            // Create bundle
            Bundle bundle = new Bundle();
            bundle.putString("name", name);
            bundle.putString("phone", phone);
            bundle.putInt("age", age);

            // Send to Activity B
            Intent intent = new Intent(ActivityA.this, ActivityB.class);
            intent.putExtras(bundle);
            startActivity(intent);
        });
    }
}
