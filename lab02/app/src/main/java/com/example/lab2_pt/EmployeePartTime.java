package com.example.lab2_pt;

public class EmployeePartTime extends Employee {

    @Override
    public double TinhLuong() {

        return 150;
    }
    @Override
    public String toString() {

        return super.toString() +" -->PartTime="+TinhLuong();
    }
}
