/*
 * 素数求和问题

Time Limit:1000MS  Memory Limit:65536K
Total Submit:274 Accepted:173

Description

现在给你N个数现在要求你写出一个程序，找出这N个数中的所有素数，并求和。

Input

第一行给出整数M(0每组测试数据第一行给你N，代表该组测试数据的数量。 
接下来的N个数为要测试的数据，每个数小于1000 

Output

每组测试数据结果占一行，输出给出的测试数据的所有素数和 

Sample Input


3
5
1 2 3 4 5
8
11 12 13 14 15 16 17 18
10
21 22 23 24 25 26 27 28 29 30
Sample Output


10
41
52
 */

import java.util.Scanner;
public class P1031 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		int n=cin.nextInt();
		while(n-->0){
		int []a=new int[cin.nextInt()];
		for(int i=0;i<a.length;i++)
			a[i]=cin.nextInt();
		int sum=0;
		for(int i=0;i<a.length;i++)
			if(isPrime(a[i]))
				sum+=a[i];
		System.out.println(sum);
	}
	}
	cin.close();
}
public static boolean isPrime(int n) {
	if(n<0)
		n=-n;
	if(n<2)
		return false;
	if(n==2)
		return true;
	if(n%2==0)
		return false;
	for (int c = 3; c * c <= n; c += 2)
		if (n % c == 0)
			return false;
	return true;
}

}
