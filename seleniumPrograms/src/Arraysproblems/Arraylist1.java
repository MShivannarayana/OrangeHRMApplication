package Arraysproblems;

import java.util.ArrayList;
import java.util.List;

public class Arraylist1 {
	public static void main(String[] args) {
		List<Object>arraylist1 =new ArrayList();
	
		arraylist1.add(10);
		arraylist1.add("selenium");
		arraylist1.add("raviteja");
		arraylist1.add("shiva");
		
		/* System.out.println(arraylist1.get(0));
		 System.out.println(arraylist1.get(1));
		 System.out.println(arraylist1.get(2));
		 System.out.println(arraylist1.get(3));*/
		 
		
		for(int index =0;index<arraylist1.size();index++)
		{
			System.out.println(arraylist1.get(index));
		}
		{
			System.out.println("************************************");
			for(Object index:arraylist1)
			{
				System.out.println(index);
			}
				
		}
		
	}

}




