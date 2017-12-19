/*
第四次變數變化
++ --

	EXAM2
		int a=3;
		int b=7;
		System.out.println(a++ > 3 && --b<7); // 3>3 true, 後面就不算了 java好懶啊~~~~~~~~~~~~~~~~
		System.out.println(a); //4
		System.out.println(b); //7
		// && || 短路運算子
		// && 一者為false,則全為false
		// || 一者為true ,則全為true

*/

public class TestVar4{
	public static void main(String args[]){
		int i=5;
		int j=5;
		System.out.println(i++); //先取值，再加1 =5  '然後i+1變6
		System.out.println(i);   //6
		System.out.println(++j); //先加1，再取值 =1+5   =6
		System.out.println(j);   // 6
		//目前 i=6, j=6
		System.out.println(i--); //先取值，再減1 =6  '然後i-1變5
		System.out.println(i);   //5
		System.out.println(--j); //先減1，再取值 =-1+6=5
		System.out.println(j);   //5
		
		int m=5;
		int n=5;
		System.out.println( m++ + --n + n-- + ++m ); //5+4+4+7=20
				
		
	}	
}