package tongji;
import java.util.Scanner;
public class P1175 {
	static char []a=new char[26];
	static{
		
		a[0]='z';
		a[1]='a';
		for(int i=2;i<a.length;i++){
			a[i]=(char)(++a[i-1]);//先加再赋值，++a[i-1]->a[i-1]=a[i-1]++
		--a[i-1];
		}
	}//初始化；
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	
	while(cin.hasNext()){
		int n=cin.nextInt();
		while(n-->0){
		
			String s=cin.next();

		System.out.println(a[countLower(s)%26]);
		}
		
	}
	cin.close();
}
public static int countLower(String s){//统计一个字符串中的小写字母个数，返回值为int
	char []b=s.toCharArray();
	int k=0;
	for(int i=0;i<b.length;i++)
		if(b[i]>='a'&&b[i]<='z')
			k++;
return k;
}
}
