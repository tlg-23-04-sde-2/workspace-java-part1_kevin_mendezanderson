package com.panion;

/*
 * An immutable class
 * more accurately. its a class definition written in such a way that
 * instances of it ( Person Objects) once created, can't have their properties changed.
 * in the code, this simply means no public setters.
 */

import java.time.LocalDate;
import java.time.Period;

class Person {
    private final String name;
    private final LocalDate birthday;

    //constructor
    public Person(String name, LocalDate birthday){
        this.name = name;
        this.birthday = birthday;
    }
    //getters
    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    /*
     * Returns the person's age in whole years.
     * Hint: see a class in package java.time that can help you return
     * the *period* of time between two dates.
     */

    public int getAge(){
        return Period.between(getBirthday(), LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Person is " + "name='" + getName()  + ", birthday=" + getBirthday() ;
    }
}