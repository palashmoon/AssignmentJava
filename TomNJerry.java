package com.company;
import java.util.Scanner;

public class TomNJerry {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("enter a no.");
        int n = input.nextInt();
        if(n>=20 && n<=30 ){
            if(n%2 == 0){
                System.out.println("tom");
            }
            else{
                System.out.println("jerry");
            }
        }
        else{
            System.out.println("not a proper number");
        }
    }
}
