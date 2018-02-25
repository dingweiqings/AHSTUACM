

import java.util.Scanner;

public class P1174Best {
final static double PI=3.1415926,sqrt3=Math.sqrt(3);//先算好
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		if((n>1&&n<1000)){//判断输入合法性
			
		while(n-->0){
			double m=cin.nextDouble();
			if(m>=1.0&&m<1000.0){
				double r=sqrt3*m/3;//可以用函数
				
				System.out.printf("%.2f\n",PI*r*r);
			}
			
			
		}
		}
	}


}
