/*
�ĤT���ܼ��ܤ�
% �D�l�ơBboolean �B��B�G�i��B��
*/

public class TestVar3{
	public static void main(String args[]){
		
		//�l�� %
		System.out.println(7+3);
		System.out.println(7-3);
		System.out.println(7*3);
		System.out.println(7/3); // �`�N�Oint ,=2
		System.out.println(7%3); // �D�l�� 7/3= 2...1 ,=1
		
		//���L�B�� == !=
		System.out.println(7>3);
		System.out.println(7>=3);
		System.out.println(7<3);
		System.out.println(7<=3);
		System.out.println(7==3);//7�O"��"�۵�3�A=false
		System.out.println(7!=3);//7"�O"���۵�3�A=true	
		
		//�B��  && || !
		int number = 75;
		System.out.println(number>70 && number<80);  // &&�B
		System.out.println(number>70 || number<80);  // ||��
		System.out.println(!(number>70)); // !�Ϭ�
		
		//EXAM i=10
		int i=5;                 //�ŧii
		System.out.println(i=10);//10�ȵ�i, i=10
		System.out.println(i==10);//10==10 , true
		
		//�G�i��B��: & and     | or     ^����    ~�ɼ�
		System.out.println(7&3); //0111&0011 = 0011 =3
		System.out.println(7|3); //0111|0011 = 0111 =7
		System.out.println(7^3); //0111^0011 = 0100 =4
		System.out.println(~3); //00000011 => 10000100 =-4
		System.out.println(~7); //00000111 => 10001000 =-8
		System.out.println(Integer.toBinaryString(~3)); //��ܤG�i��
		
		System.out.println(6&9); //0110&1001 = 0000 =0
		System.out.println(6|9); //0110|1001 = 1111 =15
		System.out.println(~9); //00001001 = 10010110 =-16
		System.out.println(~6); //00000110 = 10001001 =-7
		//<<����  >>�k�� >>>���k��
		System.out.println(6<<2); //0000110 = 0011000 =24
		System.out.println(6>>2); //0110 = 0000001 = 1
		System.out.println(6>>>2); //0110 = 0000001 = 1 �A���k��
		System.out.println(-6>>>2); // �]��32�줸�A�ҥH�Ʀr�ܪ��K
		System.out.println(Integer.toBinaryString(-6)); //��ܤG�i��
		System.out.println(Integer.toBinaryString(-6>>>2)); //��ܤG�i��
		System.out.println("00"+Integer.toBinaryString(-6>>>2)); //��ܤG�i��A�֤F�e����0�A�ɤW
	}
}