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
	StringBuffer s1=new StringBuffer();//new SBuffer������
	int k=s.length()%4;
	if(k!=0)
		for(int i=0;i<4-k;i++)
		s1.append('0');//��ĿҪ�󣬲�0
	return s1.append(s).toString();
	//���ַ���ת��ʮ�����ƴ���                   //�ٰѴ���ת�ɶ����Ʊ�ʾ�ַ���
}
}
