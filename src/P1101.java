/*
 * 正弦和余弦

Time Limit:1000MS  Memory Limit:65536K
Total Submit:573 Accepted:234

Description

输入一个正整数n(n不超过360)输出n度的正弦余弦函数值(保留三位小数）

Input

输入一个正整数n

Output

输出n度的正弦余弦函数值(保留三位小数）

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
