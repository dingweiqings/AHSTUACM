/*
 * 
��򵥵ı������

Time Limit:1000MS  Memory Limit:32768K
Total Submit:63 Accepted:28

Description

Ϊ����߹���Ч�ʣ���Ӳ��˾��������һ�����͵ı�����ԡ������Ǵ��㿪ʼ�������Ѷȿ����֪����������ʹ�ǵ�����������ǿ��ı�����ԣ�Ҳ���Ǹձ���������������ӵ��ǿ���ܵģ����Ƕ���ͨ�������ĸĽ��Ӷ���ǿ�������ġ���˹�˾�����Ƚ��ñ�����Ե�������������������Ժ��ٽ��������������ܡ��ñ������������Ĳ����Ǽ��㡣��Ϊ��˾����ϯ�������ʦ��������������ɸù��ܡ� 

Input

��������������ɣ��������岿�ֺͱ��ʽ���㲿�֡��ڱ������岿���У�ÿһ��ֻ�ܶ���һ������������һ��Ҫ����һ����ֵ�����㲿������ÿһ����һ�����ʽ�����ʽ�ɱ����Ͳ�������ɣ����źͱ���֮����һ���ո�ָ����ҷ���ֻ��ȡ+��-��*�����֣��������岿�ֺͱ��ʽ���������֮����%%%���зָ���������һ�����ӣ� 

a = 4 
b = 2 
%%% 
a + b 
a - b

Output

���ʽ�Ľ����ÿ������һ�����

Sample Input


a = 4
b = 2
c = 1
%%%
a + b + c
a - b - c
a - a
Sample Output


7
1
0
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
import java.lang.Integer;
public class P1015 {
	static HashMap<String,Integer>map=new HashMap<String,Integer>();
	static String []sa;
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		
		
	while(cin.hasNext()){
		String s=cin.nextLine();
	    if(s.equals("%%%"))
			break;
		sa=s.split("=");	
		
		map.put(sa[0],Integer.parseInt(sa[1]));
		
		
		

	} 

	while(cin.hasNext()){//������ʽ
            String f=cin.nextLine();
           
		System.out.println(compute(f,map));
	}
		
	map.clear();
	}
	cin.close();
}
public static int  compute(String f,HashMap<String,Integer> map) {
//�洢��һ�������ֵ
	int result=0;
	
	//Stack<Integer>stack=new Stack<>();ת�ɺ�׺���ʽ
	//char []fs=f.toCharArray();
String []fx=f.split("[+-[*]]*");
String []fsym=f.split("[\\p{Lower}\\p{Upper}]+");
//for(int i=0;i<fsym.length;i++)
	//System.out.print(fsym[i]+" ");
//for(int i=0;i<fx.length;i++)
	//System.out.printf("%s ",fx[i]);
//if(map.get(fx[0])!=null)
String  curx=fx[0];
String cursym=fsym[0];

result=(int)map.get(curx);

for(int i=1;i<fx.length-1;i++){
	curx=fx[i];
cursym=fsym[i-1];
	
	

	if(cursym.equals("+"))
	result+=(int)(map.get(curx));
	if(cursym.equals("-"))
		result-=(int)(map.get(curx));
	
	
	
}



 
return result;


   
	
}
public static Optional<String> emptyOptional() {
return Optional.empty();
}
public static int takenum(String s){//ȡ������
	return Integer.parseInt(s.substring(s.indexOf("=")+1));
	
	
}
public static String takesub(String s, String s1){
	return s.substring(s.indexOf("s1")+s1.length()-1);
}
public static void paintMap(String s,Map<String,Integer> map){//ͳ���ַ����еı���������ֵ�������ַ���s������ͼ����
                                                                  //=�����Ϊ����=�ұ���Ϊ��ֵ
	 
	int n=s.indexOf("=");
	String sf=s.substring(0,n);
	String  sl=s.substring(n+1);
	
	
		map.put(sf, Integer.parseInt(sl));
	
}

}
