package Arraysproblems;

public class singlearrayexample {
	private static final int index = 0;

	public static void main(String[] args) {
		int array1[]=new int[4];
		array1[0]=10;
		array1[1]=20;
		array1[2]=30;
		array1[3]=40;
		for(int index=0;index<4;index++)
		{
			System.out.println(array1[index]);
		}
		{
			System.out.println("####### Multidimenstional array ####################");
		}

		String array2[][]=new String[2][3];
		array2[0][0]="shiva";
		array2[0][1]="sindhu";
		array2[0][2]="vaishu";
		array2[1][0]="mohan";
		array2[1][1]="eknath";
		array2[1][2]="yamuna";
		//array2[2][0]="AP";
		//array2[2][1]="MP";
		//array2[2][2]="SHIVA";
		for(int row=0;row<=1;row++)
		{
           for(int column=0;column<=2;column++)
           {
			System.out.println(array2[row][column]);
		}
}
}
}