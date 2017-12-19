/*
第四次變數變化
++ --

EXAM2 && || & | 

*/

public class TestVar4Exam2{
	public static void main(String args[]){
		int a=3;
		int b=7;
		System.out.println(a++ > 3 && --b<7); // 3>3 true, 後面就不算了 java好懶啊~~~~~~~~~~~~~~~~
		System.out.println(a); //4
		System.out.println(b); //7
		// && || 短路運算子
		// && 一者為false,則全為false
		// || 一者為true ,則全為true
		
		a=3;
		b=7;
		System.out.println(++a > 3 || b--<7); // 3>3 true
		System.out.println(a); //4
		System.out.println(b); //7
		// && || 短路運算子
		// && 一者為false,則全為false
		// || 一者為true ,則全為true
		
		System.out.println(++a > 3 & b--<7); // 3>3 true
		System.out.println(a); //4
		System.out.println(b); //7
		
		System.out.println(++a > 3 | b--<7); // true
		System.out.println(a); //6
		System.out.println(b); //5
		
		
	}	
}