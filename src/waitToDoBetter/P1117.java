package waitToDoBetter;

import java.util.Scanner;
/*
三角形面积

Time Limit:1000MS  Memory Limit:65536K
Total Submit:216 Accepted:118

Description

给你三个点，表示一个三角形的三个顶点，现你的任务是求出该三角形的面积

Input

每行是一组测试数据，有6个整数x1,y1,x2,y2,x3,y3分别表示三个点的横纵坐标。（坐标值都在0到10000之间） 
输入0 0 0 0 0 0表示输入结束 
测试数据不超过10000组

Output

输出这三个点所代表的三角形的面积，结果精确到小数点后1位（即使是整数也要输出一位小数位）

Sample Input


0 0 1 1 1 3
0 1 1 0 0 0
0 0 0 0 0 0
Sample Output


1.0
0.5*/

public class P1117 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
int [] s=new int[6];//定义数组
while(cin.hasNext()){
       
for(int i=0;i<s.length;i++)
   s[i]=cin.nextInt(); //读入
int count=0;
 for(int i:s)//java数组的for循环,循环变量必须是数组类型
	 if(i==0)
		 count++;
	if(count==s.length)	 //要以0 0 0 0 0 0结尾
	break;

int k=0;
for(int j:s)
	if(j>=0&&j<=10000)//判断合法性
		k++;
if(k==s.length){
double a=(double)GetDistance(s[0],s[1],s[2],s[3]);//计算距离
double b=(double)GetDistance(s[0],s[1],s[4],s[5]);
double c=(double)GetDistance(s[2],s[3],s[4],s[5]);
if(a+b>c&&a+c>b&&b+c>a)
System.out.printf("%.1f\n",GetArea(a,b,c));//计算面积


}
}


	cin.close();

}
private static double GetArea(double a, double b,
		double c) {
	double s=(a+b+c)/2.0;
	return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	
}

private static double GetDistance(int x1,int y1,int x2,  int y2) {
return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	
}
}

