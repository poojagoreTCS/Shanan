package Finally;

public class finally1 {
	public static void main(String[] args) {
		int a=200;
		int b=0;
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException monkey) 
		{
			System.out.println("exception");
		}
		finally {
			System.out.println("handle the exception");
		}
	}

}
