package com.example.lab2_pt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ThumbnailAdapter extends ArrayAdapter<com.example.lab2_pt.Thumbnail> {

    private Context context;

    public ThumbnailAdapter(Context context, int layoutId, List<com.example.lab2_pt.Thumbnail> objects) {
        super(context, layoutId, objects);
        this.context = context;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_thumbnail, null,
                    false);
        }


        com.example.lab2_pt.Thumbnail thumbnail = getItem(position);


        TextView tvName = (TextView)convertView.findViewById(R.id.tv_name);
        ImageView ivThumbnail = (ImageView) convertView.findViewById(R.id.iv_thumbnail);

        tvName.setText(thumbnail.getName());
        ivThumbnail.setImageResource(thumbnail.getImg());

        return convertView;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_selected_thumbnail, null,
                    false);
        }


        com.example.lab2_pt.Thumbnail thumbnail = getItem(position);


        TextView tvName = (TextView)convertView.findViewById(R.id.tv_name);

        tvName.setText(thumbnail.getName());
        tvName.setSelected(true);

        return convertView;
    }
}