package method;

public class Nonstatic {
	public static void main(String[] args) {
		Nonstatic n=new Nonstatic();
		n.v1();		
		n.v2();
	}
	public  void v1() {
		System.out.println("i am nonstatic method v1");
		System.out.println("welcome");
		
	}
	public void v2() {
		System.out.println("i am nonstatic method v2");
		System.out.println("method");
		
	}


}
