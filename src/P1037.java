import java.util.Scanner;


public class P1037 {
public static void main(String[] args) {//�˻ʺ����⣬ÿ��ÿ�б�����ֻ�ܰ�һ��
	Scanner cin=new Scanner(System.in);
	int n=8;
	int []queen=new int[n];
	backTrack(queen);
	
	cin.close();
}

public static boolean isPlace(int k,int []queen){
for(int i=0;i<k;i++)
	if(queen[i]==queen[k]||(k-i)==(queen[i]-queen[k])||
	(k-i)==(queen[k]-queen[i]))
	return false;
return true;
}
public static void backTrack( int []queen) {
	queen[0]=0;
	
	
	
}
}
