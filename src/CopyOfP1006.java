import java.util.Arrays;

import java.util.Scanner;
public class CopyOfP1006 {
	public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	int []a=new int[5];
	for(int i=0;i<5;i++)
		a[i]=cin.nextInt();
	Arrays.sort(a);
	System.out.printf("%d %d\n",a[0],a[a.length-1]);
cin.close();	
	}

}
