package com.example.acerpc.myrecyclevieww;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static android.support.v7.widget.RecyclerView.*;

public class ExRecycleAdapter extends  RecyclerView.Adapter<ExRecycleAdapter.MyViewHolder>{

    //private DemoClass[] demoClass;
    //private String[] data;
    Context context;
    List<DemoClass> demoClass ;

    //public ExRecycleAdapter(DemoClass[] demoClass) {

    //}
    public ExRecycleAdapter(Context context, List<DemoClass> demoClass) {
        this.context=context;
        this.demoClass=demoClass;
    }

    @NonNull
    @Override
    //create view to store view
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //return view object
        /*LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View listItem = layoutInflater.inflate(R.layout.custom_list_view_activity,viewGroup,false);*/

        View v = LayoutInflater.from(context).inflate(R.layout.custom_list_view_activity,viewGroup,false);

        /*View listItem =
        MyViewHolder myViewHolder = new MyViewHolder(listItem);*/
        return new MyViewHolder(v);
    }

    //BindViews with data
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        DemoClass demoClasss = demoClass.get(i);
       // myViewHolder.imageName.setText(titletext);
        /*
        final DemoClass myDemoClass = demoClass[i];*/

        myViewHolder.imageName.setText(demoClasss.getImageName());
        myViewHolder.info.setText(demoClasss.getInfo());
        myViewHolder.image.setImageResource(demoClasss.getImage());

    }

    @Override
    public int getItemCount() {
        return demoClass.size();
    }



    public class MyViewHolder extends ViewHolder{
        TextView imageName;
        TextView info;
        ImageView image;

        public MyViewHolder(@NonNull View itemView)
        {
            super(itemView);
            this.imageName =  (TextView) itemView.findViewById(R.id.title);
            this.info = (TextView) itemView.findViewById(R.id.subtitle);
            this.image = (ImageView) itemView.findViewById(R.id.icon);

        }
    }

}
