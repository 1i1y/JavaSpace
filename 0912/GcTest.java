//�ݰO���骺�B�@ �إ߻P�^��
public class GcTest{
	String name="";
	static int i=0;
	
	public GcTest(String name){
		this.name=name;
		System.out.println(name+"�Q�إ�!");
	}
	protected void finalize(){
		//finalze�@�O����Q�^���ɷ|�X�ӥ�ݿ�
		System.out.println(name+"�Q�^��!");
	}
	
	
	//�W����GcTest�Bfinaliza��O�غc�l�A�U��O�L���j��A�Ŷ������ɴN�|�X�{�Q�^�����r�ˤF
	public static void main (String args []){
		
		while(true){
			GcTest g = new GcTest("g"+ i++);
			g=null;  //��g�M�šA�ݷ|���|���I�Q�^��
		}
	}
}