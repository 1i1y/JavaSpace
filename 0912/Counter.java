//��CountMain��class
public class Counter{
	private static int SN; //�ثe�����X
	private int number;    //�ۤv���쪺���X
	
	//�|�۰ʸ����A�@�ӬO�ثe�����X�A�@�ӬO�ۤv���쪺���X
	Counter(){
		SN++;
		number = SN;
	}
	int getSN(){
		return SN;
	}
	int getNumber(){
		return number;
	}
}