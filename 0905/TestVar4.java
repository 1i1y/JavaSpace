/*
�ĥ|���ܼ��ܤ�
++ --

	EXAM2
		int a=3;
		int b=7;
		System.out.println(a++ > 3 && --b<7); // 3>3 true, �᭱�N����F java�n�i��~~~~~~~~~~~~~~~~
		System.out.println(a); //4
		System.out.println(b); //7
		// && || �u���B��l
		// && �@�̬�false,�h����false
		// || �@�̬�true ,�h����true

*/

public class TestVar4{
	public static void main(String args[]){
		int i=5;
		int j=5;
		System.out.println(i++); //�����ȡA�A�[1 =5  '�M��i+1��6
		System.out.println(i);   //6
		System.out.println(++j); //���[1�A�A���� =1+5   =6
		System.out.println(j);   // 6
		//�ثe i=6, j=6
		System.out.println(i--); //�����ȡA�A��1 =6  '�M��i-1��5
		System.out.println(i);   //5
		System.out.println(--j); //����1�A�A���� =-1+6=5
		System.out.println(j);   //5
		
		int m=5;
		int n=5;
		System.out.println( m++ + --n + n-- + ++m ); //5+4+4+7=20
				
		
	}	
}