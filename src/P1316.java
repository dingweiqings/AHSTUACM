import java.util.Scanner;


public class P1316 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		
		String s=cin.nextLine();		
		
		System.out.println(s.replaceAll("you", "we"));
	}
	cin.close();
}
}
