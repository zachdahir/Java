//Name: Zachary Dahir
//Date: 4-11-22
//Assignment: 5
//Description: While loops

class Main {
    public static void main(String[] args) {
        //Initialize varibles
        double i = 3.0;
        double sum = 0;
        double sum1 = 0;
        double x;
        
        //Incrementing while loop
        while (i <= 99.0) {
            x = 1 / i;
            sum += x;
            i += 2;
        }
        //Print sum
        System.out.println("The incrementing sum is " + sum);
        
        //Reset varibles for next loop
        x = 0;
        i = 99.0;

        //Decrementing while loop
        while (i >= 3.0) {
            x = 1 / i;
            i -= 2;
            sum1 += x;
        }
        //Print sum
        System.out.println("The decrementing sum is " + sum1);
    }
}