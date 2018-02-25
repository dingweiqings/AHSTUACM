package tongji;
/*
 * 第一个只出现一次的字符

Time Limit:1000MS  Memory Limit:65536K
Total Submit:62 Accepted:22

Description

在一个字符串(1<=字符串长度<=10000，全部由大写字母组成)中找到第一个只出现一次的字符。

Input

输入有多组数据 
每一组输入一个字符串。

Output

输出第一个只出现一次的字符下标，没有只出现一次的字符则输出-1。

Sample Input


ABACCDEFF
AA
Sample Output


1
-1
 */
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
public class P1253 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	Map<Character,Integer>map=new TreeMap<>();
	while(cin.hasNext()){
		
String s=cin.next();
char[]chs=s.toCharArray();
		for(Character ch:chs)
			if(!map.containsKey(ch))
				map.put(ch,1);
			else
				map.put(ch, map.get(ch)+1);
		  int k1=0,k2=0;
			for(Character ch:chs){
				
				if(map.get(ch)==1){
					System.out.println(k1);
					break;
				}
					k1++;
					if(!(map.get(ch)==1))
						k2++;
			}
			
			if(k2==chs.length)
			System.out.println("-1");
			map.clear();
		}
	cin.close();
}
}
