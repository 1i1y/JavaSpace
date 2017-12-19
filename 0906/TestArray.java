/*
Array 陣列
宣告: 
int[] scores = new int[5]; >5個位置
int[] scores = new int[500]; >500個位置

前兩種常用
int[] __ = { , , , ,};

以下三種擺法皆可
int[] scores 
int scores []
int []scores

*/

public class TestArray{
	public static void main (String args[]){
		
		//版1:
		//1.宣告
		int[] scores = new int[5];
		//2.給值
		scores[0]=90;
		scores[1]=88;
		scores[2]=87;
		scores[3]=78;
		scores[4]=60;
		//3.使用
		for (int i=0;i<5;i++){
			System.out.println(scores[i]);
		}
		System.out.println();
		
		//版2:
		//1.宣告 2.給值
		int[] scores2 = {90,88,87,78,60};
		//3.使用
		for (int i=0;i<scores2.length;i++){
			System.out.println(scores2[i]);
		}		
		System.out.println();
		
		//版3:
		//1.宣告 2.給值
		int[] scores3 = new int[]{90,88,87,78,60};
		//3.使用
		for (int i=0;i<scores3.length;i++){
			System.out.println(scores3[i]);
		}	
		
	}
}