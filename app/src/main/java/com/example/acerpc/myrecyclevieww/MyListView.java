package com.example.acerpc.myrecyclevieww;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MyListView extends AppCompatActivity {
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_activity);
        listView = findViewById(R.id.list_view_layout);

        ArrayList<String> lang = new ArrayList<String>();
        lang.add("Appsmind");
        lang.add("Appsmind");
        lang.add("Appsmind");
        lang.add("Appsmind");
        lang.add("Appsmind");
        lang.add("Appsmind");
        lang.add("Appsmind");
        lang.add("Appsmind");
        lang.add("Appsmind");
        lang.add("Appsmind");
        lang.add("Appsmind");
        lang.add("Appsmind");
        lang.add("Appsmind");
        lang.add("Appsmind");
        lang.add("Appsmind");
        lang.add("Appsmind");
        lang.add("Appsmind");
        lang.add("Appsmind");
        lang.add("Appsmind");
        lang.add("Appsmind");
        lang.add("Appsmind");

        lang.add("Appsmind");
        lang.add("Appsmind");
        lang.add("Appsmind");
        lang.add("Appsmind");
        lang.add("Appsmind");
        lang.add("Appsmind");
        lang.add("Appsmind");
        lang.add("Appsmind");
        lang.add("Appsmind");
        lang.add("Appsmind");
        lang.add("Appsmind");


        ArrayList<String> values = new ArrayList<String>();
        ArrayAdapter<String> listAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lang);
        listView.setAdapter(listAdapter);

           }



}
