
import java.util.Scanner;


public class P1177 {
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

