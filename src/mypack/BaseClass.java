package mypack;

import java.util.Scanner;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void palindromeByGanesh() {

	}
	
	public void palindromeBySriram(){
		
	}
	
	public static void PalindromeMeena() {
		String s, rev = "";
	      Scanner in = new Scanner(System.in);
	     
	      System.out.println("Enter a string");
	      s = in.nextLine();
	     
	      int length = s.length();
	     
	      for (int i = length - 1; i >= 0; i--) {
	         rev = rev + s.charAt(i);
	      }
	      if (s.equals(rev)) {
	    	  System.out.println("The string is a palindrome.");  
	      }
	         
	      else {
	         System.out.println("The string isn't a palindrome.");
	      }}

public static void PalindromeRanjitha() {
    String original, reverse = ""; 
    Scanner ab = new Scanner(System.in);
    
    System.out.println("Check entered string is a palindrome or not");
    original = ab.nextLine();
   
    int length = original.length();
   
    for (int i = length - 1; i >= 0; i--)
       reverse = reverse + original.charAt(i);
       
    if (original.equals(reverse))
       System.out.println("The string is a palindrome.");
    else
       System.out.println("The string isn't a palindrome.");
}    
 }
