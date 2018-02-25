import java.util.Scanner;
public class P1301 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		int a=cin.nextInt();
		//int b=cin.nextInt();
		StringBuffer br=new StringBuffer(cin.nextInt()+"");
	    int b=Integer.parseInt(br.reverse().toString());
		System.out.println(a+b);
	}
	cin.close();
}
}
