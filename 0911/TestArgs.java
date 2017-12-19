public class TestArgs{
	public static void main(String args[]){
		//java TestArgs 123
		/*
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
		*/
		
		//迴圈連續印值的方法，上面沒scan
		for(String s:args){
			System.out.println(s);
		}
		
		
		String Answer = "A,A,B,C,D";
		String[] Ans = Answer.split(",");
		System.out.println(Ans[0]);//第1題的答案是A
		System.out.println(Ans[1]);
		System.out.println(Ans[2]);
		System.out.println(Ans[3]);
		System.out.println(Ans[4]);
	}
}