package com.example.lab2_pt;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class case4 extends Activity {

    ArrayList<Employee2>arrEmployee=new ArrayList<Employee2>();

    EmployeeAdapter adapter=null;
    ListView lv_person=null;
    Button btn_add;
    EditText et_id,et_name;
    CheckBox cb_manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.case4);

        btn_add=(Button) findViewById(R.id.btn_add);
        et_id=(EditText) findViewById(R.id.et_id);
        et_name=(EditText) findViewById(R.id.et_name);
        cb_manager = findViewById(R.id.cb_manager);
        lv_person=(ListView) findViewById(R.id.lv_person);
        arrEmployee=new ArrayList<Employee2>();

        adapter=new EmployeeAdapter(
                this,
                R.layout.item_employee,
                arrEmployee);
        lv_person.setAdapter(adapter);

        btn_add.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                xulyNhap();
            }
        });

    }

    public void xulyNhap()
    {
        String ma=et_id.getText()+"";
        String ten=et_name.getText()+"";
        boolean gioitinh=false;//Nam =false
        if(cb_manager.isChecked())
            gioitinh=true;

        Employee2 emp=new Employee2();
        emp.setId(ma);
        emp.setName(ten);
        emp.setGender(gioitinh);

        arrEmployee.add(emp);

        adapter.notifyDataSetChanged();

        et_id.setText("");
        et_name.setText("");
        et_id.requestFocus();
    }



}