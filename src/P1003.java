import java.math.*;
import java.util.Scanner;
public class P1003 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		int  n=cin.nextInt();
	System.out.println(jiecheng(n));

	}
	cin.close();
}
public static BigInteger jiecheng(int n){//����n,����n�Ľ׳�
	BigInteger t=new BigInteger("1");
    
for(int i=1;i<=n;i++){
	t=t.multiply(BigInteger.valueOf(i));//��iת����BigInteger����
	
}
	return t;
}
}
