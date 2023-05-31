package Stringscompare;

public class Stringcompareexample {
	public static void main(String[] args) {
		String string1="Livetech";
		System.out.println("the valueofthe String1 is:"+string1);
		
		String string2="Livetech ";
		System.out.println("the valueofthe String2 is:"+string2);
		if(string1.equals(string2))
		{
			System.out.println("Both the String values string1 and string2 eqaul");
		}
		else {
			System.out.println("Both the String values string1 and string2 eqaul");
		    System.out.println("##################################");
		}
		String string5="SELENIM TOOLS";
		String string6="SELENIM TOOLS";
		if(string5.equals(string6))
		{
			System.out.println("both are string5 and string6 are same");
		}
		else
		{
			System.out.println("both are string5 and string6 are  not same");
		
		System.out.println("shiba coin");
		}
		
		String string7="Shiva acharya";
		String string8="SHIVA ACHARYA";
		if(string7.equalsIgnoreCase(string8))
		{
			System.out.println("both the String values string7 and string8 are equal");
		}
		else
			System.out.println("both the String values string7 and string8 are  not equal");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		String string9="SELENIUM";
		String string9LowerCasevalue=string9.toLowerCase();
		System.out.println("the value of the variable after converting to lowercase letter is:"+string9LowerCasevalue);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		
		String string10="webdriver";
		String string10UpperCasevalue=string10.toUpperCase();
		System.out.println("The value of the variable after converting to upper letter is:"+string10UpperCasevalue);
		
		String string11="shivaacharya";
		int string11Length=string11.length();
		System.out.println("the number of characters in the variable string11 are:" +string11Length);
		
				
	}

}
