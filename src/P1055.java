import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class P1055 {
public static void main(String[] args) {
	Scanner cin=null;
	try {
		cin=new Scanner(new File("TestData/P1055"));
	} catch (FileNotFoundException e) {
	cin=new Scanner(System.in);
	}
	while(cin.hasNext()){
	int  pa=cin.nextInt();
   int qa=cin.nextInt();
   if(pa==0&&qa==0)
	  break;	
int [][]A=readMatrix(pa,qa,cin);
int  pb=cin.nextInt();
int qb=cin.nextInt();
if(pb==0&&qb==0)
	  break;
int [][]B=readMatrix(pb,qb,cin);
int  pc=cin.nextInt();
int qc=cin.nextInt();
if(pc==0&&qc==0)
	  break;
int [][]C=readMatrix(pc,qc,cin);
		/*for(int i=0;i<C.length;i++)		
			for(int j=0;j<C[0].length;j++)
			System.out.print(String.format("%d ",C[i][j]));*/
		if(isCorrect(A,B,C))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
public static int [][] readMatrix(int p,int q,Scanner cin){
int [][]A=new int[p][q];
for(int i=0;i<A.length;i++)
	for(int j=0;j<A[0].length;j++)
		A[i][j]=cin.nextInt();
return A;
}
public static boolean  isCorrect(int [][]A,int [][]B,int [][]C){
if(A[0].length==B.length&&equal(times(A,B), C))
return true;
	return false;
	
}
private static boolean equal(int[][] A, int[][] B) {//判断两个矩阵(二维数组)是否相等
	if(A.length!=B.length||(A[0].length!=B[0].length))
		return false;
	for(int i=0;i<A.length;i++)
		for(int j=0;j<A[0].length;j++)
			if(A[i][j]!=B[i][j])
				return false;
	return true;
}
public static int[][]times(int [][]A,int [][]B){//求矩阵的乘积
	int [][]C=new int[A.length][B[0].length];
	for(int i=0;i<A.length;i++)		
			for(int k=0;k<A[0].length;k++)
				for(int j=0;j<B[0].length;j++)
			C[i][j]=C[i][j]+A[i][k]*B[k][j];

			return C;
}
}
