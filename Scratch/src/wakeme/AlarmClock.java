package wakeme;

/*
 * Class definition to model the workings of an alarm clock.
 * This is called a business class or system class.
 * this class definition does not have a main method.
 * most classes do not.
 *
 */
class AlarmClock {
    //class level shared variables - these live in that shared/common area "above" that instances
    //there is only one copy of this up in that shared common area
    //final = fix .........static = shared
    public static final int MIN_INTERVAL = 1;
    public static final int MAX_INTERVAL = 20;
    // properties or attributes - called instance variables or fields in Java
    private int snoozeInterval = 5; // default value when the client doesn't specify one
    private int repeat = 1;         //default value when client doesn't specify


    //constructors
    public AlarmClock(){
        //set constructor for when no arguments are passed.
    }
    public AlarmClock(int snoozeInterval){
        setSnoozeInterval(snoozeInterval);      //delegate to setter for any validation
    }
    public AlarmClock(int snoozeInterval, int repeat){
        this(snoozeInterval);                   //delegate to ctor above for snoozeInterval
        setRepeat(repeat);                      //handle repeat myself, my delegating to its setter
    }


    //methods or functions - what do alarm clocks do?
    public void snooze() {
        System.out.println("snoozing..." + getSnoozeInterval() + " minutes");
    }

    //accessor methods - provide controlled access to the object fields
    //also called get/set methods.

    public int getSnoozeInterval() {
        return snoozeInterval;
    }
    //TODO: business constraint must be between 1-20 inclusive.
    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <=MAX_INTERVAL){
            this.snoozeInterval = snoozeInterval;
        }
        else {
            System.out.println("Invalid input: " + snoozeInterval + " must be between:" +
                    " " + MIN_INTERVAL + " and " + MAX_INTERVAL);
        }
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public String toString(){
        return "wakeme.AlarmClock: SnoozeInterval = " + getSnoozeInterval() + " my repeat is: "+getRepeat();
    }
}