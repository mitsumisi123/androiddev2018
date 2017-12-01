package com.example.quickstart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class go extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;
    public Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        listView = (ListView) findViewById(R.id.list_home);
        intent = this.getIntent();
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this, R.layout.single_row,R.id.textView, intent.getStringArrayListExtra("go_inbox"));


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent1 = new Intent(go.this,messInbox.class);

        intent1.putExtra("content",intent.getStringArrayListExtra("mes_list").get(position));


        startActivity(intent1);



    }





    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.Send) {
            Intent intent3 = new Intent(go.this,Send.class);
            startActivity(intent3);
            return true;
        }

        if (id == R.id.Setting) {
            Toast.makeText(this, "Nothing to show", Toast.LENGTH_LONG).show();
            return true;
        }

        if (id == R.id.About) {
            Toast.makeText(this, "Group MobiApp", Toast.LENGTH_LONG).show();
            return true;
        }

        if (id == R.id.ContactUs) {
            Toast.makeText(this, "mitsumisi123@gmail.com", Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}