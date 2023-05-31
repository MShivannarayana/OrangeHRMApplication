package selfcalculoator;

import java.util.Scanner;

public class caclucator2 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num1,num2,option;
	option =0;
	while(option!=5) {
		System.out.println("Enter 1st number:");
		num1 = sc.nextInt();
		System.out.println("Enter 2nd number");
		num2=sc.nextInt();
		System.out.println("1.additon \n 2.subtraction\n 3.multications \n 4.division \n 5.exit");
		option=sc.nextInt();
		switch(option ) {
		case 1:System.out.println("Addition: "+(num1+num2));
		break;
		case 2:System.out.println("substrations "+(num1-num2));
		break;
		case 3:System.out.println("multications"+(num1*num2));
		break;
		case 4:System.out.println("division"+(num1/num2));
		break;
		case 5: System.exit(5);
		break;
		//default: System.out.println("invalid operator...!");
		}
	}
		
 }
}
