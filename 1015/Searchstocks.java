public class Searchstocks{
	public static void main(String args[]) throws Exception{
		
		TestStock now = new TestStock();
		String[] test = now.getNow();
		
		SQLinput inp  = new SQLinput();
		inp.CreateConnection();
		inp.CreateTable("10��ѻ�");
		
		for (String p :test){
			inp.Insert("10��ѻ�",p);
		}
	}
}

