import java.util.Scanner;
public class P1059 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		int n=cin.nextInt();
		int m=cin.nextInt();
		print(n,m);
		System.out.println();
	}
	cin.close();
}

private static void print(int n, int m) {
	for(int j=0;j<m+2;j++){
		if(j==0||j==m+1){
			System.out.print("+");
			for(int k=0;k<n;k++)
				System.out.print("-");
			System.out.println("+");
		}
		else	
	for(int i=0;i<n+2;i++)
		if(i==0)
		System.out.print("|");
		else if(i==n+1)
		System.out.println("|");
		else
			System.out.print(" ");
}
	
}
}
