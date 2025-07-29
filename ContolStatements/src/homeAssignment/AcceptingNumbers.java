package homeAssignment;
import java.util.*;

public class AcceptingNumbers {

	public static void main(String[] args) {
		// Accept numbers until user enters 0.
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = 1;		
		while(num != 0) {
			num = sc.nextInt();
		
		if(num != 0) 
			System.out.println("You entered: "+num);
		else 
			System.out.println("Program ended, you entered ZERO");


		}

	}

}
