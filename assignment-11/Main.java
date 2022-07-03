//Zachary Dahir
//Assignment 11
//5-25-22
//Find min and max values of two dimensional  arrays

public class Main {

    //Find largest value in double array
    public static int [] locateLargest (double [][] arrayParam){
        int[] location = new int[]{0, 0};
        double largest = arrayParam[0][0];
        
        //interate row
        for (int row = 0; row < arrayParam.length; row++) {
            //iterate column
          for (int col = 0; col < arrayParam[row].length; col++) {
              //check if element is larger
            if (largest < arrayParam[row][col]) {
              largest = arrayParam[row][col];

              //set location of largest
              location[0] = row;
              location[1] = col;
            }
          }
        }
      return location;
    }

    //Find largest value in int array
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = new int[]{0, 0};
        int largest = arrayParam[0][0];
        
        //interate row
        for (int row = 0; row < arrayParam.length; row++) {
            //iterate column
          for (int col = 0; col < arrayParam[row].length; col++) {
              //check if element is larger
            if (largest < arrayParam[row][col]) {
              largest = arrayParam[row][col];

              //set location of largest
              location[0] = row;
              location[1] = col;
            }
          }
        }
      return location;
    }

    //Find smallest value in double array
    public static int [] locateSmallest (double [][] arrayParam) {
        int[] location = new int[]{0, 0};
        double smallest = arrayParam[0][0];
        
        //interate row
        for (int row = 0; row < arrayParam.length; row++) {
            //iterate column
          for (int col = 0; col < arrayParam[row].length; col++) {
              //check if element is smaller
            if (smallest > arrayParam[row][col]) {
              smallest = arrayParam[row][col];

              //set location of smallest
              location[0] = row;
              location[1] = col;
            }
          }
        }
      return location;
    }

    //Find smallest value in int array
    public static int [] locateSmallest (int [][] arrayParam){
        int[] location = new int[]{0, 0};
        int smallest = arrayParam[0][0];
        
        //interate row
        for (int row = 0; row < arrayParam.length; row++) {
            //iterate column
          for (int col = 0; col < arrayParam[row].length; col++) {
              //check if element is smaller
            if (smallest > arrayParam[row][col]) {
              smallest = arrayParam[row][col];

              //set location of smallest
              location[0] = row;
              location[1] = col;
            }
          }
        }
      return location;
    }

  public static void main (String[]args) {
    
    //Create two-dimensional int array
    int[][] intTable = null;
    intTable = new int[][]
    {
      {10, 50000, 30},
      {4, 5, 10},
      {7, 80000, 9}
    };

    //Create two-dimensional double array
    double[][] doubleTable = null;
    doubleTable = new double[][] 
    {
        {2.45, 9.32, 7.45},
        {754.26, 845.23, 1.27},
        {898.56, 454.78, 89.56}
    };
  
    //Print largest int
    int[] intMax = locateLargest (intTable);
    System.out.println("The largest number in the integer array is element:");
    System.out.println ("(" + intMax[0] + ", " + intMax[1] + "): " + intTable[intMax[0]] [intMax[1]]);
    System.out.println("");

    //Print largest double
    System.out.println("The largest number in the double array is element:");
    int[] doubleMax = locateLargest(doubleTable);
    System.out.println("(" + doubleMax[0] + ", " + doubleMax[1] + "): " + doubleTable[doubleMax[0]] [doubleMax[1]]);
    System.out.println("");

    //Print smallest int
    System.out.println("The smallest number in the integer array is element:");
    int[] intMin = locateSmallest(intTable);
    System.out.println("(" + intMin[0] + ", " + intMin[1] + "): " + intTable[intMin[0]] [intMin[1]]);
    System.out.println("");

    //Print smallest double
    System.out.println("The smallest number in the double array is element:");
    int[] doubleMin = locateSmallest(doubleTable);
    System.out.println("(" + doubleMin[0] + ", " + doubleMin[1] + "): "  + doubleTable[doubleMin[0]] [doubleMin[1]]);
    }
} 