import java.util.Scanner;
public class P1103 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		int n=cin.nextInt();
		if(n%2==0)
			System.out.println("yes");
		else
			System.out.println("no");
	}
	cin.close();
}
}
