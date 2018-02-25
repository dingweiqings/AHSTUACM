package tongji;
/*
 * ͳ������

Time Limit:1000MS  Memory Limit:65536K
Total Submit:43 Accepted:32

Description

ĳ�ο��е���ʱ�õ���n����Ȼ����ÿ������������1500000000��1.5*109������֪����ͬ����������10000����������Ҫͳ����Щ��Ȼ�����Գ��ֵĴ�������������Ȼ����С�����˳�����ͳ�ƽ���� 

Input

�������n+1�У� 
��1��������n����ʾ��Ȼ���ĸ����� 
��2~n+1��ÿ��һ����Ȼ���� 

Output

�������m�У�mΪn����Ȼ���в���ͬ���ĸ�������������Ȼ����С�����˳�������ÿ����������������ֱ�����Ȼ���͸������ֵĴ����������һ���ո������ 

Sample Input



9
2
3
2
3
3
4
2
5
4
Sample Output



2 3
3 3
4 2
5 1
 */
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
public class P1211 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	int n=cin.nextInt();
	Map<Long,Integer>map=new TreeMap<>();
	while(n-->0){
		
		long a=cin.nextLong();
		if(map.containsKey(a))
			map.put(a, map.get(a)+1);
		else
			map.put(a, 1);
		
		
		
	}
	
		for(Long key:map.keySet())
		System.out.printf("%d %d\n",key,map.get(key));
	map.clear();
	
	
	
	cin.close();
}
}
