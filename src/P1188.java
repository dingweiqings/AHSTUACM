/*

中位数

Time Limit:1000MS  Memory Limit:65536K
Total Submit:253 Accepted:139

Description

中位数定义：一组数据按从小到大的顺序依次排列，处在中间位置的一个数（或最中间两个数据的平均数）. 
给出一组无序整数，求出中位数，如果求最中间两个数的平均数，向下取整即可（不需要使用浮点数） 

Input

该程序包含多组测试数据，每一组测试数据的第一行为N，代表该组测试数据包含的数据个数，1<=N<=10000. 
接着N行为N个数据的输入，N=0时结束输入

Output

输出中位数，每一组测试数据输出一行

Sample Input


4
10 30 20 40
3
40 30 50
4
1 2 3 4
0
Sample Output


25
40
2*/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
public class P1188 {
public static void main(String[] args) {
	Scanner cin=null;
	try {
		cin=new Scanner(new File("TestData/P1188"));
	} catch (FileNotFoundException e) {
       cin=new Scanner(System.in);
	}
	while(cin.hasNext()){
		
int n=cin.nextInt();
if(n==0)
	break;
int a[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=cin.nextInt();
Arrays.sort(a);
if(n%2!=0)
	System.out.println(a[(n-1)/2]);
else
	System.out.println((a[n/2]+a[n/2-1])/2);


	}
	cin.close();
		
}


}

