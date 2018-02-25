import java.util.Scanner;
public class P1339 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		int n=cin.nextInt();
		while(n-->0){
			int score=cin.nextInt();
			if(score<0||score>100)
				System.out.println("Score is error");
			else
			System.out.println(T(score));
		}
	}
	cin.close();
}

public static char T(int score) {//百分制转成等级制
	char res='A';
	switch(score/10){
	case 10: res='A';
	case 9:res='A';
	break;
	case 8:res='B';
	break;
	case 7:res='C';
	break;
	case 6:res='D';
	break;
   default :res='E';

		
	}
	return res;
}
}
