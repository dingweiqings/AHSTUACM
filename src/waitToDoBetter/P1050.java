package waitToDoBetter;


import java.util.Scanner;

/*
 * 
 C���ԺϷ���ʶ��

 Time Limit:1000MS  Memory Limit:65536K
 Total Submit:137 Accepted:70

 Description

 ����һ���ַ������ж����Ƿ���C�ĺϷ���ʶ����

 Input

 �������ݰ����������ʵ�������ݵĵ�һ����һ������n,��ʾ����ʵ���ĸ�����Ȼ����n���������ݣ�ÿ����һ�����Ȳ�����150���ַ�����

 Output

 ����ÿ���������ݣ����һ�С��������������C�ĺϷ���ʶ���������"yes"�����������no����
 3
12ajf
fi8x_a
ff  ai_2
 *
 */
public class P1050 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		boolean flag=false;
		boolean flag1=false;
		int k=1;
		while (N-- > 0) {//���ж����Լ�
			  if(k-->0)
			cin.nextLine();//�������ջس���,������һ�е�һ���ַ����ǿմ���
			                   //�����Խ��
			String s = cin.nextLine();
			/*if (s.charAt(0)>='0'&&s.charAt(0)<='9'){
			System.out.println("no");
			flag1=false;
		continue;
		}*/
			if(s.indexOf(' ')!=-1){
				System.out.println("no");//�÷������ش��ַ����е�һ�γ���ָ���ַ�����������
				 flag1=false;                         //������ַ�����û���������ַ����򷵻� -1������ֵ����Ϊint�͡� 
			continue;
			}
			//System.out.println(s);
			
		
			char[] b= s.toCharArray();
		
           if(b[0] >= '0'&& b[0] <= '9'){
              flag1=false;
            	System.out.println("no");
            continue;
            }
			
			for (int i = 0; i < s.length(); i++) {
				
			
				if (b[i] == '_' || (b[i] >= 'A' && b[i] <= 'Z')
						|| (b[i] >= 'a' && b[i] <= 'z'))
				flag1=true;


			}
			
	if(flag1) System.out.println("yes");
		
		}
	}
		
}
