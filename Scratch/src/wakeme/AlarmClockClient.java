package wakeme;

/*
 * this is a client "main-class"
 * This is a class definition with the main() method.
 * it will create a few instances of wakeme.AlarmClock and give them a basic test-drive
 */
class AlarmClockClient {

    // entry point or starting point for every standalone java application.
    public static void main(String[] args) {
        // create an instance of wakeme.AlarmClock ( an wakeme.AlarmClock object) and set its properties
        AlarmClock clock1 = new AlarmClock(7,5);

        //create a second instance of wakeme.AlarmClock and set its properties also
        AlarmClock clock2 = new AlarmClock(10);

        //third alarm clock object OR saying the same thing in difference word.
        AlarmClock clock3 = new AlarmClock();
        clock3.setSnoozeInterval(AlarmClock.MAX_INTERVAL);

        //make them snooze
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();
        //empty line
        System.out.println();
        //return information about clocks
        System.out.println(clock1);
        System.out.println(clock2);
        System.out.println(clock3);
    }
}