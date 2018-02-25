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
public static BigInteger jiecheng(int n){//输入n,返回n的阶乘
	BigInteger t=new BigInteger("1");
    
for(int i=1;i<=n;i++){
	t=t.multiply(BigInteger.valueOf(i));//把i转换成BigInteger类型
	
}
	return t;
}
}
