/*
switch判斷 byte short int* char* String Enum

switch
	case():
		break;
	case():
		break;
	default:

追加
switch
	case():
	case():
	case():
		break;
	default:
	
*/
import java.util.*;
public class TestSwitch{
	public static void main (String args[]){
		Scanner scan = new Scanner (System.in);		
		char food = scan.next().charAt(0); //.charAt(0) 抓字串第一碼
		
		/*
		第一次寫有break的
		switch(food){
			case 'A':
				System.out.println("主餐");
				break;
			case 'B':
				System.out.println("主餐");
				System.out.println("濃湯");
				break;
			case 'C':
				System.out.println("主餐");
				System.out.println("濃湯");
				System.out.println("甜點");
				break;
			default:
				System.out.println("有誤");
		*/
		
		switch(food){
			case 'C':
				System.out.println("甜點"); //food=C , 甜點 , 沒有break跳出迴圈，+濃湯+主餐
			case 'B':
				System.out.println("濃湯"); //food=B , 甜點 , 沒有break跳出迴圈，+濃湯+主餐
			case 'A':
				System.out.println("主餐");
				break;
			default:
				System.out.println("有誤");					
				
		}//switch end
	}//main method end
}//class end