import java.util.Scanner;
public class CopyOfP1007 {

	
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);

	while(cin.hasNext()){
		int n=cin.nextInt();
		
		while(n-->0){
		 
			System.out.println(Fib(cin.nextInt()));
		}
	}
	cin.close();
}
	

public static int Fib(int n){//����Fibonacci��������Ϊn,����Fib�����е�n��
	if (n==1||n==2)
		return 1;
	else
		return(Fib(n-1)+Fib(n-2));
	
}

}


