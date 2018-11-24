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
	      }	}

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


private void PalindromeByGopi() {
	String original, reverse = ""; // Objects of String class
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

public void paLindromeByManivel() {
	String rev="";
	System.out.println("Enter the string");
	Scanner aal = new Scanner(System.in);
	String name = aal.next();
	int j=name.length();
	System.out.println(j);
	for (int i = j-1; i >=0; i--) {
		rev=rev+name.charAt(i);
	}
	if (name.equals(rev)) {
		System.out.println("String is palindrome");
	}
	else {
		System.out.println("String is not palindrome");
	}
	
}





// Shankar

public void palindromeShan() {

    String a, b = "";
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the string you want to check:");
    a = s.nextLine();
    int n = a.length();
    for(int i = n - 1; i >= 0; i--)
    {
        b = b + a.charAt(i);
    }
    if(a.equalsIgnoreCase(b))
    {
        System.out.println("The string is palindrome.");
    }
    else
    {
        System.out.println("The string is not palindrome.");
    }

}

// palindrome program Hari Prasath

public void palindromeHari() {

    String a, b = "";
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the string you want to check:");
    a = s.nextLine();
    int n = a.length();
    for(int i = n - 1; i >= 0; i--)
    {
        b = b + a.charAt(i);
    }
    if(a.equalsIgnoreCase(b))
    {
        System.out.println("The string is palindrome.");
    }
    else
    {
        System.out.println("The string is not palindrome.");
    }

}

public void sravya() {
	// TODO Auto-generated method stub
System.out.println("srvya");


	// TODO Auto-generated method stub
System.out.println("practice the test");
//>>>>>>> 5872b0db47512776340786aab9e610b47bf3e3f5
}



public static void palindrome_muthu_gsm() {
	// TODO Auto-generated method stub


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
      
}
}
public static void PalindromeByThangadurai() {
    String original, reverse = ""; 
    Scanner ab = new Scanner(System.in);
    
    System.out.println("Check entered string is a palindrome or not");
    System.out.println("new");
    original = ab.nextLine();
   
    int length = original.length();
   
    for (int i = length - 1; i >= 0; i--)
       reverse = reverse + original.charAt(i);
       
    if (original.equals(reverse))
       System.out.println("The string is a palindrome.");
    else
       System.out.println("The string isn't a palindrome.");
       
 }}
   
 

