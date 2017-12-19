/*
Wrap 包裏
8個變數都可以，第一個改大寫就變成類別
int> Integer
char > Character

套件(package)
	類別(class)
		屬性(field)
		建構子(constructor)
		方法(method)
*/

public class TestWrap{
	public static  void main (String args[]){
		int i=10;
		// 使用Integer來包裏int資料
		Integer I1 = new Integer (i);
		Integer I2 = new Integer (20);
		//轉double的不同用法
		System.out.println((double)i/3);
		System.out.println( I1.doubleValue()/3);
		System.out.println( I1.compareTo (I2));
		//compareTo 比較
		//可以查 java api 了解更多功能
		
		Integer I3 = 128;
		Integer I4 = 128;
		
		System.out.println( I3==I4);
		//0~127前是共用，會得到true
		//128以上，會得到false
		
		
	}
}