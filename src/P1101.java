/*
 * ���Һ�����

Time Limit:1000MS  Memory Limit:65536K
Total Submit:573 Accepted:234

Description

����һ��������n(n������360)���n�ȵ��������Һ���ֵ(������λС����

Input

����һ��������n

Output

���n�ȵ��������Һ���ֵ(������λС����

Sample Input


30
Sample Output


0.500 0.866
 */


import java.util.Scanner;
import java.lang.Math;
public class P1101 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	int n=cin.nextInt();
	if(n<=360){
		System.out.printf("%.3f %.3f\n",Math.sin(Math.PI*n/180.0),Math.cos(Math.PI*n/180.0));
		
	}
}
}
