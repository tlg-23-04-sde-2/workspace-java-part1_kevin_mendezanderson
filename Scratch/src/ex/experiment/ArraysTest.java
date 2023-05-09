package ex.experiment;

import java.util.Arrays;

class ArraysTest {

    public static void main(String[] args) {
        int[] ages = new int[4];
        ages[0] = 56;
        ages[1] = 10;
        ages[2] = 2;
        ages[3] = 2;
        System.out.println(Arrays.toString(ages));

        double[] temps = {65.0, 56.0, 83.3, 49, 98.6};
        for(double temp : temps) {
            System.out.println("Temp is:"+temp);
        }
        for (int i = 0; i < temps.length; i++){
            System.out.println("temps is="+temps[i]);
        }
    }

}