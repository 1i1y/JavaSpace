/*
¸õ²æ¦r¤¸
' => \' =39
" => \" =34
*/

public class TestChar{
	public static void main (String args[]){
		char ch1='a';
		char ch2='\''; // ¸õ²æ¦r¤¸
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println("\"Hello!\"");
		
		System.out.println((int)'\''); //39
		System.out.println((int)'\"'); //34
		System.out.println((int)'\n'); //10
		System.out.println((int)'\t'); //9
		
		System.out.println((char)1); 
		System.out.println((char)2); 
		System.out.println((char)3); 
		System.out.println((char)4); 
		System.out.println((char)5); 
		System.out.println((char)6); 
	}
}