import java.util.Scanner;
public class P1072 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		System.out.println(sum(cin.nextInt()));
	}
	cin.close();
}
public static int sum(int n){//求n个数的和，输入n,返回1+2+3+...+n
	int sum=0;
	for(int i=1;i<=n;i++)
		sum+=i;
	return sum;
}
}
