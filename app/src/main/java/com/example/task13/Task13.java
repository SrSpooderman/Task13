package com.example.task13;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Task13 extends AppCompatActivity {
    private Button button_addCommend;
    private EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task13activity);

        button_addCommend = (Button)findViewById(R.id.add_comment);
        text = (EditText) findViewById(R.id.article);
        text.setEnabled(false);
        button_addCommend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.isEnabled()){
                    text.setEnabled(false);
                }else {
                    text.setEnabled(true);
                }
            }
        });
    }
}
