package sum;
/*
 * ACM"ˮ��"

Time Limit:1000MS  Memory Limit:65536K
Total Submit:1194 Accepted:606

Description

ACM�а�һ���������ˮ�⡱������˼�������Ŀ��ˮ���ܼ򵥡�Ϊ�˴ٽ���ߴ��ı����Ȥ�� 
zjahstu�����᳹��û����ˮ��ֻ�и�ˮ����ԭ�� 

���ڸ���������a��b, ����[a,b]֮�������ĺ͡�(��a=b=0ʱ���ʾ�������,���ش���

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
