package com.company;
import java.util.Scanner;
public class palindrom {

    public static void main(String[] args) {
	// write your code here
       long old ,  reminder;
        for(int i=0 ; i<3 ; i++) {
        long newNum = 0;
        long sum = 0 ;
        System.out.println("enter the value n");
        Scanner input = new Scanner(System.in);
       long n = input.nextLong();
         old = n;

            while (n != 0) {
                reminder = n % 10;
                newNum = newNum * 10 + reminder;
                n = n / 10;
                if(reminder%2 == 0){
                     sum =sum + reminder;
                }
            }
            if (old == newNum ) {
                System.out.println("palindrome ");
                if(sum > 25){
                    System.out.println("sum is greter than 25");
                }
            } else {
                System.out.println("not a palindrome");
            }
        }
    }
}
