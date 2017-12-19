/*
取樂透的6個號碼
Math.random() 亂數 0~1之間的小數，有0沒有1
未寫，如何不重複的部分
*/

public class TestArrayExam{
	public static void main (String args[]){
		int[] number = new int[6]; //給6個位置
		/*
		do{
			System.out.println(k);
			k++;
		}while(k<;
		*/
		
		for (int i=0;i<number.length;i++){
			number[i]=(int)(Math.random()*42)+1; //先把值變大，整數後(0~41)，加1(1~42)
			System.out.println(number[i]);
		}		
		System.out.println();
		
	
		
	}
}