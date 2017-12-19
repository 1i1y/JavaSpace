//看記憶體的運作 建立與回收
public class GcTest{
	String name="";
	static int i=0;
	
	public GcTest(String name){
		this.name=name;
		System.out.println(name+"被建立!");
	}
	protected void finalize(){
		//finalze　是物件被回收時會出來交待遺言
		System.out.println(name+"被回收!");
	}
	
	
	//上面的GcTest、finaliza算是建構子，下方是無限迴圈，空間不夠時就會出現被回收的字樣了
	public static void main (String args []){
		
		while(true){
			GcTest g = new GcTest("g"+ i++);
			g=null;  //把g清空，看會不會早點被回收
		}
	}
}