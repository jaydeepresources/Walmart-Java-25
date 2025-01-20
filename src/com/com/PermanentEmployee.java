package com.com;

public class PermanentEmployee extends Employee{

    int basic;
    float hra;
    float da;

    public PermanentEmployee(){

    }

    public PermanentEmployee(int id, String name, int basic) {
        super(id, name);
        this.basic = basic;
    }

    @Override
    public void findSalary() {
        hra = basic * 0.15f;
        da = basic * 0.12f;
        salary = basic + hra + da;
    }

    @Override
    public String toString() {
        return super.toString() + ", PermanentEmployee{" +
                "basic=" + basic +
                ", hra=" + hra +
                ", da=" + da +
                '}';
    }
}
