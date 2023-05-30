package com.example.lab2_pt;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class case2 extends Activity {
    EditText et_ten;
    TextView tv_selection;
    Button btn;
    ListView lv;
    ArrayList<String>arrList=null;
    ArrayAdapter<String> adapter=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.case2);


        et_ten=(EditText) findViewById(R.id.et_ten);
        tv_selection=(TextView) findViewById(R.id.tv_selection);

        lv=(ListView) findViewById(R.id.lv_person);

        arrList=new ArrayList<String>();

        adapter=new ArrayAdapter<String>
                (this,
                        android.R.layout.simple_list_item_1,
                        arrList);

        lv.setAdapter(adapter);
        arrList.add("Tèo");
        arrList.add("Tý");
        arrList.add("Bin");
        arrList.add("Bo");

        btn=(Button) findViewById(R.id.btn_nhap);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                arrList.add(et_ten.getText()+"");
                adapter.notifyDataSetChanged();
            }
        });

        lv.setOnItemClickListener(new AdapterView
                .OnItemClickListener() {
            public void onItemClick(
                    AdapterView<?> arg0,View arg1,
                    int arg2,long arg3) {

                tv_selection.setText("position : "+ arg2+
                        "; value ="+arrList.get(arg2));
            }
        });

        lv.setOnItemLongClickListener(new AdapterView
                .OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
                                           int arg2, long arg3) {
                arrList.remove(arg2);
                adapter.notifyDataSetChanged();
                return false;
            }
        });
    }
}