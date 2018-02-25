package MathProblems;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class P1049 {
public static void main(String[] args) {
	Scanner cin=null;
//	try {
//		cin=new Scanner(new File("TestData/P1049"));
//	} catch (FileNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	cin=new Scanner(System.in);
	while(cin.hasNextLine()){
		 int n=cin.nextInt();
		 int shift=cin.nextInt();
		int [][]a=new int[n][n];
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[0].length;j++)
				a[i][j]=cin.nextInt();
		//System.out.println(a[2][1]);
		switch(shift){
		case 1:
			angle90(a);
			break;
		case 2:
			angle180(a);
			break;
		case 3:
			angle270(a);
			break;
		default:
			break;
		}
	}
	cin.close();
}

private static void angle270(int[][] a) {
	int [][]b=new int[a.length][a.length];
	for(int i=0;i<a.length;i++)
		for(int j=0;j<a[0].length;j++)
			b[i][j]=a[i][j];
	
	for(int i=0;i<b.length;i++)
		for(int j=0;j<b[0].length;j++)
			a[i][j]=b[a.length-1-j][i];
	
	for(int i=0;i<a.length;i++)
		for(int j=0;j<a[0].length;j++){
		System.out.print(a[i][j]+" ");
	        if(j==a.length-1)
			System.out.println();
		}
	
}

private static void angle180(int[][] a) {
	int [][]b=new int[a.length][a.length];
	for(int i=0;i<a.length;i++)
		for(int j=0;j<a[0].length;j++)
			b[i][j]=a[i][j];
	
	for(int i=0;i<b.length;i++)
		for(int j=0;j<b[0].length;j++)
			a[i][j]=b[a.length-1-i][a.length-1-j];
	
	for(int i=0;i<a.length;i++)
		for(int j=0;j<a[0].length;j++){
		System.out.print(a[i][j]+" ");
	        if(j==a.length-1)
			System.out.println();
		}
	
}

public static void angle90(int[][] a) {
	int [][]b=new int[a.length][a.length];
	for(int i=0;i<a.length;i++)
		for(int j=0;j<a[0].length;j++)
			b[i][j]=a[i][j];
	
	for(int i=0;i<b.length;i++)
		for(int j=0;j<b[0].length;j++)
			a[i][j]=b[j][a.length-1-i];
	
	for(int i=0;i<a.length;i++)
		for(int j=0;j<a[0].length;j++){
		System.out.print(a[i][j]+" ");
	        if(j==a.length-1)
			System.out.println();
		}
}
}
