//String Pool 字串池 : 沒有new的話，它們會共用同一個記憶體的格子喔~
public class TestString{
	public static void main(String args[]){
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		//String Pool 字串池
		System.out.println(str1 == str2); // true
		System.out.println(str3 == str4); // false		
	}
}