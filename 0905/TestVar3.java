/*
第三次變數變化
% 求餘數、boolean 運算、二進位運算
*/

public class TestVar3{
	public static void main(String args[]){
		
		//餘數 %
		System.out.println(7+3);
		System.out.println(7-3);
		System.out.println(7*3);
		System.out.println(7/3); // 注意是int ,=2
		System.out.println(7%3); // 求餘數 7/3= 2...1 ,=1
		
		//布林運算 == !=
		System.out.println(7>3);
		System.out.println(7>=3);
		System.out.println(7<3);
		System.out.println(7<=3);
		System.out.println(7==3);//7是"不"相等3，=false
		System.out.println(7!=3);//7"是"不相等3，=true	
		
		//且或  && || !
		int number = 75;
		System.out.println(number>70 && number<80);  // &&且
		System.out.println(number>70 || number<80);  // ||或
		System.out.println(!(number>70)); // !反相
		
		//EXAM i=10
		int i=5;                 //宣告i
		System.out.println(i=10);//10值給i, i=10
		System.out.println(i==10);//10==10 , true
		
		//二進位運算: & and     | or     ^互斥    ~補數
		System.out.println(7&3); //0111&0011 = 0011 =3
		System.out.println(7|3); //0111|0011 = 0111 =7
		System.out.println(7^3); //0111^0011 = 0100 =4
		System.out.println(~3); //00000011 => 10000100 =-4
		System.out.println(~7); //00000111 => 10001000 =-8
		System.out.println(Integer.toBinaryString(~3)); //顯示二進位
		
		System.out.println(6&9); //0110&1001 = 0000 =0
		System.out.println(6|9); //0110|1001 = 1111 =15
		System.out.println(~9); //00001001 = 10010110 =-16
		System.out.println(~6); //00000110 = 10001001 =-7
		//<<左移  >>右移 >>>正右移
		System.out.println(6<<2); //0000110 = 0011000 =24
		System.out.println(6>>2); //0110 = 0000001 = 1
		System.out.println(6>>>2); //0110 = 0000001 = 1 ，正右移
		System.out.println(-6>>>2); // 因為32位元，所以數字很長…
		System.out.println(Integer.toBinaryString(-6)); //顯示二進位
		System.out.println(Integer.toBinaryString(-6>>>2)); //顯示二進位
		System.out.println("00"+Integer.toBinaryString(-6>>>2)); //顯示二進位，少了前方兩個0，補上
	}
}