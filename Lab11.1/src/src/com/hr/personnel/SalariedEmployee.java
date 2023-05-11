package src.com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    //instance variable or fields
    private double salary;

    //constructors
    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }
    public SalariedEmployee(String name, LocalDate hireDate, double salary){
        this(name,hireDate);
        setSalary(salary);
    }
    //business methods
    @Override
    public void pay(){
        System.out.println(getName() + " is paid salary "+ getSalary());
    }

    @Override
    public void payTaxes(){
        System.out.println(getName() + " paid taxes of: " + (getSalary()*TaxPayer.SALARIED_TAX_RATE));
    }

    public void takeVacation(){
        System.out.println(getName() + "  is on vacation");
    }
    //accessor methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " salary="+ getSalary();
    }
}