/*
第一次變數運用
*/

public class TestVar{	
	public static void main(String args[]){
		//整數
		//byte -128~127
		byte  b = 10;
		byte  ByteMin = Byte.MIN_VALUE;
		byte  ByteMax = Byte.MAX_VALUE;
		//short -32758~32767
		short s = 20;
		short ShortMin = Short.MIN_VALUE;
		short ShortMax = Short.MAX_VALUE;
		//int   Integer.MIN_VALUE ~ Integer.MAX_VALUE
		int   i = Integer.MAX_VALUE;
		//long  Long.MIN_VALUE ~ Long.MAX_VALUE
		long  l = Long.MAX_VALUE;
		
		System.out.println(b);
		System.out.println(ByteMin);
		System.out.println(ByteMax);
		
		System.out.println(s);
		System.out.println(ShortMin);
		System.out.println(ShortMax);
		System.out.println(ShortMax+1);
		//Short  沒有溢位循環,直接加1，但值為int
		
		System.out.println(i);
		System.out.println(i+1);
		//long   溢位循環,變成負數
		System.out.println(l);
		
		
		//浮點數
		//float  數字後方加上f或F,強制轉換才能用float顯示小數
		float  f = 1.0f;
		//double 預設小數，也可加d或D，沒影響
		double d = 2.0;
		
		System.out.println(f);
		System.out.println(d);
		
		
		//字元、布林
		//char 只能單一字元
		char       ch = 'A';
		char      ch2 = '陳';
		char  chspace = ' ';
		//boolean true 或 false
		boolean  bool = true;
		boolean boolf = false;
		System.out.println(ch);
		System.out.println(ch2);
		System.out.println(bool);
		System.out.println(boolf);
		
		
	}
}