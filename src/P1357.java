import java.util.Scanner;
public class P1357 {
public static void main(String[] args) {
	Scanner cin=null;
	cin=new Scanner(System.in);
	while(cin.hasNext()){
		//System.out.println(jiecheng(cin.nextInt()));
StringBuffer s=new StringBuffer(jiecheng(cin.nextInt())+"");
System.out.println(s.reverse());
	}
	cin.close();
}
public static long jiecheng(int n){//ÊäÈën,·µ»ØnµÄ½×³Ë
	long t=1l;
    
for(int i=1;i<=n;i++){
	t=t*i;
	
}
	return t;
}
}
