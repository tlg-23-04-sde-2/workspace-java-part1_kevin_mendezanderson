package wakeme;

/*
 * test class to verify correct behavior of our setter validation
 * BVT = boundary value testing
 * for a [1,20] range, you need to check:
 * 0,1 and 20,21
 */
class AlarmClockValidationTest {

    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();

        clock.setSnoozeInterval(1);                 //should stick. clock indeed has this value
        System.out.println("SnoozeInterval: "+ clock.getSnoozeInterval());

        clock.setSnoozeInterval(20);
        System.out.println("SnoozeInterval: "+ clock.getSnoozeInterval());

        clock.setSnoozeInterval(0);
        System.out.println("SnoozeInterval: "+ clock.getSnoozeInterval());

        clock.setSnoozeInterval(21);
        System.out.println("SnoozeInterval: "+ clock.getSnoozeInterval());
    }

}