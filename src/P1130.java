import java.util.Scanner;


public class P1130 {
static int m=4;static int n=3;
	public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	int [][]A=new int [m][n];
	while(cin.hasNext()){
	for(int i=0;i<A.length;i++)
		for(int j=0;j<A[0].length;j++)
			A[i][j]=cin.nextInt();
	int []B=findMax(A);
	System.out.println(String.format("%d %d %d",B[0],B[1],B[2]));
}
	cin.close();
	}
	private static int[] findMax(int[][] a) {//ÕÒ¾ØÕó×î´óÖµ
		int max=a[0][0];
	
		int []B=new int[3];
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[0].length;j++)
                if(a[i][j]>max){
                	max=a[i][j];
                B[1]=i;
                B[2]=j;
                }
		B[0]=max;
				return B;
	
}
}
