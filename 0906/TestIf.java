/*
IF�y�k

if(����)
 ���z�y�@;
else
 ���z�y�G; 

��ĳ�@�}�l�����z�y����b{}���A�M��if �i�H�_��
*/
import java.util.*; //�o��ܮe���ѰO�ASCAN~

public class TestIf{
	public static void main (String args[]){
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("���Ƶ��y");
		System.out.print("�п�J����:");
		double score = scan.nextDouble();
		//�o�̧�scan.nextInt(), �令scan.nextDouble(), �N�i�H�P�_���p�ƪ����Z�F
		
		if (score <=0 || score >= 100){
			System.out.println("�Ʀr���~!!");
		}
		else if (score >= 90){
			System.out.println("���Z�ή�!\n����A");
		}
		else if (score >= 80){
			System.out.println("���Z�ή�!\n����B");
		}
		else if (score >= 70){
			System.out.println("���Z�ή�!\n����C");
		}
		else if(score >= 60){
			System.out.println("���Z�ή�!\n����D");
		}
		else{
			System.out.println("���Z���ή�!\n����F");
			}
		//IF�W�h:���O0~100�A�~�P�_����
	}
}