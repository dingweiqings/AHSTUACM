/*
 * 近似计算

Time Limit:1000MS  Memory Limit:65536K
Total Submit:216 Accepted:101

Description

计算pi/4=1-1/3+1/5-1/7+....+1/n，

Input

n

Output

根据该算式计算的pi的值（精确6位有效数字）

Sample Input


100
10000
1
Sample Output


3.121595
3.141393
4.000000
Sourc
 */
import java.util.Scanner;
public class P1119 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
	int n=cin.nextInt();
	double sum=0.0;
	if(n%2!=0)
	n=n+1;
	for(int i=1;i<=n/2;i++)
		sum+=sign(i)*1.0/(2*i-1);
	System.out.printf("%.6f\n",4.0*sum);
	}
	cin.close();
	
}
 static int sign(int n){
	if(n%2==0)
	return -1;
	else
	return 1;
}
}
