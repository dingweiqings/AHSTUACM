
public class ForJiu {

	public static void main(String[] args) {
           int j=1;
		for(int i=1;i<=9;j++){
			
			int temp=i;
			System.out.print(String.format("%d*%d=%d ",j,temp,temp*(j)));
		
			if(i==j){
				System.out.println();
				i++;
				j=0; 
			}
		}

	}

}
