package com.example.acerpc.myrecyclevieww;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    Button listView;

    Button clistView;

    Button rlistView;

    Button webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView= (Button) findViewById(R.id.list_view);
        clistView=(Button) findViewById(R.id.custom_list_view);
        rlistView=(Button) findViewById(R.id.recycler_list_view);
        webView=(Button) findViewById(R.id.web_view);

        webView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent click = new Intent(MainActivity.this,MyWebView.class);
                startActivity(click);
            }
        });

        listView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent click = new Intent(MainActivity.this,MyListView.class);
                startActivity(click);
            }
        });

        clistView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent click = new Intent(MainActivity.this,MainActivityCustomListView.class);
                startActivity(click);
            }
        });

        rlistView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent click = new Intent(MainActivity.this,MainActivityRecycle.class);
                startActivity(click);
            }
        });
    }



}
