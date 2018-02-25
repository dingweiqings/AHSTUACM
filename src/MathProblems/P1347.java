package MathProblems;
import java.util.Scanner;
public class P1347 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
while(cin.hasNext()){
	int n=cin.nextInt();
	System.out.println(howmany0(n));
}
	cin.close();
}

private static int  howmany0(int n) {
int r=0;

for(int i=1;i<=n;i++){
int j=i;
	while(j%5==0)
{
	r++;
	j/=5;
}

}
	return r;
}
}
