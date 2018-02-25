import java.util.Arrays;
import java.util.Scanner;

/*
 * Time Limit:1000MS  Memory Limit:32768K
 Total Submit:364 Accepted:168

 Description

 ����5���ˡ�����һ�����ֿ�Ƭ��ѡ����4�ſ�Ƭ��5��7��6��8�����ڲ���һ����Щ��Ƭ�󣬷������ǿ����ųɱȽ�˳�����У�5��6��7��8����ͬ��������4�ſ�Ƭ��5��7��1��2��������ôҲ�Ų��ɡ�˳�������С�ԭ������������ν��˳��������������֪���ĵȲ����У�����һ������һ�����ֿ�Ƭ��һ�߾��ڰڲ����ǣ������������ǡ�˳����������������Щ��˳������Щ����˳�����������ÿ��������æ�ˣ����һ�������ܹ��ж϶��ڸ�����һ�����֣��ܡ�˳�����ǲ��ܡ�˳���� 

 Input

 �����е�һ��Ϊһ������n��1��n��10������������һ����n�鿨Ƭ��ÿ�鿨Ƭ�ĵ�һ����m��1��m��100������ʾ��������m�ſ�Ƭ��

 Output

 ���ÿ�鿨Ƭ���ж��Ƿ��ܹ��ɡ�˳�����С�����ܹ��ɡ�˳�����У��������yes��������������no����ÿ�����Ӧ�ֱ�ͬ����ʾ��

 Sample Input


 3
 4 5 7 6 8
 8 1 7 3 2 8 12 78 3
 2 1 2
 Sample Output


 yes
 no
 yes
 */
public class P1004 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();

		if (N >= 1 && N <= 10) {// 1<=N<=10

			while (N-- > 0) {
				boolean flagn = false;
				boolean flagy = false;
				int m = cin.nextInt();
				int b[] = new int[m];
				if (m >= 1 && m <= 100) {
					for (int i = 0; i < m; i++)
						b[i] = cin.nextInt();
					if (!(m == 2 || m == 1)) {
						// System.out.println("yes");

						Arrays.sort(b);

						int k = 0;
						for (int i = 0; i < m - 2; i++)
							if ((b[i + 2] - b[i + 1]) == (b[i + 1] - b[i]))
								k++;
						if (k == m - 2)
							flagy = true;
						else
							flagn = true;

					}
					if ((m == 2 || m == 1))
						System.out.println("yes");
					if (flagy)
						System.out.println("yes");
					if (flagn)
						System.out.println("no");

				}
			}

		}
		cin.close();
	}
}
