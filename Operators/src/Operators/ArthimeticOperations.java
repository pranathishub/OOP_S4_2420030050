package Operators;

import java.util.Scanner;

public class ArthimeticOperations {

	public static void main(String[] args) {
		// Perform addition, subtraction, multiplication, division, and modulus of two numbers.
       System.out.println("Enter 2 numbers");
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = a + b;
       System.out.println("Sum of " +a+ " and "+b+ " is " +c);
       int s = a - b;
       System.out.println("Difference of " +a+ " and "+b+ " is " +s);
       int m = a * b;
       System.out.println("Product of " +a+ " and "+b+ " is " +m);
       int d = a / b;
       System.out.println("Quotient of " +a+ " and "+b+ " is " +d);
       int mod = a % b;
       System.out.println("Remainder of " +a+ " and "+b+ " is " +mod);
       
       

	}

}
