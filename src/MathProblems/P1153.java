package MathProblems;
/*
 * Time Limit:1000MS  Memory Limit:65536K
Total Submit:259 Accepted:62

Description

һ���ܼ򵥵����⣬��1^p+2^p+3^p+����+n^p�ĺ͡�

Input

��һ�е���һ������t��ʾ������������������������t�����֣�ÿ�а�����������n,p�� 
���뱣֤0< n< =1000,0< =p< =1000�� 

Output

���1^p+2^p+3^p+����+n^p��10003ȡ��Ľ����ÿ���������ռһ�С� 

Sample Input


2
10 1
10 2

Sample Output


55
385
 */
import java.util.Scanner;
public class P1153 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		int m=cin.nextInt();
		while(m-->0){
			long sum=0;
		int n=cin.nextInt();
		int p=cin.nextInt();
		
	for(int i=1;i<=n;i++)
		sum=(1L*sum+NpowerP(i,p,10003));
	System.out.println(sum%10003);
		}
	}
	cin.close();
}
public static long NpowerP(int n,int p,int d){//long (������������ģ)
 long s=n%d;
		if(p==1) 
			return s; 
	if(p%2==0)
	
	
	return	NpowerP((int)(s*s),p/2,d);
	else
		return s*NpowerP((int)(s*s),p/2,d)%d;
}


}
