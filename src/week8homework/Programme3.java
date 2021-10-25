package week8homework;

import java.util.Scanner;

public class Programme3 {

    public static void main(String[] args) {

        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'u' || ch == 'o') {


        System.out.println("Enter character " + ch + " is vowel");

    }
    else if((ch >='a' && ch<='z')||(ch>='A'&&ch<='Z'))
            System.out.println("Entered character "+ch+" is Consonant");
	      else
                  System.out.println("Not an alphabet");
}
}

















