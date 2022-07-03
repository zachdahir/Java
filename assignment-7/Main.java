//Name: Zachary Dahir
//Date: 4-26-22
//Assignment: 7
//Description: Password validator

import java.util.regex.*;
import java.util.Scanner;
class Main {
  
    public static boolean isValidPassword(String password)
    {
  
        // Regex to check for num, lowercase, uppercase, and min 8 char
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,20}$";
  
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(password);
        return m.matches();
    }
    
    public static String getPassword ()
    {
        Scanner input = new Scanner(System.in);

        //Get user input
        System.out.print("Enter Password:");
        System.out.print("");
        String password = input.nextLine();
        return password;
    }

    public static void main(String args[])
    {
        
        boolean valid = false;
        
        //Loop to check validity
        while (valid == false){
            String password = getPassword();
            valid = isValidPassword(password);
            if (valid == false) {
                System.out.println("Password is invalid");
            }
        }
        
        System.out.println("Password is valid");

    }

}
