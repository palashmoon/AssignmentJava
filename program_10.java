package com.company;
import java.util.Scanner;
public class program_10 {

    public static void main(String[] args) {
	// write your code here
        int i;
        int subno;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string");
        String str = input.nextLine();

        Scanner in  = new Scanner(System.in);
        System.out.println("enter a no.");
        int n = in.nextInt();

        char[] chars = str.toCharArray();
        int p = chars.length;
        subno = p-n;

        System.out.print(str);
        for(i = 0 ; i<n ; i++){
            System.out.print(str.substring(subno));
        }
    }
}
