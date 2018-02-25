package tongji;

/*
 * 字母统计

 Time Limit:1000MS  Memory Limit:65536K
 Total Submit:74 Accepted:49

 Description

 现在给你一个由小写字母组成字符串，要你找出字符串中出现次数最多的字母，如果出现次数最多字母有多个那么输出最小的那个。

 Input

 第一行输入一个正整数T（0 < T < 25） 
 随后T行输入一个字符串s,s长度小于1010。

 Output

 每组数据输出占一行，输出出现次数最多的字符；

 Sample Input


 3
 abcd
 bbaa
 jsdhfjkshdfjksahdfjkhsajk
 Sample Output


 a
 a
 j

 */

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class P1272 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		Map<Character, Integer> map = new TreeMap<>();
		int n = cin.nextInt();
		while (n-- > 0) {
          int max=0;
          char keyput = ' ';//初始相关变量
			String letters = cin.next();
			

			char[] chs = letters.toCharArray();
			
               
			for (char ch : chs)
				if (map.containsKey(ch))
					map.put(ch, map.get(ch) + 1);

				else
					map.put(ch, 1);//迭代写入map
			for(Character key:map.keySet())
				if(map.get(key)>max){
					max=map.get(key);
			         keyput=key;
				}//找出最大值，记录此时键
			
			

			System.out.println(keyput);
			map.clear();//清空map
		}
cin.close();
	}
}
