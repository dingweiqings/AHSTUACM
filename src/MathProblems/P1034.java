package MathProblems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class P1034 {
	public static void main(String[] args) {
		Scanner cin = null;

			try {
			cin = new Scanner(new File("TestData/P1034"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//cin=new Scanner(System.in);
		while (cin.hasNextLine()) {
			int a=cin.nextInt();
			int b=cin.nextInt();
			int h=cin.nextInt();
			System.out.println(String.format("%.2f",
					getArea(a, b, h)));
			System.out.println(String.format("%.2f",
					getPerimeter(a,b,h)));
		}

		cin.close();
	}

	private static double getPerimeter(int a, int b, int h) {//求梯形周长
		double r=0.0;
		double t=0.5*(b-a);
		r=a+b+2.0*Math.sqrt(h*h+t*t);
		return r;
	}

	private static double getArea(int a, int b, int h) {//求梯形面积，参数上底，下底，高
		double r = 0.0;
		r = 0.5 * (a + b) * h;
		return r;

	}
}
