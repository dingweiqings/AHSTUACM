package MathProblems;
/*
 * Time Limit:1000MS  Memory Limit:65536K
Total Submit:259 Accepted:62

Description

一个很简单的问题，求1^p+2^p+3^p+……+n^p的和。

Input

第一行单独一个数字t表示测试数据组数。接下来会有t行数字，每行包括两个数字n,p， 
输入保证0< n< =1000,0< =p< =1000。 

Output

输出1^p+2^p+3^p+……+n^p对10003取余的结果，每个结果单独占一行。 

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
public static long NpowerP(int n,int p,int d){//long (底数，次数，模)
 long s=n%d;
		if(p==1) 
			return s; 
	if(p%2==0)
	
	
	return	NpowerP((int)(s*s),p/2,d);
	else
		return s*NpowerP((int)(s*s),p/2,d)%d;
}


}
