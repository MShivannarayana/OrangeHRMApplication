package Arraysproblems;

public class objectarrayproble {
	public static void main(String[] args) {
		Object array1[]=new Object[4];
		array1[0]=10;
		array1[1]="selenium";
		array1[2]="a";
		array1[3]=20.123;
		for(int index=0;index<4;index++) 
		{
			System.out.println(array1[index]);
		}
		System.out.println("###################################");
		for (int index=0;index<array1.length;index++)
		{
			System.out.println(array1[index]);
		}
		
	}
}
