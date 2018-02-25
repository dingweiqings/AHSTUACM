import java.util.Scanner;
public class P1233 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		int n=cin.nextInt();
		while(n-->0){
			
			System.out.println(findSomeStringBetween(cin.next(),"//","/"));
		}
	}
	cin.close();
}

public static String findSomeStringBetween(String s,String i,String j){//返回String i和String j之间的字符串
	
	s=s.substring(s.indexOf(i)+i.length(),s.indexOf(j,s.indexOf(i)+i.length()));
	if(s.contains(":")){
		j=":";
		return s.substring(0,s.indexOf(j));
	}
	else
	return s;
}
}
