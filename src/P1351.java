import java.util.Scanner;
public class P1351 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		
		int n=cin.nextInt();
		int t=1;
		while(n-->0){
			int i=cin.nextInt();
			if(i%2==0)
				t*=i;
			
		}
		if(t!=1)
		System.out.println(t);
		else
			System.out.println(0);
	}
	cin.close();
}



}
