package com.hr.client;

import com.hr.Employee;
import com.hr.WorkException;

public class EmployeeClient {

    public static void main(String[] args) {
        Employee emp = new Employee("Jon");

        try {
            emp.goToWork();
        } catch (WorkException e) {
            //System.out.println(e.getMessage());
            //e.printStackTrace();
            System.out.println(e.getCause());
        }

    }
}