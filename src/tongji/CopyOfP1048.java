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
		
	
	

public static String A(char []a,int n){//返回全排列
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
public static void exchange(Char ch){//交换两个字母,利用对象操作


	char temp=' ';
	temp=ch.a;
   ch.a=ch.b;
	ch.b=temp;
	
	
}
public static void exchange(char a,char b){//错误
	
	//交换两个字母，无法在主函数中调用，
	//因为char 是基本类型，属于传值调用
	char temp=' ';
	temp=a;
	a=b;
	b=temp;
	
}
}

