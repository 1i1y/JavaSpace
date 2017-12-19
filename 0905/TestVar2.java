/*
第二次變數變化
*/

public class TestVar2{
	public static void main (String args[]){
		
		/*
		注意小數的呈現
		System.out.println(10/3); 整數除整數 = 3
		System.out.println(10/3.0); int/double =3.333....5
		System.out.println((double)10/3); double10 再除3  =3.333....5
		System.out.println((double) (10/3)); double 3, () 內先處理 =3
		*/
		System.out.println(10/3);
		System.out.println(10/3.0);
		System.out.println((double)10/3);
		System.out.println((double) (10/3));
			
			
		/*
		整數長度轉換
		((short)32768) 轉換為short =-32768
		(3123456789L) L用大寫，與1區隔。強制轉為long
		*/
		System.out.println((short)32768);
		System.out.println(3123456789L);
		
		
		//字元與整數轉換
		System.out.println((int)'A');
		System.out.println((int)'B');
		System.out.println((int)'C');
		System.out.println((char)68);
		System.out.println((char)69);
		System.out.println((char)70);
		
		System.out.println((char)68 + 'L'); // char + char > int 它默默的改的，因為運算是用cpu ,=144
		System.out.println((char)68+1); //char + int > int ,=69
		System.out.println('a'+'b');// char + char > int 它默默的改的 ,=195
		
		
		
		
	}
}