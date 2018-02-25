import java.util.Scanner;
public class P1226 {
public static void main(String[] args) {
	 Scanner cin=new Scanner(System.in);
	 while(cin.hasNext()){
		 int n=cin.nextInt();
		 int m=cin.nextInt();
		 
		 System.out.println(Cnm(n,m));
	 }
	 cin.close();
}
public static int Cnm(int n,int m){//求组合数
	int tn=1,tm=1;
	for(int i=n-m+1;i<=n;i++)
		tn*=i;
	for(int i=1;i<=m;i++)
		tm*=i;
	return tn/tm;
}
}
