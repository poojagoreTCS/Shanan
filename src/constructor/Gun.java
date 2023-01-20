package constructor;

public class Gun {
	String gunName;
	int noofbullets;
	public void shoot() {
		for(int i=1;i< noofbullets;i++) {
			System.out.println("dishum");
		}
	}
	class Gun1{
	public  void main(String []args) {
		Gun g1=new Gun();
		g1.gunName="ak47";
		g1.noofbullets=6;
		g1.shoot();
	}
		
    }

}
