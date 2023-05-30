package com.example.lab2_pt;

public class EmployeeFullTime extends com.example.lab2_pt.Employee {

    @Override
    public double TinhLuong() {
        return 500;
    }
    @Override
    public String toString() {

        return super.toString() +" -->FullTime="+TinhLuong();
    }
}
