//Zachary Dahir
//Assignment 10
//5-18-22
//Average Calculater

public class AverageCalculator {
    public static int average(int [] array){
        int average = 0;
        int sum = 0;

        System.out.println("---Integer Array---");

        //Display array and get sum
        for (int x = 0; x < array.length; x++) {
            System.out.println(array[x]);
            sum += array[x];
        }

        //Calculate average
        average = sum / array.length;
        return average;
    }
    
    public static double average(double [] array){
        double average = 0;
        double sum = 0;

        System.out.println("---Double Array---");
        
        //Display array and get sum
        for (int x = 0; x < array.length; x++) {
            System.out.println(array[x]);
            sum += array[x];
        }

        //Calculate average
        average = sum / array.length;
        return average;
    }
    
    public static long average(long [] array){
        long average = 0;
        long sum = 0;
        
        System.out.println("---Long Array---");

        //Display array and get sum
        for (int x = 0; x < array.length; x++) {
            System.out.println(array[x]);
            sum += array[x];
        }

        //Calculate average
        average = sum / array.length;
        return average;
    }
    
    public static short average(short [] array){
        short average = 0;
        short sum = 0;
        
        System.out.println("---Short Array---");

        //Display array and get sum
        for (int x = 0; x < array.length; x++) {
            System.out.println(array[x]);
            sum += array[x];
        }

        //Calculate average
        average = (short) (sum / array.length);
        return average;
    }

    public static void main(String[] args){
        int[] intArr = {1, 2, 3, 4, 5};
        double[] doArr = {1.25, 2.65, 3.56, 4.72, 5.39, 6.15};
        long[] loArr = {126354584, 213214465, 354564687, 456545223, 57898764, 65454554, 75656551};
        short[] shArr = {15464, 23122, 3545, 4564, 5354, 6754, 7568, 8125};
        
        int intAverage = average(intArr);
        System.out.println("The average is: " + intAverage);
        System.out.println("");

        double doAverage = average(doArr);
        System.out.println("The average is: " + doAverage);
        System.out.println("");

        long loAverage = average(loArr);
        System.out.println("The average is: " + loAverage);
        System.out.println("");

        short shAverage = average(shArr);
        System.out.println("The average is: " + shAverage);
        System.out.println("");
    }
}
