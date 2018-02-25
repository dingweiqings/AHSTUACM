/*
 * 哥德巴赫猜想

Time Limit:3000MS  Memory Limit:655366K
Total Submit:331 Accepted:167

Description

著名的哥德巴赫猜想可以陈述为：任何一个不小于6的偶数一定可以拆成两个质数的和。如6=3+3,8=5+3等，你的任务是将一个大于6的偶数n拆成两个最接近的质数p,q,满足p+q=n.

Input

输入包含多组测试数据。每组数据包含1个偶数n（n在6到1000000之间包含边界）。

Output

对于每组测试数据，输出两个质数p,q(p<=q)满足p+q=n。 

Sample Input


6
8
10
200000
Sample Output


3 3
3 5
5 5
99871 100129
 */
import java.util.Scanner;
public class P1014 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			Long n = (long) cin.nextInt();
			Long sq = (Long) n / 2 ;//取半
			// boolean falge = false;
			if (n >= 6 && n % 2 == 0)
				for (Long i = sq; i >= 2; i = i - 1) {//从中间开始找
					if (isPrime(i) && isPrime(n - i)) {//素数判断
						

						System.out.printf("%d %d\n", i,n- i);
						break;
					}
				}
		}

		cin.close();

	}

	private static boolean isPrime(long l) {
		for (int i1 = 2; i1 <= (int) Math.sqrt(l); i1++) {

			if (l % i1 == 0)
				return false;
		}

		return true;
	}

}
