import java.util.Arrays;
import java.util.Scanner;

/*
 * 三角形

 Time Limit:1000MS  Memory Limit:65536K
 Total Submit:0 Accepted:0

 Description

 有n 根棍子，棍子i 的长度为ai。想要从中选出3 根棍子组成周长尽可能长的三角形。请输出最大的周长，若无法组成三角形则输出0。 
 //3 ≤ n ≤ 100，1 ≤ ai ≤ 106



 多组测试数据，第一行为n , 后面跟n个棍子的长度

 Output

 能组成三角形的最大周长

 Sample Input


 5
 2 3 4 5 10
 4
 4 5 10 20
 Sample Output


 12
 0
 So
 */
public class P1324 {
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);

		while (c.hasNext()) {// 测试若干组
			int m = c.nextInt();
			boolean flag = false;
			int[] s = new int[m];// 读入m个测试数据
			for(int i=0;i<s.length;i++)
				s[i]=c.nextInt();
			Arrays.sort(s);
			//System.out.println(s[0]);
			int k = 1;
			for (int i = m - 1; i >= 2; i--){
				if (isTri(s[i - 2], s[i - 1], s[i])) {
					flag = true;
					k=i;
					break;
				
				}	
				
			}

			
			if (flag)
				System.out.println(GetPrimeter(s[k- 2], s[k - 1], s[k]));

			if ((k == 1))
				System.out.println('0');
			
		
	}
	}
	static boolean isTri(int a, int b, int c) {
		return a + b > c;
	}
	static int GetPrimeter(int a, int b, int c) {
		return a + b + c;
	}

}
