package com.company;
import java.util.Scanner;
import java.util.Random;

public class CheckCorrectNumber {

    public static void main(String[] args) {
	// write your code here
        Random rand = new Random();
        int n = rand.nextInt(50)+1;

//        Scanner input = new Scanner(System.in);
//        System.out.println("enter a number you want:");
//        int num = input.nextInt();

        while(true){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a number you want:");
            int num1 = in.nextInt();

            if(num1 == n){
                System.out.println("Number guessed is same as the original number");
                break;
            }
            else if(num1 > n){
                System.out.println("Number guessed is more than original number");
            }
            else{
                System.out.println("Number guessed is less than original number");
            }
        }
    }
}
