package com.BLC.ELC;

public class PayrollSystem {
    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.setEmployeeId(101);
        emp.setEmployeeName("Rahul");
        emp.setSalary(30000);

        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Name: " + emp.getEmployeeName());
        System.out.println("Salary: " + emp.getSalary());

        // Update salary
        emp.setSalary(35000);
        System.out.println("Updated Salary: " + emp.getSalary());
    }
}