/*
��x

Time Limit:1000MS  Memory Limit:65536K
Total Submit:141 Accepted:73

Description

����һ����n��Ȼ������n����ֵ������ͬ��������һ��ֵx��������ֵ����������е��±꣨��0��ʼ�������������������-1����

Input

���������ж��飬����n(1<=n<=200)����������n������Ȼ������x��

Output

����ÿ������,����������

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
