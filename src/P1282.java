import java.util.Scanner;
public class P1282 {
public static void main(String[] args) {
	Scanner cin=null;
	cin=new Scanner(System.in);
	while(cin.hasNext()){
		int n=cin.nextInt();
		while(n-->0){
			System.out.println(String.format("%d", plus(cin.next(),cin.nextInt())));;
		}
	}
	cin.close();
}

private static int plus(String t, int b) {
	int r=0;
	char a=t.charAt(0);
	if(a>'a'&&a<'z')
		r=b-(a-32-'A'+1);
	else
		r=b+a-'A'+1;
	return r;
}
}
