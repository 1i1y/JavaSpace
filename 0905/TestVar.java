/*
�Ĥ@���ܼƹB��
*/

public class TestVar{	
	public static void main(String args[]){
		//���
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
		//Short  �S������`��,�����[1�A���Ȭ�int
		
		System.out.println(i);
		System.out.println(i+1);
		//long   ����`��,�ܦ��t��
		System.out.println(l);
		
		
		//�B�I��
		//float  �Ʀr���[�Wf��F,�j���ഫ�~���float��ܤp��
		float  f = 1.0f;
		//double �w�]�p�ơA�]�i�[d��D�A�S�v�T
		double d = 2.0;
		
		System.out.println(f);
		System.out.println(d);
		
		
		//�r���B���L
		//char �u���@�r��
		char       ch = 'A';
		char      ch2 = '��';
		char  chspace = ' ';
		//boolean true �� false
		boolean  bool = true;
		boolean boolf = false;
		System.out.println(ch);
		System.out.println(ch2);
		System.out.println(bool);
		System.out.println(boolf);
		
		
	}
}