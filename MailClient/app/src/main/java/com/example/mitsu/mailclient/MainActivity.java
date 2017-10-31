package com.example.mitsu.mailclient;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {

    EditText email , pass;
    Button button;
    String tag;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.et_email);
        pass = (EditText) findViewById(R.id.et_pass);
        button = (Button) findViewById(R.id.b_sign);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                final String text1 = email.getText().toString();
                String text2 = pass.getText().toString();

                if (text1.matches("") || text2.matches(""))
                {
                    Context context = MainActivity.this;
                    String textToShow = "Please fill all email and password";
                    Toast.makeText(context, textToShow, Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Context context1 = MainActivity.this;
                    String textToShow1 = "Welcome "+ text1;
                    Toast.makeText(context1, textToShow1, Toast.LENGTH_SHORT).show();
                    Thread thread2 = new Thread() {
                        @Override
                        public void run() {
                            try {

                                sleep(2000);
                                Intent intent = new Intent(getApplicationContext(), Signed.class);
                                startActivity(intent);
                                finish();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                    };

                    thread2.start();
                }
            }

        });
    }




}
