package marksAvgGrades;

import java.util.Scanner;

public class AvgGrade{
	public static void main(String[] args) {
		int total,avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sub1 marks:\n sub2 marks:\n sub3 marks:\n sub4 marks:\n sub5marks");
		int sub1=sc.nextInt(),sub2=sc.nextInt(),sub3=sc.nextInt(),sub4=sc.nextInt(),sub5=sc.nextInt();
		total=sub1+sub2+sub3+sub4+sub5;
		System.out.println("total marks="+total);
		
		avg=total/5;
		System.out.println("avreage marks"+avg);
		if(avg>=90)
			System.out.println("your get 1st grade");
		else if(avg>=80 && avg<90)
			System.out.println("your get 0grade ");
		else if(avg>=70 && avg<80)
			System.out.println("your get A grade");
		else if(avg>=60 && avg>70)
			System.out.println("your get B grade");
		else if(avg>=50&& avg>60)
			System.out.println("your get C grade");
		else if(avg>=60&& avg>50)
			System.out.println("your get D grade");
		else
			System.out.println("fail,better luck next time");
			
		
	}

}
