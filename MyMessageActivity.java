package com.juanima.swapperandchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MyMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymessage);

        TextView textView = findViewById(R.id.tv1);

        Intent intent = getIntent();
        String myMessage = intent.getStringExtra("Output");
        textView.setText(myMessage);
    }
}