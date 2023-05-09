package ex.experiment;

import jdk.swing.interop.SwingInterOpUtils;

class PrimitivesTest {

    public static void main(String[] args) {
        int age = 31;
        System.out.println("age: "+age);

        long population = 8_000_000_000L;
        System.out.println("The population is: " + population);

        double weight = 135.5;
        System.out.println("Weight is: " + weight);

        boolean hasTwins = false;
        System.out.println("Has Twins true or false? " + hasTwins);

        char shirtSize = 'L';
        System.out.println("Your Shirt size is: " + shirtSize);

        // TODO: print the following sense (as a string)
        //the word "Belly" makes me laugh
        System.out.println("the word \"belly\" makes me laugh");

        int x = 3;
        System.out.println("x is: " + ++x);
    }
}