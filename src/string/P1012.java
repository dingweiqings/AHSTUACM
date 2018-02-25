package string;
import java.math.BigInteger;
import java.util.Scanner;
public class P1012 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		
		
		System.out.println(convertHtoB(cin.nextLine()));
	}
	cin.close();
	
}
public static String convertHtoB(String s){
	s=new BigInteger(s,16).toString(2);
	StringBuffer s1=new StringBuffer();//new SBuffer　对象
	int k=s.length()%4;
	if(k!=0)
		for(int i=0;i<4-k;i++)
		s1.append('0');//题目要求，补0
	return s1.append(s).toString();
	//把字符串转成十六进制大数                   //再把大数转成二进制表示字符串
}
}
