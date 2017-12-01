package com.example.quickstart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class messInbox extends AppCompatActivity {

    private TextView textView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mess_inbox);
        Intent intent = this.getIntent();
        textView = (TextView) findViewById(R.id.textMess);
        textView.setText(intent.getStringExtra("content"));

    }
}
