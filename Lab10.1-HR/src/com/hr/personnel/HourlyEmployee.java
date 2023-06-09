/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import gov.irs.IlligalWageException;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    // fields
    private double rate;
    private double hours;

    public static final double FEDERAL_MINIMUM_WAGE = 15.0;
    // constructors
    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);  // delegate to superclass ctor for name, hireDate
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) throws IlligalWageException {
        this(name, hireDate);   // delegate to neighboring ctor for name, hireDate
        setRate(rate);          // handle rate here, by delegating to setter
        setHours(hours);        // handle hours here, by delegating to setter
    }

    // business methods
    @Override
    public void pay() {
        System.out.println(getName() + " is paid hourly " + (getRate() * getHours()));
    }

    @Override  // interface TaxPayer
    public void payTaxes() {
        double taxes = getRate() * getHours() * HOURLY_TAX_RATE;
        System.out.println(getName() + " paid taxes of " + taxes);
    }

    // accessor methods
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) throws IlligalWageException {
        if(rate >= FEDERAL_MINIMUM_WAGE) {
            this.rate = rate;
        }
        else {
            throw new IllegalArgumentException(String.format("INVALID AMOUNT OF MONEY PLEASE RAISE"));
        }
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return super.toString() + ", rate=" + getRate() + ", hours=" + getHours();
    }
}