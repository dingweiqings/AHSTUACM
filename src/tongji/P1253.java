package tongji;
/*
 * ��һ��ֻ����һ�ε��ַ�

Time Limit:1000MS  Memory Limit:65536K
Total Submit:62 Accepted:22

Description

��һ���ַ���(1<=�ַ�������<=10000��ȫ���ɴ�д��ĸ���)���ҵ���һ��ֻ����һ�ε��ַ���

Input

�����ж������� 
ÿһ������һ���ַ�����

Output

�����һ��ֻ����һ�ε��ַ��±꣬û��ֻ����һ�ε��ַ������-1��

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
