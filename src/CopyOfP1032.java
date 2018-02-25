import java.util.Scanner;
public class CopyOfP1032 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
while(cin.hasNext()){
	int n=cin.nextInt();
	if(n==0)break;
	if(n==153||n==370||n==371||n==407)
		System.out.println("Yes");
	else
		System.out.println("No");
}
		
	cin.close();
}
}
