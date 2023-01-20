package Finally;

public class A {
	public static void main(String[] args) {
		int a=5;
		int b=0;
		try {
	
			System.out.println(a/b);
		}
		catch(ArithmeticException monkey) {
		
			System.out.println("pooja");
		}
		finally {
			System.out.println("thank you for using atm");
		}
	}

}
