package com.skapps.android.csicodathonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Details extends AppCompatActivity {
    TextView reviewTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        reviewTextView = (TextView) findViewById(R.id.reviewTextView);
        reviewTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Details.this," Go to Reviews ",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Details.this,ReviewList.class);
                startActivity(intent);
            }
        });
    }
}
