/* for        while       do while
For�]������
for(1��;2���L;4�B��){
	3
}

while
1�ŧi
while(2���L)
	3
	4�B��
*/

public class TestFor{
	public static void main (String args[]){

		for (int i =0; i<3;i++){
			System.out.println(i);
		}
				
		/*
		�ܧ�
		int i=0
		for(;i<3;){
			System.out.println(i);
			i++;
		}
		*/
		
		int j=0;
		while(j<3){
			System.out.println(j);
			j++;
		}
		
		int k=4;
		do{
			System.out.println(k);
			k++;
		}while(k<3);
	}	
}