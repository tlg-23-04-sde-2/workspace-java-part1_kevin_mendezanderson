package mathhelp;

/*
 * This is an All-static class. one that contains only static methods
 */
class Calculator {

    //add, subtract, isEven
    public static double add(double a, double b){
        return a+b;
    }
    //subtract method
    public static double subtract(double a, double b){
        return a-b;
    }

    public static boolean isEven(double a){

        return a%2 == 0;
    }

    /*
     * Returns a random integer between one and fourteen
     *
     * hint: see a class called math ( in package java.lang) look for a helpful method here
     * these methods in the math class are all static, which means you call them as Math.methodName()
     */
    public static int getRandomInt(){
     // delegates to the min-max version, passing 1 for the min and 14 for the max
        return getRandomInt(1,14);
    }
    public static int getRandomInt(int min, int max){
        double random = Math.random();
        int multiplier = max-min;
        double holdValue = Math.ceil(random*multiplier+min);
        int result = (int)holdValue;
        return result;
    }
    /*
     * Returns the average of the supplied integers
     */
    public static double getAverage(int first, int... rest){
        double result = 0.0;
        double sum = first;
        for (int value : rest){
            sum += value;
        }
        result = sum/(1 + rest.length);
        return result;
    }
}