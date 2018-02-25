package tongji;
import java.util.Arrays;
import java.util.Scanner;

public class P1047 {
	public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);

	while(cin.hasNext()){
		int n=cin.nextInt();
		int []a=new int[n];
		int m=cin.nextInt();
		for(int i=0;i<n;i++)
			a[i]=cin.nextInt();
		Arrays.sort(a);
		if(m==0)
			for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		else
			for(int i=a.length-1;i>=0;i--)
				System.out.println(a[i]);
			
	}
cin.close();	
	}

}
