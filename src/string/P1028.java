package string;

/*
 * ���ʷָ�

Time Limit:1000MS  Memory Limit:65536K
Total Submit:320 Accepted:150

Description

�Ӽ�������һ��Ӣ�ģ������е�Ӣ�ĵ��ʷ����������֪����֮��ķָ��������ո��ʺš����(С����)�ͷֺš�

Input

����һ���ַ��� ���ַ�������1000��

Output

���ָ��ĵ��ʰ������

Sample Input


There are apples; oranges and peaches on the table.
Sample Output


There
are
apples
oranges
and
peaches
on
the
table

 */
import java.util.Scanner;
public class P1028 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String s = cin.nextLine();
			String []ss=s.split("[\\s\\p{Punct}]+");
			for(int i=0;i<ss.length;i++)
				System.out.println(ss[i]);

		}
		cin.close();
	}


}
