package com.example.counterappfirst;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView countView, titleView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countView = findViewById(R.id.count);
        titleView = findViewById(R.id.title);
    }
    public void increase(View view) {
        int newValue = Integer.parseInt(countView.getText().toString()) + 1;
        display(newValue, 'i');
    }

    public void decrease(View view) {
        int oldValue = Integer.parseInt(countView.getText().toString());
        int newValue = oldValue - 1;
        if(newValue < 0) {
            newValue = 0; // Set to zero if result is negative
        }
        display(newValue, 'd');
    }

    @SuppressLint("DefaultLocale")
    private void display(int newValue, char action) {
        String newTitle = action == 'i'? "Increased":"Decreased";
        titleView.setText(newTitle);
        countView.setText(String.format("%d", newValue));

    }

}