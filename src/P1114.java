import java.util.Scanner;
public class P1114 {

public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		int a=cin.nextInt();
		int b=cin.nextInt();
		for(int i=a;i<=b;i++)
		if(isFlower(i))
		System.out.println(i);
	}
	cin.close();
}

private static boolean isFlower(int i) {
	if(i>=1000)
	return false;
   return i==153||i==370||i==371||i==407;
}

}
