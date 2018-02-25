/*
 * �����еĺ�

Time Limit:1000MS  Memory Limit:65536K
Total Submit:166 Accepted:103

Description

������������0 < n < m < 10^6 ���1/n^2+1/(n+1)^2+....+1/m^2����5λС��������n=2 m=4 ����0.42361 n=65536 m=655360 ����0.00001.

Input

n m

Output

1/n^2+1/(n+1)^2+....+1/m^2����5λС��

Sample Input


2 4 
65535 655350
Sample Output


0.42361
0.00001
 */





import java.util.Scanner;
public class P1120 {

	public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
while(cin.hasNext()){
	double sum=0.0;
	long a=cin.nextInt();
	long b=cin.nextInt();
	
	for(long i=a;i<=b;i++)
		sum+=1.0/Math.pow(i,2);
	System.out.printf("%.5f\n",sum);
}
cin.close();	
	}
}
