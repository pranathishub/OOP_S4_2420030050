package Operators;

import java.util.*;

public class Comparisons {

	public static void main(String[] args) {
		// Compare two integers and display which one is greater or if they are equal.
   System.out.println("Enter two numbers");
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int b = sc.nextInt();
   
 if(a>b) {
	System.out.println(a+ " is greater");
}
else if(a<b) {
	System.out.println(b+ " is greater");
}
else {
	System.out.println("Both numbers are equal");
}
	
	}

}
