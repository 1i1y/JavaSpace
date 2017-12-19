//for的寫法
public class TestFor{
	public static void main(String args[]){
		int[] nums = {1,2,3,4,5};
	
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
		
		//*****************************
		//for(元素:集合)
		for(int n:nums){
			System.out.println(n);
		}
		
		//****************************
		//****************************
		//二維的給法與印法
		int[][] nums2 = {{10,20,30},{40,50,60,70}};
		for(int[] ns:nums2){
			for(int n:ns){
				System.out.println(n);
				//第1筆資料：10
				//第2筆資料：20
				//白話:第一個for,  int[]是nums2外面的{}，叫ns(這個等等會再用到)，
				//在迴圈內再放入第二個for,取來自ns 的陣列，再找 int 叫 n, 取二維陣列內的一維陣列的值
			}
		}
	}
}