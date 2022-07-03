//Name: Zachary Dahir
//Date: 4-06-22
//Assignment: 4
//Description: Check for substring

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Get user input
        System.out.print("Enter a string: ");
        String s1 = input.nextLine();

        System.out.print("Enter another string: ");
        String s2 = input.nextLine();
        

        //Compare strings
        if (s1.indexOf(s2) > 1) {
            System.out.print(s2 + " does appear within " + s1);
        } else if (s2.indexOf(s1) > 1) {
            System.out.print(s1 + " does appear within " + s2);
        } else {
            System.out.print("No substrings");
        };
        
    }
}