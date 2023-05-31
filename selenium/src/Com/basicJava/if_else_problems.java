package Com.basicJava;

public class if_else_problems {
	public static void main(String args[]) {
		int var1 = 20;
		int var2 = 30;
		int var3 = 50;

		if (var1 < var2 && var1 < var3) {
			System.out.println("var1 value is greaterthan var2 and var3 values");
		}

		else if (var2 <var3) {
			System.out.println("var2 value is greaterthan var1 and var3 values");
		} else {
			System.out.println("var3 value is greaterthan var1 and var2 values");
		}

	}
}
