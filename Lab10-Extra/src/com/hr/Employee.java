package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private final String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS

    /*
     * Option 4: Try catch and throw a different type of exception.
     * instead of throwing the low level infrastructure destination exception,
     * we'll throw a more suitable exception for our HR client.
     */

    public void goToWork() throws WorkException{
        Car c = new Car("VIN123","Honda", "Civic");
        c.start();
        try {
            c.moveTo("West seattle");
        } catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to get to work", e);        //Eis the nested "cause"
        }
        finally {
            c.stop();
        }
    }

    /*
     * Option 3: try-catch and "React in some way , Then throw it back to our client
     * this is sometimes a catch-and-rethrow
     */

    /*
    public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("VIN123","Honda", "Civic");
        c.start();
        try {
            c.moveTo("West seattle");
        } catch (DestinationUnreachableException e) {
            System.out.println("Send email to lisa Herbold to complain");
            throw e;
        }
        finally {
            c.stop();
        }
    }
     */

    /*
     * Option 2: "punt", not dealing with it, DO not handle the exception.
     * SINCE WE DONT HANDLE IT AND ITS CHECKED WE HAVE TO SAY THORWS
     */
    /*
    public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("VIN123","Honda", "Civic");
        c.start();
        try {
            c.moveTo("West seattle");
        }
        finally {
            c.stop();
        }

    }
     */

    /*
     * Option 1: try catch and handle
     */
   /* public void goToWork() {
        Car c = new Car("VIN123","Honda", "Civic");
        c.start();
        try {
            c.moveTo("West seattle");
        } catch (DestinationUnreachableException e) {
            System.out.println(e);      //toString() is automatically called
            System.out.println(e.getMessage());
        }
        finally {
            c.stop();
        }
    }
    */

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}