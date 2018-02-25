package tongji;
import java.util.Arrays;
import java.util.Scanner;
public class P1030 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		int n=cin.nextInt();
		while(n-->0){
			
			String s=cin.next();
			char chs[]=s.toCharArray();
			
			Arrays.sort(chs);
			for(int i=0;i<chs.length;i++)
			System.out.printf("%c ",chs[i]);
			System.out.println();
		}
	}
	cin.close();
}
static class Str{
	static String s;
}
public static String sortByASCII(Str s){
	char chs[]=Str.s.toCharArray();
	String s1;
	Arrays.sort(chs);
	return chs.toString();

/*for(int i=0;i<chs.length;i++)
	s1=s1+(char)chs[i];
return s;*/
}
}
