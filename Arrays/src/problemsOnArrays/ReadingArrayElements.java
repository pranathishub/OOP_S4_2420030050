package problemsOnArrays;

import java.util.Scanner;

public class ReadingArrayElements {

	public static void main(String[] args) {
		// program to read elements and print them on console
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		
     int arr[] = new int[n];
     System.out.println("Enter elements:");
     for(int i=0; i<n; i++) {
    	arr[i]=sc.nextInt();
   }
     
    for(int i=0;i<arr.length;i++) {
    	System.out.println(arr[i]);
    	
   }
	}

}
