/*
Wrap �]��
8���ܼƳ��i�H�A�Ĥ@�ӧ�j�g�N�ܦ����O
int> Integer
char > Character

�M��(package)
	���O(class)
		�ݩ�(field)
		�غc�l(constructor)
		��k(method)
*/

public class TestWrap{
	public static  void main (String args[]){
		int i=10;
		// �ϥ�Integer�ӥ]��int���
		Integer I1 = new Integer (i);
		Integer I2 = new Integer (20);
		//��double�����P�Ϊk
		System.out.println((double)i/3);
		System.out.println( I1.doubleValue()/3);
		System.out.println( I1.compareTo (I2));
		//compareTo ���
		//�i�H�d java api �F�ѧ�h�\��
		
		Integer I3 = 128;
		Integer I4 = 128;
		
		System.out.println( I3==I4);
		//0~127�e�O�@�ΡA�|�o��true
		//128�H�W�A�|�o��false
		
		
	}
}