package com.company;
import java.util.Scanner;
public class reverseString {

    public static void main(String[] args) {
	// write your code here
        int i;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string");
        String str = input.nextLine();

        char[] chars = str.toCharArray();
      //  System.out.println(chars.length);

        for(i = chars.length-1  ; i>=0; i--){
            System.out.print(chars[i]);
        }

    }
}
