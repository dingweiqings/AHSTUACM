import java.util.Arrays;
import java.util.Scanner;

/*
 * Time Limit:1000MS  Memory Limit:32768K
 Total Submit:364 Accepted:168

 Description

 贝贝5岁了。她从一堆数字卡片中选出了4张卡片：5、7、6、8。她摆布了一阵这些卡片后，发现它们可以排成比较顺的序列：5、6、7、8。她同样拿了另4张卡片：5、7、1、2，可是怎么也排不成“顺”的序列。原来，贝贝的所谓“顺”序列是我们所知道的等差数列！贝贝一边拿起一堆数字卡片，一边就在摆布它们，尝试着让它们“顺”起来，可总是有些“顺”，有些不“顺”。这个问题得靠你给她帮忙了，设计一个程序，能够判断对于给定的一堆数字，能“顺”还是不能“顺”。 

 Input

 输入中第一行为一个整数n（1≤n≤10），描述后面一共有n组卡片，每组卡片的第一个数m（1≤m≤100），表示后面会出现m张卡片。

 Output

 针对每组卡片，判断是否能构成“顺”序列。如果能构成“顺”序列，则输出“yes”，否则就输出“no”。每个结果应分别不同行显示。

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
