/*
���X�j��
break ���X�̱��񪺤@�Ӱj��
continue �����̱��񪺤@�Ӱj��
*/
public class TestBC{
	public static void main(String args[]){
		 
		/*
		�Ĥ@���m�� :break
		 for (int i=0;i<10;i++){
			 if (i==4){
				 break;
			 }
			System.out.println(i);
		}
		
		�Ĥ@���m�� :continue
		for (int i=0;i<10;i++){
			 if (i==4){
				continue;
			 }
			System.out.println(i);
		}
		*/
		
		
		/*
		label, ���w���X�ϰ�
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