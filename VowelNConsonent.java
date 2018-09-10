package com.company;
import java.util.Scanner;
public class VowelNConsonent {

    public static void main(String[] args) {
	// write your code here
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string");
        String str = input.nextLine();
        for(int i = 0 ; i<str.length() ; i++){
            ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch =='u'){
                System.out.print("vowel");
            }
            else{
                System.out.print("consonent");
            }
        }
    }
}
