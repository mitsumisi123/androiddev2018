package com.example.mitsu.mailclient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ImageView;
import android.widget.TextView;

public class Signed extends AppCompatActivity {

    ImageView imageView ;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signed);

        imageView = (ImageView) findViewById(R.id.image_mail);
        textView = (TextView) findViewById(R.id.mail_names);

        String[] Mails = addMail.getMail();
        ImageView[] Image;

        for (String Mail : Mails) {
            textView.append(Mail + "\n\n\n");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

}
