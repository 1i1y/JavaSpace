/*

1. �ϥ�Math.random()���ͤ@��1~10�����������Ʀr�C
2. �]�p�j�鴣�ѿ�J�������סA�åB���ܬO�ĴX���q�D�C
3. �������j�h���ܤp�@�I�A�Ϥ��h���ܤj�@�I�C�Y����h��ܴX���q�D�A���ߵ���C

Math ���O�N�w�q�F�@�Ӥ�k random()�A�o�Ӥ�k�i�H���ͶüơA�䫬�A�� double 
�üƪ����ͦ��@�ӽd��A������ 0~1 �����A���O������ 1 
*/

import java.util.*;
public class HomeWork{
	public static void main (String args[]){
		//����=i
		int i = 0;
		i = (int)(Math.random()*10)+1;
		System.out.println(i+"<<�o�O���סA���ЧA���ˬݤ����A����~");
		//��J��������
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�q�q�����Ʀr");
		System.out.print("�п�J1~10���Ʀr:");
		int num = scan.nextInt();
		
		true_label:
		for (int times = 1;;times++){
			
			if (num >=1 && num <= 10){
				
				if (num == i ){
					System.out.println("��"+times+"���q��F!!");
					break true_label;
				}
				else if (num > i){
					System.out.println("��"+times+"���q�j�F");
					System.out.print("�ЦA��J�Ʀr");
					num = scan.nextInt();
				}
				else if (num < i){
					System.out.println("��"+times+"���q�p�F");
					System.out.print("�ЦA��J�Ʀr");
					num = scan.nextInt();
				}
				
			}
			else{
				System.out.println("�Ӷê���~");
				System.out.print("�ЦA��J�Ʀr");
				num = scan.nextInt();
			}		
		}
	}
}
		