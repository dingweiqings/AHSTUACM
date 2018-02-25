import java.util.Scanner;
public class P1007 {
	static int [] h=new int[21];
	static {
		h[0]=1;
		h[1]=1;
		for(int i=2;i<h.length;i++)
			h[i]=h[i-1]+h[i-2];
	}
	
	
	
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		int n=cin.nextInt();
		while(n-->0){
			System.out.println(h[cin.nextInt()-1]);
		}
	}
	cin.close();
}
}

