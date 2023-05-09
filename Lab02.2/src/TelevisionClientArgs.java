/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import java.util.Arrays;

/**
 * Intended usage (by human):
 *  $ java TelevisionClientArgs <brand> <volume> <display>
 * 
 * Example:
 *  $ java TelevisionClientArgs Samsung 32 PLASMA
 *
 * GOAL:
 *  Create an instance of Television with the specifications (values) provided by the user.
 */
class TelevisionClientArgs {

    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {
            String usage = "Usage: java TelevisionClientArgs <brand> <volume> <display>";
            String example = "Example: java TelevisionClientArgs Samsung 32 PLASMA";
            String note = "Note: supported displays are LED, OLED, LCD, CRT, PLASMA";
            String note2 = "Display type" + Arrays.toString(DisplayType.values());
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            return;  // early return from main(), application exits
        }

        // at this point, you can safely proceed, because you got your arguments
        // first, let's just show that we got them
        //System.out.println("You provided " + args.length + " arguments");

        //STEP 1 CONVERT THE ARGUMENTS TO VARIABLES
        String brand = args[0];
        int volume = Integer.parseInt(args[1]);
        DisplayType display = DisplayType.valueOf(args[2].toUpperCase());


        //STEP 2 CREATE A TELEVISION OBJECT FROM THESE INGRIDIENTS;
        Television tv = new Television(brand, volume, display);

        //STEP 3: PRINT IT AND CONGRATULATE THEM ON THEIR ORDER
        System.out.println("Congreatuations on your order");
        System.out.println(tv);
    }
}