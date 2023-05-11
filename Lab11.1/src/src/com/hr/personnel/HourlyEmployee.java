package src.com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    //instance variables or fields
    private double rate;
    private double hours;

    //constructors
    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }
    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours){
        this(name, hireDate);
        setRate(rate);
        setHours(hours);
    }
    //business method
    @Override
    public void pay(){
        System.out.println(getName() +" is paid hourly. Total is: "+(getHours()*getRate()));
    }

    @Override
    public void payTaxes() {
        System.out.println(getName() + " paid taxes of: "+(getHours()*getHours()*TaxPayer.HOURLY_TAX_RATE));
    }

    //accessor methods
    public double getRate() {
        return rate;
    }

    public void setRate(double salary) {
        this.rate = salary;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    public String toString(){
        return super.toString() + " rate="+getRate() +" hours="+getHours();
    }
}