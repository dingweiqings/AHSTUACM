import java.util.Scanner;
public class P1127 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		int m=cin.nextInt();//
		
		long sum=0;
		if(m>=1&&m<=9)
		for(int n=1;n<=m;n++ ){
			int s=1;
			for(int i=n;i>=2;i--)
				s*=i;
			sum+=s;
		}	
		
		
		System.out.println(sum);
	}
	
	
	
	cin.close();
}
}
