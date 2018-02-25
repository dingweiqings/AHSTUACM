package tongji;

/*
 * 字符串统计

 Time Limit:1000MS  Memory Limit:65536K
 Total Submit:227 Accepted:160

 Description

 对于给定的一个字符串，统计其中数字字符出现的次数。

 Input

 输入数据有多行，第一行是一个整数n，表示测试实例的个数，后面跟着n行，每行包括一个由字母和数字组成的字符串。

 Output

 对于每个测试实例，输出该串中数值的个数，每个输出占一行。

 Sample Input


 2
 asdfasdf123123asdfasdf
 asdf111111111asdfasdfasdf
 Sample Output


 6
 9
 */

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P1052 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		Map<Character, Integer> map = new TreeMap<>();

		int n = cin.nextInt();
		while (n-- > 0) {
			//int sum = 0;
             int k=0;
			String s = "0123456789";
			char []a=s.toCharArray();
			for ( Character ch:a)
				map.put(ch, 0);//数字写入map
			//System.out.println(map);
			s = cin.next();//输入
			char[] chs = s.toCharArray();
			
			for ( Character ch:chs)
				// 写入map
				if (map.containsKey(ch)) {
					//map.put(ch, map.get(ch) + 1);
					k++;
					
				} 
//System.out.println(map);
			System.out.println(k);
			map.clear();
		}

		cin.close();
	}

}
