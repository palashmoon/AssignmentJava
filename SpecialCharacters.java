package com.company;
import java.util.Scanner;

public class SpecialCharacters {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("enter a character:");
        char ch = input.next().charAt(0);
        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Capital");
        }
        else if(ch >= 'a' && ch<= 'z'){
            System.out.println("small characters");
        }
        else if(ch >= '0' && ch <='9'){
            System.out.println("digits");
        }
        else{
            System.out.println("special characters");
        }
    }
}
