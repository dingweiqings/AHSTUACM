

import java.util.Scanner;

public class P1132 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int a, b, c;
		double area=0;

		a =  cin.nextInt();
		b = cin.nextInt();
		c = cin.nextInt();
		if(a>0&&a<100 && b>0&&b<100 && c>0&&c<100)
		if (a+b>c&& b+c>a&&c+a>b ) {
			double s = (a + b + c) / 2.0;
			area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		
			 System.out.printf("%.2f",area);
		}
		else area=-1;
		if(area==-1)
		 System.out.println("Input error!");
		else if(area==0)
			 //System.out.println("Input error!");
	
		
			
		

		
		cin.close();

	}

}
