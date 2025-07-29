package Operators;

public class CompoundAssignmentOperators {

	public static void main(String[] args) {
		//Demonstrate compound assignment operators on a number.
           int num = 10;
           num += 5;
           System.out.println("Result after +=5 is: "+num);
           
           num-= 3;
           System.out.println("Result after -=3 is: "+num);
           
           num *= 4;
           System.out.println("Result after *=4 is: "+num);
           
           num /= 2;
           System.out.println("Result after /=2 is: "+num);
           
           num %= 5;
           System.out.println("Result after %=5 is: "+num);
           
           
           
	}

}
