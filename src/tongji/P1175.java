package tongji;
import java.util.Scanner;
public class P1175 {
	static char []a=new char[26];
	static{
		
		a[0]='z';
		a[1]='a';
		for(int i=2;i<a.length;i++){
			a[i]=(char)(++a[i-1]);//�ȼ��ٸ�ֵ��++a[i-1]->a[i-1]=a[i-1]++
		--a[i-1];
		}
	}//��ʼ����
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
public static int countLower(String s){//ͳ��һ���ַ����е�Сд��ĸ����������ֵΪint
	char []b=s.toCharArray();
	int k=0;
	for(int i=0;i<b.length;i++)
		if(b[i]>='a'&&b[i]<='z')
			k++;
return k;
}
}
