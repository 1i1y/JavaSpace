/*
跳出迴圈
break 跳出最接近的一個迴圈
continue 忽略最接近的一個迴圈
*/
public class TestBC{
	public static void main(String args[]){
		 
		/*
		第一次練習 :break
		 for (int i=0;i<10;i++){
			 if (i==4){
				 break;
			 }
			System.out.println(i);
		}
		
		第一次練習 :continue
		for (int i=0;i<10;i++){
			 if (i==4){
				continue;
			 }
			System.out.println(i);
		}
		*/
		
		
		/*
		label, 指定跳出區域
		*/
		b_label:{
			c_label:
			for(int j=0; j<5;j++)
			{
				for(int i=0;i<10;i++){
					if(i==7){
						//continue;
						//break;
						continue c_label;
						//break b_label;
					}
					System.out.print(i);
				}
				System.out.println();
			}
		}
		
	}
}