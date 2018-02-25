package sum;
/*
 * ACM"水题"

Time Limit:1000MS  Memory Limit:65536K
Total Submit:1194 Accepted:606

Description

ACM中把一种题称作“水题”，顾名思义就是题目很水，很简单。为了促进提高大伙的编程兴趣， 
zjahstu决定贯彻“没有最水，只有更水”的原则。 

现在给定两个数a和b, 计算[a,b]之间整数的和。(当a=b=0时候表示输入结束,不必处理）

Input

1 100 
1 10 
99 100 
0 0

Output

5050 
55 
199

Sample Input


1 100 
1 10
99 100 
0 0  
Sample Output


5050
55
199
 */
import java.util.Scanner;
public class P1001 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
	int a=cin.nextInt();
	int b=cin.nextInt();
	int sum=0;
	if(a!=0&&b!=0){
	for(int i=a;i<=b;i++)
		sum=sum+i;
	System.out.println(sum);
	}
	}
}
}
