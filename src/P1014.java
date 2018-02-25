/*
 * ��°ͺղ���

Time Limit:3000MS  Memory Limit:655366K
Total Submit:331 Accepted:167

Description

�����ĸ�°ͺղ�����Գ���Ϊ���κ�һ����С��6��ż��һ�����Բ�����������ĺ͡���6=3+3,8=5+3�ȣ���������ǽ�һ������6��ż��n���������ӽ�������p,q,����p+q=n.

Input

�����������������ݡ�ÿ�����ݰ���1��ż��n��n��6��1000000֮������߽磩��

Output

����ÿ��������ݣ������������p,q(p<=q)����p+q=n�� 

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
			Long sq = (Long) n / 2 ;//ȡ��
			// boolean falge = false;
			if (n >= 6 && n % 2 == 0)
				for (Long i = sq; i >= 2; i = i - 1) {//���м俪ʼ��
					if (isPrime(i) && isPrime(n - i)) {//�����ж�
						

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
