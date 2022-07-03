//Name: Zachary Dahir
//Date: 3-29-22
//Assignment: 23
//Description: Rock, Paper, Scissors

import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner rps = new Scanner(System.in);
        int min = 1;
        int max = 3;
        String move;
        String compMove;
        
        //Get user input
        System.out.print("Enter 1 for rock, 2 for paper, or 3 for scissors: ");
        int playerChoice = rps.nextInt();
        
        //Get computer choice
        int compChoice = (int) (Math.random()*(max-min)) + min;
        
        
        if (playerChoice == 1) {
            move = "Rock"; 
        } else if (playerChoice == 2){
            move = "Paper";
        } else {
            move = "Scissors";
        }
        
        if (compChoice == 1) {
            compMove = "Rock"; 
        } else if (compChoice == 2){
            compMove = "Paper";
        } else {
            compMove = "Scissors";
        }
        
        //Print selected choices
        System.out.print("You chose " + move + "\n");
        System.out.print("Computer chose " + compMove + "\n");
        
        //Check for winner and print outcome
        if (playerChoice == compChoice){
            System.out.print("Draw");
        } else if (playerChoice == 1 & compChoice != 2) {
            System.out.print("You win");
        } else if (playerChoice == 2 & compChoice != 3){
            System.out.print("You win");
        } else if (playerChoice == 3 & compChoice != 1){
            System.out.print("You win");
        } else {
            System.out.print("You lose");
        }
        
    }
}