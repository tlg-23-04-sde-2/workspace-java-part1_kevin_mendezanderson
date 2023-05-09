/*
 * Client-side main class to create a few instances of television and give them a basic test drive.
 */
class TelevisionClient {

    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances");
        Television tv1 = new Television("Samsung",30);
        Television tv2 = new Television("Visio");
        Television tv3 = new Television();
        //setting the attributes
        //calling the methods
        //turning on TVs
        tv1.TurnOn();
        tv2.TurnOn();
        tv3.TurnOn();
        //turning off TVs
        System.out.println();
        tv1.TurnOff();
        tv2.TurnOff();
        tv3.TurnOff();
        //calling toString method/function
        System.out.println();
        System.out.println(tv1.toString());
        System.out.println(tv2.toString());
        System.out.println(tv3.toString());
        System.out.println(Television.getInstanceCount() + " instances");
    }
}