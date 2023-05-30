package com.example.lab2_pt;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class case3 extends Activity {

    EditText et_manv,et_tennv;
    Button btn_nhap;
    RadioGroup rg_loainv;
    ListView lv_nhanvien;
    ArrayList<Employee>arrEmployee=new ArrayList<Employee>();
    ArrayAdapter<Employee>adapter=null;

    Employee employee=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.case3);
        et_manv=(EditText) findViewById(R.id.et_manv);
        et_tennv=(EditText) findViewById(R.id.et_tennv);
        btn_nhap=(Button) findViewById(R.id.btn_nhap);
        rg_loainv=(RadioGroup) findViewById(R.id.rg_loainv);
        lv_nhanvien=(ListView) findViewById(R.id.lv_nhanvien);

        adapter=new ArrayAdapter<Employee>(this,
                android.R.layout.simple_list_item_1,
                arrEmployee);

        lv_nhanvien.setAdapter(adapter);

        btn_nhap.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                processNhap();
            }
        });
    }

    public void processNhap()
    {

        int radId=rg_loainv.getCheckedRadioButtonId();
        String id=et_manv.getText()+"";
        String name=et_tennv.getText()+"";
        if(radId==R.id.rb_chinhthuc)
        {

            employee=new EmployeeFullTime();
        }
        else
        {

            employee=new EmployeePartTime();
        }

        employee.setId(id);
        employee.setName(name);

        arrEmployee.add(employee);

        adapter.notifyDataSetChanged();
    }
}