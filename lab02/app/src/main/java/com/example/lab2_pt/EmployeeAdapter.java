package com.example.lab2_pt;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class EmployeeAdapter extends
        ArrayAdapter<Employee2>
{
    Activity context=null;
    ArrayList<Employee2>myArray=null;
    int layoutId;

    public EmployeeAdapter(Activity context,
                           int layoutId,
                           ArrayList<Employee2>arr){
        super(context, layoutId, arr);
        this.context=context;
        this.layoutId=layoutId;
        this.myArray=arr;
    }

    public View getView(int position, View convertView,
                        ViewGroup parent) {

        LayoutInflater inflater=
                context.getLayoutInflater();
        convertView=inflater.inflate(layoutId, null);

        Employee2 employee = getItem(position);
        TextView tvPosition = (TextView) convertView.findViewById(R.id.tv_position);
        LinearLayout llParent = (LinearLayout) convertView.findViewById(R.id.llparent);
        if(myArray.size()>0 && position>=0)
        {

            final TextView txtdisplay=(TextView)
                    convertView.findViewById(R.id.txtitem);

            final Employee2 emp=myArray.get(position);

            txtdisplay.setText(emp.toString());

            final ImageView imgitem=(ImageView)
                    convertView.findViewById(R.id.imgitem);

            if(emp.isGender())
            { imgitem.setVisibility(View.VISIBLE);
                imgitem.setImageResource(R.drawable.ic_manager);}
            else
            {tvPosition.setVisibility(View.VISIBLE);
                imgitem.setVisibility(View.GONE);
                tvPosition.setText("staff");}
            if (position%2==0)
                llParent.setBackgroundResource(R.color.white);
            else    llParent.setBackgroundResource(R.color.light_blue);
        }

        return convertView;
    }
}
