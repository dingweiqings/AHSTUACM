
/*
 * 
 ��ͳ��

 Time Limit:1000MS  Memory Limit:65536K
 Total Submit:286 Accepted:119

 Description

 ����һ��������n 

 Ȼ�������n�������� a1,a2....an 
 ���һ����������m 
 ��ͳ�Ƴ�ai��С��m��Ԫ�ظ���

 Input

 ����һ��������n 

 Ȼ�������n�������� a1,a2....an 
 ���һ����������m 

 Output

 ��ͳ�Ƴ�ai��С��m��Ԫ�ظ���

 Sample Input


 5
 1 2 3 4 5 
 8
 6
 1 2 3 4 5 9
 4
 Sample Output


 5
 3
 */
import java.util.Scanner;

public class P1117 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		//int N = cin.nextInt();
		while (cin.hasNext()) {
			int m = cin.nextInt();
			int[] s = new int[m];
			int k =0;
			for (int i = 0; i < s.length; i++)
				s[i] = cin.nextInt();
			// System.out.println(s[0]);
			int max = cin.nextInt();
			for (int i = 0; i < s.length; i++){
				if (s[i] < max)
					k = i;

				else
					break;
			}
			System.out.println(k + 1);

		}

		cin.close();
	}
}
