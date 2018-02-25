package tongji;

/*
 * ��ĸͳ��

 Time Limit:1000MS  Memory Limit:65536K
 Total Submit:74 Accepted:49

 Description

 ���ڸ���һ����Сд��ĸ����ַ�����Ҫ���ҳ��ַ����г��ִ���������ĸ��������ִ��������ĸ�ж����ô�����С���Ǹ���

 Input

 ��һ������һ��������T��0 < T < 25�� 
 ���T������һ���ַ���s,s����С��1010��

 Output

 ÿ���������ռһ�У�������ִ��������ַ���

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
          char keyput = ' ';//��ʼ��ر���
			String letters = cin.next();
			

			char[] chs = letters.toCharArray();
			
               
			for (char ch : chs)
				if (map.containsKey(ch))
					map.put(ch, map.get(ch) + 1);

				else
					map.put(ch, 1);//����д��map
			for(Character key:map.keySet())
				if(map.get(key)>max){
					max=map.get(key);
			         keyput=key;
				}//�ҳ����ֵ����¼��ʱ��
			
			

			System.out.println(keyput);
			map.clear();//���map
		}
cin.close();
	}
}
