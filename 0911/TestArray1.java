//陣列寫法
public class TestArray1{
	public static void main(String args[]){
		//第一種陣列使用法
		int[] nums1 = new int[3];
		//nums1[0] = 95;
		//nums1[1] = 86;
		//nums1[2] = 78;
		//nums1[3] = 55;
		for(int i=0;i<nums1.length;i++){
			System.out.println(nums1[i]);
		}
		
		//第二種陣列使用法
		int[] nums2 = {95,86,78};
		for(int i=0;i<nums2.length;i++){
			System.out.println(nums2[i]);
		}
		
		//第三種陣列使用法
		int[] nums3 = new int[]{95,86,78};
		for(int i=0;i<nums3.length;i++){
			System.out.println(nums3[i]);
		}
	}
}