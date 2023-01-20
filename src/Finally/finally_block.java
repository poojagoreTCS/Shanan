package Finally;

public class finally_block {
	public static void main(String[] args) {
		int y=4;
		int z=0;
		try {
			System.out.println(y/z);
		}
		catch(ArithmeticException monkey)
		{
			System.out.println("charu");
		}
		finally {
			System.out.println("good morning");
			
		}
	
		
	}

}
