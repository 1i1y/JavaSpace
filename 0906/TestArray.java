/*
Array �}�C
�ŧi: 
int[] scores = new int[5]; >5�Ӧ�m
int[] scores = new int[500]; >500�Ӧ�m

�e��ر`��
int[] __ = { , , , ,};

�H�U�T���\�k�ҥi
int[] scores 
int scores []
int []scores

*/

public class TestArray{
	public static void main (String args[]){
		
		//��1:
		//1.�ŧi
		int[] scores = new int[5];
		//2.����
		scores[0]=90;
		scores[1]=88;
		scores[2]=87;
		scores[3]=78;
		scores[4]=60;
		//3.�ϥ�
		for (int i=0;i<5;i++){
			System.out.println(scores[i]);
		}
		System.out.println();
		
		//��2:
		//1.�ŧi 2.����
		int[] scores2 = {90,88,87,78,60};
		//3.�ϥ�
		for (int i=0;i<scores2.length;i++){
			System.out.println(scores2[i]);
		}		
		System.out.println();
		
		//��3:
		//1.�ŧi 2.����
		int[] scores3 = new int[]{90,88,87,78,60};
		//3.�ϥ�
		for (int i=0;i<scores3.length;i++){
			System.out.println(scores3[i]);
		}	
		
	}
}