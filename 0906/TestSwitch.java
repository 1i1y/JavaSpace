/*
switch�P�_ byte short int* char* String Enum

switch
	case():
		break;
	case():
		break;
	default:

�l�[
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
		char food = scan.next().charAt(0); //.charAt(0) ��r��Ĥ@�X
		
		/*
		�Ĥ@���g��break��
		switch(food){
			case 'A':
				System.out.println("�D�\");
				break;
			case 'B':
				System.out.println("�D�\");
				System.out.println("�@��");
				break;
			case 'C':
				System.out.println("�D�\");
				System.out.println("�@��");
				System.out.println("���I");
				break;
			default:
				System.out.println("���~");
		*/
		
		switch(food){
			case 'C':
				System.out.println("���I"); //food=C , ���I , �S��break���X�j��A+�@��+�D�\
			case 'B':
				System.out.println("�@��"); //food=B , ���I , �S��break���X�j��A+�@��+�D�\
			case 'A':
				System.out.println("�D�\");
				break;
			default:
				System.out.println("���~");					
				
		}//switch end
	}//main method end
}//class end