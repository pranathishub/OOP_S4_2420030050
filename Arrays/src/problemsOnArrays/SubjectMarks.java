package problemsOnArrays;

import java.util.Scanner;

public class SubjectMarks {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		int arr[] =new int[6];
		System.out.println("enter student marks");
		for(int i=0;i<6;i++)
		{
			arr[i]=sc.nextInt();
		}
		int total=0;
		for(int i=1;i<6;i++)
		{
			total+=arr[i];
		}
		int avarage=total/6;
		for(int i=1;i<6;i++)
		{
			System.out.println("subject "+ i+" marks is  "+arr[i]);
		}
		System.out.println("total of the students is "+total);
		System.out.println("Average marks of the student is "+avarage);
		
		
		
		

	}

}