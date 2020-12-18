package com.skapps.android.csicodathonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ReviewList extends AppCompatActivity {
    Dialog writeReviewDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_list);
        writeReviewDialog = new Dialog(this);
        LinearLayout reviewLayout = (LinearLayout)findViewById(R.id.linearLayout_reviewList);
        reviewLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeReviewDialog.setContentView(R.layout.write_review_dialog);
                Button submit;
                submit = (Button) writeReviewDialog.findViewById(R.id.submit_button);
                submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeReviewDialog.dismiss();
                    }
                });
                writeReviewDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                writeReviewDialog.show();
            }
        });
    }
}
