import java.util.Scanner; 

public class Main {
    
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        //create array and set length
         int[] myArr;
         myArr = new int[20];

        //for loop to populate array
        for (int i = 0; i < myArr.length; i++) {
            System.out.println("Enter a number: ");
            myArr[i] = myObj.nextInt();
        }
        
        int max = myArr[0];
        int min = myArr[0];
        double average = 0;
        int sum = 0;

        //for loop to go through array and set min/max and get sum
        for (int x = 0; x < myArr.length; x++) {
            //Check for max
            if (myArr[x] > max) {
                max = myArr[x];
            }
            
            //Check for min
            if (myArr[x] < min) {
                min = myArr[x];

            }
        
        //Add array item to sum
        sum += myArr[x];
        }

        //Calculate average
        average = sum / myArr.length;

        System.out.println("The maximum is: " + max);
        System.out.println("The minimum is: " + min);
        System.out.println("The average is: " + average);
        System.out.println("The sum is: " + sum);
    }
}