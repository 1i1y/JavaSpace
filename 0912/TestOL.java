
public class TestOL{
	public static void main(String args[]){
		
		System.out.println(sum(100,200));
		System.out.println(sum(100,200,300));
		System.out.println(sum(100,200,300,400));
		System.out.println(sum(10,20,30,40,50));
		/*
		sum 加法, 下面才寫這個是怎麼加的
		static int sum(int a,int b){
			return a+b;
		}
		static int sum(int a,int b, int c){
			return a+b+c;
		}
		static int sum(int a,int b, int c, int d){
			return a+b+c+d;
		}
		*/
	}
		//自製的 sum 的規則
		//int... 代表這個sum是不定長度引數，這些的值都會做下面的動作
		//static 表靜態
		static int sum(int... nums){
		int result=0;
		for(int n:nums){
			result += n;
		}
		return result;
	}
	
}