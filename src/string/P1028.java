package string;

/*
 * 单词分隔

Time Limit:1000MS  Memory Limit:65536K
Total Submit:320 Accepted:150

Description

从键盘输入一段英文，将其中的英文单词分离出来：已知单词之间的分隔符包括空格，问号、句号(小数点)和分号。

Input

输入一行字符串 （字符不超过1000）

Output

将分割后的单词按行输出

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
