/*
 * Time Limit:1000MS  Memory Limit:65536K
Total Submit:42 Accepted:30

Description

集合A-B被定义为由所有在A中但不在B中的元素组成的集合。例如A={1，2，3，4，5};B={2，4，6}则C=A-B={1,3,5}

Input

输入集合A和集合B

Output

输出集合C

Sample Input


5 1 2 3 4 5
3 2 4 6
Sample Output


3 1 3 5
Hint
 */


import java.util.Arrays;
import java.util.Scanner;
public class P1285 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	
	while(cin.hasNext()){
		int n=cin.nextInt();
		int []a=new int[n];
		for(int i=0;i<a.length;i++)
			a[i]=cin.nextInt();
		int m=cin.nextInt();
		int []b=new int[m];
		for(int i=0;i<b.length;i++)
			b[i]=cin.nextInt();
		char []chs=AdivB(a,b).toCharArray();
		
		
		System.out.printf("%d ",chs.length);
		for(int i=0;i<chs.length;i++)
		System.out.printf("%c ",chs[i]);
		System.out.println();
		
	}
	cin.close();
}

	public static String AdivB(int[] a, int[] b) {// 在数组a中除去b中重复的元素,输入两个数组，返回String类型，
		// a中剩下的元素

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < a.length; i++)
			if (!(Arrays.binarySearch(b, a[i]) >= 0))
				sb.append(a[i]);
		return sb.toString();

	}
}
