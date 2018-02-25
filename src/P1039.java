import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class P1039 {
public static void main(String[] args) {
	Scanner cin=null;
	try {
		cin=new Scanner(new File("TestData/P1039"));
	} catch (FileNotFoundException e) {
		cin=new Scanner(System.in);
	}
	while(cin.hasNext()){
		int n=cin.nextInt();
		int c=cin.nextInt();
		int []w=new int[n];
		for(int i=0;i<w.length;i++)
			w[i]=cin.nextInt();
		int []v=new int[n];
		for(int i=0;i<w.length;i++)
			v[i]=cin.nextInt();
		System.out.println(knap(n,c,w,v));
	}
	
}
public static int knap(int n,int c,int []w,int []v){
	int max=0;
	int [][]s=new int[c+1][n];
	for(int j=1;j<=c;j++)
		for(int i=1;i<n;i++){
			if(j<w[i]){
				s[i][j]=s[i-1][j];
				continue;
			}else if(s[i-1][j-w[i]]+v[i]>s[i-1][j])
			s[i][j]=s[i-1][j-w[i]]+v[i];
			else
				s[i][j]=s[i-1][j];
			max=j;
		}
	
	return max;
}
}
