package Com.basicJava;

public class switchcase {
public static void main(String[] args) {
	int weekdays=6;
			System.out.println(weekdays);
			switch(weekdays)
	{
		case 1:
			System.out.println("monday");
		break;
		
		case 2:
			System.out.println("tuesday");
		break;
		case 3:
			System.out.println("wensaday");
		break;
		
		case 4:
			System.out.println("thusday");
		break;
		case 5:
			System.out.println("friday");
		break;
		
		case 6:
			System.out.println("saturday");
			
		default:
			System.out.println("Expression is not valid");
		
	}
}
}
