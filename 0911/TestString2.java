//.currentTimeMillis() �{�b�ɶ�
public class TestString2{
	public static void main(String args[]){
		//System.out.println("Hello" + "Java");
		//                 + ���t new�A�|��O����n�Ŷ�
		
		long bt = System.currentTimeMillis();
		/*
		String tmp = "";
		
		for(int i=0;i<100000;i++){
			tmp = tmp +i;
		}
		*/
		
		StringBuilder sb = new StringBuilder("");
		for(int i=0;i<10000000;i++){
			sb.append(i);
		}
		//System.out.println(sb.toString());
		long et = System.currentTimeMillis();
		
		System.out.println("����ɶ��G"+(et-bt)+"ms");
	}
}