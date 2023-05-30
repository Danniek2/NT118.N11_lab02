package com.example.lab2_pt;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class case1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.case1);
        final String arr[]={"Tèo","Tý","Bin","Bo"};
        ListView lv=(ListView) findViewById(R.id.lv1_person);
        ArrayAdapter<String>adapter=new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, arr);
        lv.setAdapter(adapter);
        final TextView txt=(TextView) findViewById(R.id.tv_selection);
        lv.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {

                    public void onItemClick(AdapterView<?> arg0,
                                            View arg1,
                                            int arg2,
                                            long arg3) {
                        txt.setText("position :"+arg2+" ; value ="+arr[arg2]);

                    }
                });
    }
}