//Name: Zachary Dahir
//Date: 3-16-22
//Assignment: 1
//Description: Show Difference between int and double

public class Main {
  public static void main(String[] args) {

  double ex1 = 4 * ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 );
  System.out.println(ex1);
  
  int ex2 = 4 * ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 );
  System.out.println(ex2);

  /* Int and double treat operations differently. If you us int to divide 1 by 3 you will get zero
  if you use doubles you will get 0.33. You need to know how you want your program to manipulate 
  the data and use the data type that suits your needs. */
  }
}