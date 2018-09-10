package com.company;
import java.util.Scanner;

public class TomNJerry {

    public static void main(String[] args) {
	// write your code here

        // Take a Number from a user.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a No. :");
        int n = input.nextInt();

        if(n > 20 && n < 30 ){
            if( n % 2 == 0){
                System.out.println("Tom");
            }
            else{
                System.out.println("Jerry");
            }
        }
        else{
            System.out.println("Number is not in a limit");
        }
    }
}
