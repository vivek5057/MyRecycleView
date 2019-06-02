package com.example.acerpc.myrecyclevieww;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class MyCustomListView extends ArrayAdapter<String> {

    private Activity context;
    private String[] imageName;
    private String[] info;
    private Integer[] image;

    public MyCustomListView(Context context, String[] imageName, String[] info, Integer[] image) {
        super(context, R.layout.custom_list_view_activity,imageName);

        this.imageName=imageName;
        this.info=info;
        this.image=image;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.custom_list_view_activity, parent, false);
        }

        /*LayoutInflater layoutInflater = context.getLayoutInflater();
        View rowView = layoutInflater.inflate(R.layout.custom_list_view_activity,null,true);*/
        TextView titleText = (TextView) listItemView.findViewById(R.id.title);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.icon);
        TextView subtitleText = (TextView) listItemView.findViewById(R.id.subtitle);

        titleText.setText(imageName[position]);
        imageView.setImageResource(image[position]);
        subtitleText.setText(info[position]);

        return listItemView;
    }


}
