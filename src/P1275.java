import java.util.Scanner;
public class P1275 {
public static void main(String[] args) {
	Scanner cin=null;
	
	cin=new Scanner(System.in);
	while(cin.hasNext()){
		
		int x=cin.nextInt();
		int n=cin.nextInt();
		long t=pow(x,n);
		if(t>0)	
	System.out.println(String.format("%d",t ));
		
				
		
	}
	cin.close();
}

private static long pow(int x, int n) {
	long t=1L;
	for(int i=0;i<n;i++)
		t*=x;
	return t;
	
}
}
