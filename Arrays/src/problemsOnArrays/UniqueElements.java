package problemsOnArrays;
import java.util.Scanner;

public class UniqueElements {

	public static void main(String[] args) {
		// program to remove duplicate elements and print the unique elements
		
		
				System.out.println("Enter number of Elements");
				Scanner sc =new Scanner(System.in);
				int n=sc.nextInt();
				System.out.println("Enter Elements");
				int arr[]=new int[n];
				for(int i=0;i<n;i++)
				{
				arr[i]=sc.nextInt();
				}
				
				for(int i=0;i<n;i++) {
				boolean duplicate= false	;
				for(int j=0;j<i;j++)
				{
					if(arr[i]==arr[j])
					{
						duplicate = true;
						break;
					}
				}
				if(!duplicate)
				{
					System.out.print(arr[i]);
				}
				
				
				
				}
			}

	}


