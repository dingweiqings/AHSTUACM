package MathProblems;
import java.util.Scanner;
public class P1013 {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext()){
			int a1=cin.nextInt();
			int b1=cin.nextInt();
			int a2=cin.nextInt();
			int b2=cin.nextInt();
			System.out.println(fensugar(a1,b1,a2,b2));
		}
		cin.close();

	}

	public static int fensugar(int a1, int b1, int a2, int b2) {
		int result=0;
	
	for(int i=1;i<1000000;i++)//小于最小公倍数
	if((i-b1)%a1==0&&(i-b2)%a2==0){
	
	result=i;
	
		
	break;
	}
	
		return result;
	}

}
