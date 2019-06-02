package com.example.acerpc.myrecyclevieww;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivityRecycle extends AppCompatActivity {
   // List<DemoClass> list;
    ExRecycleAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);

        /*DemoClass[] demoClass = new DemoClass[]{
                new DemoClass("Title 1","SubInfo", android.R.drawable.ic_dialog_email),
                new DemoClass("Title 1","SubInfo", android.R.drawable.ic_dialog_email),
                new DemoClass("Title 1","SubInfo", android.R.drawable.ic_dialog_email),
                new DemoClass("Title 1","SubInfo", android.R.drawable.ic_dialog_email),
                new DemoClass("Title 1","SubInfo", android.R.drawable.ic_dialog_email),
                new DemoClass("Title 1","SubInfo", android.R.drawable.ic_dialog_email),
                new DemoClass("Title 1","SubInfo", android.R.drawable.ic_dialog_email),
                new DemoClass("Title 1","SubInfo", android.R.drawable.ic_dialog_email),
                new DemoClass("Title 1","SubInfo", android.R.drawable.ic_dialog_email),
                new DemoClass("Title 1","SubInfo", android.R.drawable.ic_dialog_email),
                new DemoClass("Title 1","SubInfo", android.R.drawable.ic_dialog_email),
                new DemoClass("Title 1","SubInfo", android.R.drawable.ic_dialog_email),
                new DemoClass("Title 1","SubInfo", android.R.drawable.ic_dialog_email),
                new DemoClass("Title 1","SubInfo", android.R.drawable.ic_dialog_email),
                new DemoClass("Title 1","SubInfo", android.R.drawable.ic_dialog_email),
        };*/



        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
       // exRecycleAdapter = new ExRecycleAdapter(this,list);
        adapter = new ExRecycleAdapter(this,getList());
       // String[] passTitle = {"Maruti","Honda","Hero","Bajaj","Mahindera","TATA"};
       // ExRecycleAdapter adapter = new ExRecycleAdapter(demoClass);
       /* layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);*/
        recyclerView.setAdapter(adapter);

    }

    public List<DemoClass> getList(){
        List<DemoClass> list = new ArrayList<>();
        String[] title =  {"VivekPandey","VivekPandey","VivekPandey","VivekPandey","VivekPandey","VivekPandey","VivekPandey","VivekPandey","VivekPandey","VivekPandey","VivekPandey","VivekPandey","VivekPandey","VivekPandey","VivekPandey","VivekPandey","VivekPandey","VivekPandey","VivekPandey","VivekPandey"};
        String[] subtitle = {"Jatin","Jatin","Jatin","Jatin","Jatin","Jatin","Jatin","Jatin","Jatin","Jatin","Jatin","Jatin","Jatin","Jatin","Jatin","Jatin","Jatin","Jatin","Jatin","Jatin"};
        Integer[] image = {R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background};
    for(int i=0;i<title.length;i++){
        DemoClass demoClass = new DemoClass(title[i],subtitle[i],image[i]);
        list.add(demoClass);
    }
    return  list;
    }
}
