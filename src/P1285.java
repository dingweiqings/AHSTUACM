/*
 * Time Limit:1000MS  Memory Limit:65536K
Total Submit:42 Accepted:30

Description

����A-B������Ϊ��������A�е�����B�е�Ԫ����ɵļ��ϡ�����A={1��2��3��4��5};B={2��4��6}��C=A-B={1,3,5}

Input

���뼯��A�ͼ���B

Output

�������C

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

	public static String AdivB(int[] a, int[] b) {// ������a�г�ȥb���ظ���Ԫ��,�����������飬����String���ͣ�
		// a��ʣ�µ�Ԫ��

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < a.length; i++)
			if (!(Arrays.binarySearch(b, a[i]) >= 0))
				sb.append(a[i]);
		return sb.toString();

	}
}
