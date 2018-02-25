/*�������

Time Limit:1000MS  Memory Limit:65536K
Total Submit:574 Accepted:268

Description

����4������ֵ��1000000���ڵ����� x1,y1,x2,y2, ���ƽ������ϵ�е� (x1,y1)����(x2,y2)֮��ľ��루������λС����

Input

����4������ x1,y1,x2,y2,

Output

���ƽ������ϵ�е� (x1,y1)����(x2,y2)֮��ľ��루������λС����

Sample Input


0 0 3 4
Sample Output


5.000
Sou
*/








import java.util.Scanner;
public class CopyOfP1102 {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
	long a[]=new long[4];
	for(int i=0;i<a.length;i++){
		a[i]=cin.nextLong();
	}
		System.out.printf("%.3f\n",GetDistance(a[0],a[1],a[2],a[3]));
		cin.close();
	}
	private static double GetDistance(long x1,long y1,long x2,  long y2) {
		long x=x1-x2;
		long y=y1-y2;
		return Math.sqrt(x*x+y*y);
			
		}
}
