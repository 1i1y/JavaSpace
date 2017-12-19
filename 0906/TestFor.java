/* for        while       do while
For跑的順序
for(1值;2布林;4運算){
	3
}

while
1宣告
while(2布林)
	3
	4運算
*/

public class TestFor{
	public static void main (String args[]){

		for (int i =0; i<3;i++){
			System.out.println(i);
		}
				
		/*
		變形
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