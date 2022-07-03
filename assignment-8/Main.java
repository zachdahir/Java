//Name: Zachary Dahir
//Date: 5-02-22
//Assignment: 8
//Description: Overloading Methods

class Main {
    
    public static String yearlyService() {
        double ssCharge = 80.99;
        return ("Your standard service charge is $" + ssCharge);
    }

    public static String yearlyService(double oilChange) {
        double ssCharge = 80.99;
        double total = ssCharge + oilChange;

        return ("Your standard service charge is $" + ssCharge + " and your oil change fee is $" + String.format("%.2f", oilChange) 
        + ". Your total is $" + String.format("%.2f", total));
    }

    public static String yearlyService(double oilChange, double tireRotation) {
        double ssCharge = 80.99;
        double total = ssCharge + oilChange + tireRotation;

        return ("Your standard service charge is $" + ssCharge + " and your oil change fee is $" + String.format("%.2f", oilChange) 
        + ". The tire rotation fee is $" + String.format("%.2f", tireRotation) + ". Your total is $" + String.format("%.2f", total));
    }

    public static String yearlyService(double oilChange, double tireRotation, double coupon) {
        double ssCharge = 80.99;
        double total = ssCharge + oilChange + tireRotation - coupon;

        return ("Your standard service charge is $" + ssCharge + " and your oil change fee is $" + String.format("%.2f", oilChange) 
        + ". The tire rotation fee is $" + String.format("%.2f", tireRotation) + ". You have a coupon for $" + String.format("%.2f", coupon) + " Bringing your total to $" + String.format("%.2f", total));
    }

    public static void main(String[] args) {
       System.out.println("----Test Round 1----");
       System.out.println(yearlyService());
       System.out.println(yearlyService(60.25));
       System.out.println(yearlyService(60.25, 110.99));
       System.out.println(yearlyService(60.25, 110.99, 25));

       System.out.println("");

       System.out.println("----Test Round 2----");
       System.out.println(yearlyService());
       System.out.println(yearlyService(70));
       System.out.println(yearlyService(70, 60.50));
       System.out.println(yearlyService(70, 60.50, 20.25));

    }
}