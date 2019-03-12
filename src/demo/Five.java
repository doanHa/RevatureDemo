package demo;

public class Five {
	public static void main(String[] args) {
		char x = 'a';
		switch (x) {
		case 65: System.out.println("65"); break;
		case 97: System.out.println("97"); break;
		default: System.out.println("98"); break;
		// duplicate case is not allowed.
		//case 'a': System.out.println('a'); break;
		}
	}
}
