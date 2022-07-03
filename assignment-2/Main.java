//Name: Zachary Dahir
//Date: 3-22-22
//Assignment: 2
//Description: Joules calculater

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
         Scanner myObj = new Scanner(System.in);

         //Get mass
         System.out.println("Enter the water mass in kilograms: ");
         double waterMass = myObj.nextDouble();
         System.out.println("");
         
         //Get inital temp
        System.out.println("Enter the inital water temperature in celcius: ");
        double initialTemperature = myObj.nextDouble();
        System.out.println("");
        
        //Get final temp
        System.out.println("Enter the final water temperature in celcius: ");
        double finalTemperature = myObj.nextDouble();
        System.out.println("");
        
        //Calulate joules
        double joules = waterMass * ( finalTemperature - initialTemperature ) * 4184;
        
        System.out.println("It will take " + joules + " joules to heat the water to " + finalTemperature + " degrees celcius");
    }
}