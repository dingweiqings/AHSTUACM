import java.util.Scanner;
public class P1105 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		
		System.out.println(String.format("%.2f",
				Math.abs(cin.nextFloat())));
		
	}
	cin.close();
}
}
