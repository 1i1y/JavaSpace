//for���g�k
public class TestFor{
	public static void main(String args[]){
		int[] nums = {1,2,3,4,5};
	
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
		
		//*****************************
		//for(����:���X)
		for(int n:nums){
			System.out.println(n);
		}
		
		//****************************
		//****************************
		//�G�������k�P�L�k
		int[][] nums2 = {{10,20,30},{40,50,60,70}};
		for(int[] ns:nums2){
			for(int n:ns){
				System.out.println(n);
				//��1����ơG10
				//��2����ơG20
				//�ո�:�Ĥ@��for,  int[]�Onums2�~����{}�A�sns(�o�ӵ����|�A�Ψ�)�A
				//�b�j�餺�A��J�ĤG��for,���Ӧ�ns ���}�C�A�A�� int �s n, ���G���}�C�����@���}�C����
			}
		}
	}
}