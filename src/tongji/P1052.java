package tongji;

/*
 * �ַ���ͳ��

 Time Limit:1000MS  Memory Limit:65536K
 Total Submit:227 Accepted:160

 Description

 ���ڸ�����һ���ַ�����ͳ�����������ַ����ֵĴ�����

 Input

 ���������ж��У���һ����һ������n����ʾ����ʵ���ĸ������������n�У�ÿ�а���һ������ĸ��������ɵ��ַ�����

 Output

 ����ÿ������ʵ��������ô�����ֵ�ĸ�����ÿ�����ռһ�С�

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
				map.put(ch, 0);//����д��map
			//System.out.println(map);
			s = cin.next();//����
			char[] chs = s.toCharArray();
			
			for ( Character ch:chs)
				// д��map
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
