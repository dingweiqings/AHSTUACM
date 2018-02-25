package MathProblems;
import java.util.Scanner;
public class P1346 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		int n=cin.nextInt();
		System.out.println(String.format("%.6f",sum(n)));
	}
	cin.close();
}

public static double sum(int n) {
double result=0.0;


	if(n%2==0)
	for(int i=2;i<=n;i+=2)
	result+=1.0/i;
	
	else
	for(int i=1;i<=n;i+=2)
		result+=1.0/i;
	
	return result;
}

}
