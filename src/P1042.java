import java.util.Scanner;


public class P1042 {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext()){
			int sf=cin.nextInt(2);
			String op=cin.next();
			int ss=cin.nextInt(2);
			System.out.println(opBinary(sf,op,ss));
		}
		cin.close();

	}

	private static String opBinary(int sf, String op, int ss) {
		int s=0;
		if(op.equals('+'+""))
			s=sf+ss;
			else if(op.equals("-"))
				s=sf-ss;
			else
				;
		return Integer.toBinaryString(s);
	}

}
