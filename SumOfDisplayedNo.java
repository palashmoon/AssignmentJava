package com.company;
import java.util.Scanner;

public class SumOfDisplayedNo {

    public static void main(String[] args) {
	// write your code here
        int sum = 0;
        Scanner input = new Scanner (System.in);
        System.out.println("enter the no. of interger as input ");
        int n = input.nextInt();
        Scanner in = new Scanner (System.in);
        System.out.println("enter no. in a array");
        int a[] = new int[n];
        for(int i = 0; i<a.length ; i++){
            a[i] = in.nextInt();

        }

        for(int i = 0 ; i< a.length ; i++){
            sum  =sum + a[i];
        }
        System.out.println(sum);
    }
}
