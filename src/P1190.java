/*
找x

Time Limit:1000MS  Memory Limit:65536K
Total Submit:141 Accepted:73

Description

输入一个数n，然后输入n个数值各不相同，再输入一个值x，输出这个值在这个数组中的下标（从0开始，若不在数组中则输出-1）。

Input

测试数据有多组，输入n(1<=n<=200)，接着输入n个数，然后输入x。

Output

对于每组输入,请输出结果。

Sample Input


2
1 3
0
Sample Output


-1*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class P1190 {
	public static void main(String[] args) {
		Scanner cin = null;
		try {
			cin = new Scanner(new File("TestData/P1190"));
		} catch (FileNotFoundException e) {
			cin = new Scanner(System.in);
		}

		while (cin.hasNext()) {
			int n = cin.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = cin.nextInt();
			int x = cin.nextInt();
			boolean flag=true;
			int i=0;
            while(i<n&&flag){
            	if(a[i]==x)
            		flag=false;
            	i++;
            }
            
            if(!flag)
			System.out.println(--i);
            else 
            	System.out.println("-1");
			

		}
		cin.close();

	}
}
