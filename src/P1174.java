

import java.util.Scanner;

public class P1174 {
final static double PI=3.1415926;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		if((n>1&&n<1000)){
			
		while(n-->0){
			double m=cin.nextDouble();
			if(m>=1.0&&m<1000.0){
				double r=0.0;
				r=GetR(m);
				System.out.printf("%.2f\n",GetArea(r));
			}
			
			
		}
		}
	}

	private static double GetR(double m) {
		
		return Math.sqrt(3)*m/3;
	}

	static double GetArea(double r){
		double s=PI*r*r;
		return s;
	}
	
}
