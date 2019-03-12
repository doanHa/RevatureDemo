package demo;

public class Four {
	
	int factorial(int number) {
		if(number == 1)
			return number;
		else return number * factorial(--number);
	}
	
	public static void main(String[] args) {
		Four a = new Four();
		System.out.println(a.factorial(5));
	}
}
