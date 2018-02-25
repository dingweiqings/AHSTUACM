import java.util.Scanner;
public class P1104 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		int n=cin.nextInt();
		if(n*95>=300)
		System.out.println(String.format("%.2f",n*95*0.85));
		else
		System.out.println(String.format("%.2f", n*95f));
	}
	cin.close();
}
}
