package com.company;
import java.util.Scanner;
public class VowelNConsonent {

    public static void main(String[] args) {
	// write your code here
        char ch;
        //take string from a user.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();

        // this is a loop to check if the char entered is Vowel or Consonent.

        for(int i = 0 ; i<str.length() ; i++){
            ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch =='u'){
                System.out.print("Vowel" + " ");
            }
            else{
                System.out.print("Consonent" + " ");
            }
        }
    }
}
