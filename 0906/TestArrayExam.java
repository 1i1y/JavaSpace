/*
���ֳz��6�Ӹ��X
Math.random() �ü� 0~1�������p�ơA��0�S��1
���g�A�p�󤣭��ƪ�����
*/

public class TestArrayExam{
	public static void main (String args[]){
		int[] number = new int[6]; //��6�Ӧ�m
		/*
		do{
			System.out.println(k);
			k++;
		}while(k<;
		*/
		
		for (int i=0;i<number.length;i++){
			number[i]=(int)(Math.random()*42)+1; //������ܤj�A��ƫ�(0~41)�A�[1(1~42)
			System.out.println(number[i]);
		}		
		System.out.println();
		
	
		
	}
}