//給CountMain的class
public class Counter{
	private static int SN; //目前的號碼
	private int number;    //自己拿到的號碼
	
	//會自動跳號，一個是目前的號碼，一個是自己拿到的號碼
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