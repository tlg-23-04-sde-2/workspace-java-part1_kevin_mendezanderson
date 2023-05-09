package mathhelp;
import mathhelp.Calculator;

class CalculatorClient {

    public static void main(String[] args) {
        double sum = Calculator.add(8,3);
        double sub = Calculator.subtract(3.1,5.1);

        System.out.println(sum);
        //System.out.println(sub);

        System.out.println("the sum is: " + Calculator.add(21,3213));
        //System.out.println("the difference is: " + cal.subtract(14,6));

        double input = 10;
        System.out.println( input + " is even? " + Calculator.isEven(input));

        System.out.println();

        System.out.println(Calculator.getRandomInt(5,20));

        System.out.println(Calculator.getAverage(3,5,9,9));
        System.out.println(Calculator.getAverage(1));
    }
}