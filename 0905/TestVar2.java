/*
�ĤG���ܼ��ܤ�
*/

public class TestVar2{
	public static void main (String args[]){
		
		/*
		�`�N�p�ƪ��e�{
		System.out.println(10/3); ��ư���� = 3
		System.out.println(10/3.0); int/double =3.333....5
		System.out.println((double)10/3); double10 �A��3  =3.333....5
		System.out.println((double) (10/3)); double 3, () �����B�z =3
		*/
		System.out.println(10/3);
		System.out.println(10/3.0);
		System.out.println((double)10/3);
		System.out.println((double) (10/3));
			
			
		/*
		��ƪ����ഫ
		((short)32768) �ഫ��short =-32768
		(3123456789L) L�Τj�g�A�P1�Ϲj�C�j���ରlong
		*/
		System.out.println((short)32768);
		System.out.println(3123456789L);
		
		
		//�r���P����ഫ
		System.out.println((int)'A');
		System.out.println((int)'B');
		System.out.println((int)'C');
		System.out.println((char)68);
		System.out.println((char)69);
		System.out.println((char)70);
		
		System.out.println((char)68 + 'L'); // char + char > int ���q�q���諸�A�]���B��O��cpu ,=144
		System.out.println((char)68+1); //char + int > int ,=69
		System.out.println('a'+'b');// char + char > int ���q�q���諸 ,=195
		
		
		
		
	}
}