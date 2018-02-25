
/*
 * 简单数据统计

Time Limit:1000MS  Memory Limit:65536K
Total Submit:258 Accepted:173 

Description 

输入若干个整数求出他们的最小值，最大值，平均值（保留三位有效数字）输入保证这些数都不超过1000的正整数

Input 

输入若干个整数

Output 

求出他们的最小值，最大值，平均值（保留三位有效数字）

Sample Input 


2 8 3 5 1 7 3 6

Sample Output 


1 8 4.375
 

 */













import java.util.Scanner;


public class P1112 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
int max=0;
int min=65536;
int i=0;
double sum=0.0;
while(cin.hasNext()){

int a=cin.nextInt();
if(a>max)max=a;
if(a<min)min=a;
sum=sum+a;
i++;

}

System.out.printf("%d %d %.3f",min,max,1.0*sum/(double) i);
System.out.println();
		
	cin.close();
	}
	
	
	
}


