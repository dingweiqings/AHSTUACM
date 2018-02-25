
/*
 * 
 简单统计

 Time Limit:1000MS  Memory Limit:65536K
 Total Submit:286 Accepted:119

 Description

 输入一个正整数n 

 然后跟随是n个正整数 a1,a2....an 
 最后一个是正整数m 
 请统计出ai中小于m的元素个数

 Input

 输入一个正整数n 

 然后跟随是n个正整数 a1,a2....an 
 最后一个是正整数m 

 Output

 请统计出ai中小于m的元素个数

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
