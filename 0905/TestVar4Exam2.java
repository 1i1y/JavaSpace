/*
�ĥ|���ܼ��ܤ�
++ --

EXAM2 && || & | 

*/

public class TestVar4Exam2{
	public static void main(String args[]){
		int a=3;
		int b=7;
		System.out.println(a++ > 3 && --b<7); // 3>3 true, �᭱�N����F java�n�i��~~~~~~~~~~~~~~~~
		System.out.println(a); //4
		System.out.println(b); //7
		// && || �u���B��l
		// && �@�̬�false,�h����false
		// || �@�̬�true ,�h����true
		
		a=3;
		b=7;
		System.out.println(++a > 3 || b--<7); // 3>3 true
		System.out.println(a); //4
		System.out.println(b); //7
		// && || �u���B��l
		// && �@�̬�false,�h����false
		// || �@�̬�true ,�h����true
		
		System.out.println(++a > 3 & b--<7); // 3>3 true
		System.out.println(a); //4
		System.out.println(b); //7
		
		System.out.println(++a > 3 | b--<7); // true
		System.out.println(a); //6
		System.out.println(b); //5
		
		
	}	
}