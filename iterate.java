package com.company;
import java.util.Scanner;
public class iterate {

    public static void main(String[] args) {
	// write your code
        Scanner input = new Scanner(System.in);
        System.out.println("enter a Number");
        int n = input.nextInt();
        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j <=i ; j++){
                System.out.print(i + " ");
            }
        }
    }
}
