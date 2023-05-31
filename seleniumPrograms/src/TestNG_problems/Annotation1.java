package TestNG_problems;

import org.testng.annotations.Test;

public class Annotation1 {
	
	public void method1()
	{
		System.out.println("*** method1 is excuted sucessfully***");
		
	}
	@Test
	public void method2()
	{
		System.out.println("*** method2 excuted sucessfully***");
	}
	@Test
	public void method3()
	{
		System.out.println("*** method3 excuted sucessfully***");
	}

}
