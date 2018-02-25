import java.util.Scanner;
public class P1100 {
	
	static long[] h=new long[1000001];
	static{
		h[0]=1;
		//h[1]=3;;
		for(int i=1;i<1000001;i++)
		h[i]=h[i-1]+i+1;
	}
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	//System.out.println(h[1]);
	while(cin.hasNext()){
	System.out.println(h[cin.nextInt()-1]);
	}
	cin.close();
}

}
