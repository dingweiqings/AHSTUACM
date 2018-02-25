import java.util.Scanner;


public class P1068 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	int N=cin.nextInt();
	while(N-->0){
		int N1=cin.nextInt();
		int []a=new int [N1];
		long sum=0;
			for(int i=0;i<a.length;i++)
			{
			 a[i]=cin.nextInt();
			 sum+=a[i];
			}
			System.out.println(sum);
		
		
	}
	cin.close();
}
}
