package com.example.task1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

    private Button showMenuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // your main layout

        showMenuButton = findViewById(R.id.showMenuButton); // assume you have this button in your activity_main.xml

        showMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showBottomSheetMenu();
            }
        });
    }

    private void showBottomSheetMenu() {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(MainActivity.this);
        View sheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.bottom_sheet_menu, null);

        bottomSheetDialog.setContentView(sheetView);
        bottomSheetDialog.show();

        TextView profile = sheetView.findViewById(R.id.optionProfile);
        TextView settings = sheetView.findViewById(R.id.optionSettings);
        TextView logout = sheetView.findViewById(R.id.optionLogout);

        profile.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Profile clicked", Toast.LENGTH_SHORT).show();
            bottomSheetDialog.dismiss();
        });

        settings.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Settings clicked", Toast.LENGTH_SHORT).show();
            bottomSheetDialog.dismiss();
        });

        logout.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Logout clicked", Toast.LENGTH_SHORT).show();
            bottomSheetDialog.dismiss();
        });
    }
}
