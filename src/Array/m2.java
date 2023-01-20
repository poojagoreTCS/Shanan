package Array;

public class m2 {
	public static void main(String[] args) {
		int[][] ar=new int[2][2];
		ar[0][0]=100;
		ar[0][1]=200;
		ar[1][1]=300;
		ar[1][0]=400;
		for(int i=0;i<=1;i++)
			for(int j=0;j<=1;j++)
			{
				System.out.println(ar[i][j]+" ");
			}
		     System.out.println();
		}

}
