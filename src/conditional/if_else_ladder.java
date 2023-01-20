package conditional;

public class if_else_ladder {
	public static void main(String[] args) {
		int marks=60;
		if(marks>=88) {
			System.out.println("pass with distingition");
		}
		else if(marks>=70){
			System.out.println("pass with 1St class");
		}
		else if(marks>=58){
			System.out.println("pass with 2nd class");
		}
		else if(marks>=35){
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}

}
