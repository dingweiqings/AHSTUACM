/*两点距离

Time Limit:1000MS  Memory Limit:65536K
Total Submit:574 Accepted:268

Description

输入4个绝对值在1000000以内的整数 x1,y1,x2,y2, 输出平面坐标系中点 (x1,y1)到点(x2,y2)之间的距离（保留三位小数）

Input

输入4个整数 x1,y1,x2,y2,

Output

输出平面坐标系中点 (x1,y1)到点(x2,y2)之间的距离（保留三位小数）

Sample Input


0 0 3 4
Sample Output


5.000
Sou
*/








import java.util.Scanner;
public class P1102 {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		long a=cin.nextLong();
		long b=cin.nextLong();
		long c=cin.nextLong();
		long d=cin.nextLong();
		System.out.printf("%.3f\n",GetDistance(a,b,c,d));
		cin.close();
	}
	private static double GetDistance(long x1,long y1,long x2,  long y2) {
		return Math.sqrt(1.0*(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
			
		}
}
