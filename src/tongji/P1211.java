package tongji;
/*
 * 统计数字

Time Limit:1000MS  Memory Limit:65536K
Total Submit:43 Accepted:32

Description

某次科研调查时得到了n个自然数，每个数均不超过1500000000（1.5*109）。已知不相同的数不超过10000个，现在需要统计这些自然数各自出现的次数，并按照自然数从小到大的顺序输出统计结果。 

Input

输入包含n+1行： 
第1行是整数n，表示自然数的个数。 
第2~n+1行每行一个自然数。 

Output

输出包含m行（m为n个自然数中不相同数的个数），按照自然数从小到大的顺序输出。每行输出两个整数，分别是自然数和该数出现的次数，其间用一个空格隔开。 

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
