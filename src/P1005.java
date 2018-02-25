import java.util.Scanner;
public class P1005 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		int n=cin.nextInt();
		while(n-->0){
			int a=cin.nextInt();
			int b=cin.nextInt();
			int c=cin.nextInt();
			if(a+b==c)
				System.out.println(a+"+"+b+"="+c);
			else if(a-b==c)
				System.out.println(a+"-"+b+"="+c);
				else if(b-a==c)
					System.out.println(b+"-"+a+"="+c);
			else if (a*b==c)
				System.out.println(a+"*"+b+"="+c);
			else if(a/b==c)
				System.out.println(a+"/"+b+"="+c);
			else if(b/a==c)
				System.out.println(b+"/"+a+"="+c);
			else System.out.println("None");;
				
		}
	}
	cin.close();
}
public static boolean gouzao(int a,int b,int c){
	if(a+b==c)
		return true;
	else if(a-b==c||b-a==c)
		return true;
	else if (a*b==c)
		return true;
	else if(a/b==c||b/a==c)
		return true;
	else return false;
}
}
