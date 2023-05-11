package com.juanima.swapperandchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText a = findViewById(R.id.tb1);
        EditText b = findViewById(R.id.tb2);
        Button Swap = findViewById(R.id.btnSwap);
        Button Check = findViewById(R.id.btnCheck);

        Swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textTb1 = a.getText().toString();
                String textTb2 = b.getText().toString();

                a.setText(textTb2);
                b.setText(textTb1);
            }
        });

        Check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textTb1 = a.getText().toString();
                String textTb2 = b.getText().toString();

                String myMessage = "";
                if (textTb1.equals(textTb2)) {
                    myMessage = "SAME";
                }
                else {
                    myMessage = "NOT THE SAME";
                }

                Intent intent = new Intent(MainActivity.this, MyMessageActivity.class);
                intent.putExtra("Output", myMessage);
                startActivity(intent);
            }
        });
    }
}