import java.util.Scanner;
public class P1129 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		String s=cin.next();
		System.out.println(s.substring(0,s.indexOf('@')));
	}
	cin.close();
}
}
