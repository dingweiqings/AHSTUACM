package MathProblems;
import java.util.Arrays;
import java.util.Scanner;
public class P1200 {
	final static int m=200000;
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		int n=cin.nextInt();
		while(n-->0){
			int s[]=new int[3];
			for(int i=0;i<s.length;i++)
			 s[i]=cin.nextInt();
			int r[]=jie(s[0],s[1],s[2]);
			//System.out.println(-2%2);
			if(r[0]!=0)
				System.out.println(String.format("%d %d %d\n",r[0],r[1],r[2]));
			else
				System.out.println("Imppssible");
		}
	}
	cin.close();
}

private static int []jie(int a,int b,int c) {
	int []r=new int[3];
	int s0=a+b-c;
	int s1=a+c-b;
	int s2=b+c-a;
	if(s0>=2&&s1>=2&&s2>=2&&s0<=m&&s1<=m&&s2<=m&&s0%2==0&&
			s1%2==0&&s2%2==0){
	//if(s0%2==0&&s1%2==0&&s2%2==0){
		
	
		r[0]=s0/2;
	    r[1]=s1/2;
	    r[2]=s2/2;
	}
	Arrays.sort(r);
		return r;
	}

}
