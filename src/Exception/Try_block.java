package Exception;

public class Try_block {
	public static void main(String[] args) {
		int a=1;
		int b=0;
		int c=0;
		try {
			c=a/b;
		}
		catch(ArithmaticException donkey) {
			System.out.println("exception is handle");
		}
		
	}

}
