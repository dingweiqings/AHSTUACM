import java.util.Scanner;
public class P1355 {
public static void main(String[] args) {
	Scanner cin=null;
	cin=new Scanner(System.in);
	while(cin.hasNext()){
		int a=cin.nextInt();
		int b=cin.nextInt();
		int c=cin.nextInt();
		if(a*b==c)
			System.out.println("true");
		else 
			System.out.println("false");
	}
	cin.close();
}
}
