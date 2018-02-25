package tongji;
/*
 * �γ̱���

Time Limit:1000MS  Memory Limit:65536K
Total Submit:138 Accepted:67

Description

�γ̱����ֳơ����г��ȱ��롱���г̳��ȱ��롱����һ��ͳ�Ʊ��룬�ñ�����������ѹ�����롣���ڶ�ֵͼ��Ч�� ����RLE�г̳��ȱ����������Ŀǰ, ѹ�������Ѿ��㷺Ӧ���ڸ��������������Ӱ���ʽ�������ܵ���˵, �����ֽ�Ȼ��ͬ��ͼ���ʽѹ������: ����ѹ��������ѹ��[1]������ѹ�������Ӿ�ʶ���ԭ����Դ���ѹ���ļ�������, ���ǻ�Ӱ��ͼ������������ѹ���Ļ���ԭ������ͬ����ɫ��Ϣֻ�豣��һ��, ����ɾ��һЩ�ظ�����, ������Ҫ�ڴ����ϱ����ͼ�������������ѹ���������ŵ����ܹ��ȽϺõر���ͼ�������, �����������ѹ����˵���ַ�����ѹ�����ǱȽϵ͵ġ����õ�����ѹ���㷨�� RLE��LZW �ȡ� RLE ѹ���㷨�Ļ���ԭ����RLE(Run- Length Encoding �г̳��ȱ���)ѹ���㷨��Windows ϵͳ��ʹ�õ�һ��ͼ���ļ�ѹ������, �����˼����: ��һɨ��������ɫֵ��ͬ�����������������ֽ�����ʾ, ��һ���ֽ���һ������ֵ, ����ָ�������ظ��Ĵ���; �ڶ����ֽ��Ǿ������ص�ֵ[2]����Ҫͨ��ѹ�����������е������ֽڻ��ֽ��е�����λ,�Ӷ��ﵽ�����ļ���ռ�ռ��Ŀ�ġ� 
����, ��һ��ʾ��ɫ����ֵ���ַ���RRRRRGGBBBBBB,�� RLE ѹ������ѹ������� 5R2G6B ������,��Ȼ���ߵĴ����ȱ�ǰ�ߵĴ�����С�öࡣ����ʱ���������ʱ���õ���ͬ�������, ��ԭ��õ���������ѹ��ǰ��������ȫ��ͬ�����, RLE ������ѹ�������� 

Input

����ĵ�һ����һ������N��ʾ��N��������ݡ� 
������N�У�ÿ�ж���һ���ַ�����(��Сд��ĸ����ҳ���С��1000)

Output

�������ַ�����

Sample Input


2
aabbbb
iiiiillllovvveeeeeeeaaaccccccccmmmmmmmmmm
Sample Output


2a4b
5i4l1o3v7e3a8c10m
Hint
 */


import java.util.Scanner;

public class P1138 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		int n=cin.nextInt();
		while(n-->0){
		String s=cin.next();
		
       
        System.out.println(RLEcount(s)); 
       
		}
		
	}
	cin.close();
}
public static String  RLEcount(String s){//�γ̱���ʵ�֣������ַ�����
	s=s+s.charAt(s.length()-1);//�������ַ������һ��Ԫ��
	boolean flag=false;//�����ڲ�ѭ��
	StringBuffer sr=new StringBuffer();
char []chs=s.toLowerCase().toCharArray();//ת������

int k=0;//�ظ����ּ�������
for(int i=0;i<chs.length;i=i+k){
	flag=false;
	for(int j=i;j<chs.length-1  /*����С��chs.length,�����Խ��*/;j++){
		if((j==chs.length-2)||chs[j]!=chs[j+1]){
			k=j-i+1;
			sr.append(k);//д���ַ��ظ�����
			sr.append(chs[i]);//д���ַ�
	        flag=true;
		}
			
			if(flag)
				break;//�����ڲ�ѭ���˳�
	}
	
}

return sr.toString();//��srת��String ���ͷ���
}

}

		
