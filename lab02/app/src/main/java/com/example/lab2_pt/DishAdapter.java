package com.example.lab2_pt;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DishAdapter extends ArrayAdapter<com.example.lab2_pt.Dish> {
        private Activity context;
        private int layoutId;

        public DishAdapter(Activity context, int layoutID, List<com.example.lab2_pt.Dish> objects) {
            super(context, layoutID, objects);
            this.context = context;
            this.layoutId = layoutID;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(context).inflate(layoutId, null,
                        false);
            }


            com.example.lab2_pt.Dish dish = getItem(position);


            TextView tvName = (TextView) convertView.findViewById(R.id.tv_name);
            ImageView ivThumbnail = (ImageView) convertView.findViewById(R.id.iv_thumbnail);
            ImageView ivPromotion = (ImageView) convertView.findViewById(R.id.iv_promotion);


            if (dish.getThumbnail()!=null) {
                ivThumbnail.setImageResource(dish.getThumbnail().getImg());
            }


            if (dish.getDishName()!=null)
            {
                tvName.setText(dish.getDishName());
                tvName.setHorizontallyScrolling(true);
                tvName.setSelected(true);
            }


            if (dish.isPromotion())
            {
                ivPromotion.setVisibility(View.VISIBLE);
            }
            else
            {
                ivPromotion.setVisibility(View.GONE);
            }

            return convertView;
        }
    }

