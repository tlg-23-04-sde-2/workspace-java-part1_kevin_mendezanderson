/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package src.com.hr.personnel.client;

import src.com.hr.personnel.Department;
import src.com.hr.personnel.Executive;
import src.com.hr.personnel.HourlyEmployee;
import src.com.hr.personnel.SalariedEmployee;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        SalariedEmployee emp = new SalariedEmployee();
        emp.takeVacation();

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24),2000.0));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2),35.0,10.0));
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(2000,1,1),1250.0));
        dept.addEmployee(new HourlyEmployee("Clark",LocalDate.of(2010,8,9),25.0,29));
        dept.addEmployee(new Executive("Jay", LocalDate.of(2022,2,2),250_000.0));
        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        //pay ALL employees
        System.out.println("\nPay employees");
        dept.payEmployees();

        //Force holiday break
        System.out.println("\nForced holiday break");
        dept.holidayBreak();
    }
}