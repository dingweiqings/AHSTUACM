package tongji;
import java.util.Arrays;
import java.util.Scanner;
public class CopyOfP1048 {

public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	/*Char ch=new Char();
	char a='a';
	char b='b';
	ch.a=a;
    ch.b=b;
	System.out.printf("%c %c\n",ch.a,ch.b);
	exchange(ch);
	System.out.printf("%c %c",ch.a,ch.b);*/
	while(cin.hasNext()){
		String s=cin.next();
		char []chs=s.toCharArray();
	
	//System.out.println(Arrays.toString(chs));
	/*for(int i=0;i<chs.length-1;i++)
		
		{	
			temp=chs[i];
			chs[i]=chs[i+1];
			chs[i+1]=temp;
			System.out.println(Arrays.toString(chs));
			if(i==chs.length-1){
				
			}
		}*/
System.out.println(A(chs,chs.length));
		}
	
		 
System.out.println();
cin.close();
		   }
		
	
	

public static String A(char []a,int n){//����ȫ����
a=new char[2];

String s=" ";
s=s+a[1];
s=s+a[0];
s=s.trim();
return s;

} 


	
static class Char{
	char a;
	char b;
}
public static void exchange(Char ch){//����������ĸ,���ö������


	char temp=' ';
	temp=ch.a;
   ch.a=ch.b;
	ch.b=temp;
	
	
}
public static void exchange(char a,char b){//����
	
	//����������ĸ���޷����������е��ã�
	//��Ϊchar �ǻ������ͣ����ڴ�ֵ����
	char temp=' ';
	temp=a;
	a=b;
	b=temp;
	
}
}

