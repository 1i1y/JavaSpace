//String Pool �r��� : �S��new���ܡA���̷|�@�ΦP�@�ӰO���骺��l��~
public class TestString{
	public static void main(String args[]){
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		//String Pool �r���
		System.out.println(str1 == str2); // true
		System.out.println(str3 == str4); // false		
	}
}