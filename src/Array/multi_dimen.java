package Array;

public class multi_dimen {
	public static void main(String[] args) {
		int[][] i=new int[2][2];
		i[0][0]=10;
		i[0][1]=20;
		i[1][0]=30;
		i[1][1]=40;
		//System.out.println();
		for(int k=0;k<=1;k++) {
			for(int l=0;l<=1;l++) {
			System.out.println(i[k][l]);
		}
			System.out.println();
	}
		
	}

}
