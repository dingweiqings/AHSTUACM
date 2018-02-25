import java.util.Scanner;
public class P1358{
	static int[]h={31,28,31,30,31,30,31,31,30,31,30,30};
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
while(cin.hasNext()){
	int n=cin.nextInt();
		//int n=Integer.parseInt(cin.next());
	while(n-->0){
		
		int a=cin.nextInt();
		int b=cin.nextInt();
		int c=cin.nextInt();
		System.out.println(WhatDay(a,b,c));
				
	}
		
}
	cin.close();
}
public static int WhatDay(int a,int b,int c){
	if(a%400==0||(a%4==0&&a%100!=0))
			h[1]++;
	int count=0;
	for(int i=0;i<b-1;i++)
		count+=h[i];
	count+=c;
 if(a%400==0||(a%4==0&&a%100!=0))
	h[1]--;
	return count;
	
			
}
}