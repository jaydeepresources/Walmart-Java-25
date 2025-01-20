package com.com;

public abstract class Employee {

    int id;
    String name;
    float salary;

    public Employee(){

    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void findSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
