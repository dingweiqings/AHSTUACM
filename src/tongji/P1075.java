package tongji;
import java.util.HashMap;
import java.util.Scanner;
public class P1075 {
	static int[]h={31,28,31,30,31,30,31,31,30,31,30,30};

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String s = cin.nextLine();
			String[] ss = s.split("/");
			int a = Integer.parseInt(ss[0]);
			int b = Integer.parseInt(ss[1]);
			int c = Integer.parseInt(ss[2]);
			System.out.println(WhatDay(a, b, c));
		}
		cin.close();
	}
public static int WhatDay(int a,int b,int c){
	int count=0;
	if(a%400==0||(a%4==0&&a%100!=0))
			h[1]++;
	
	for(int i=0;i<b-1;i++)
		count+=h[i];
	count+=c;
	return count;
			}
}
