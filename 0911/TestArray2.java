//二維陣列寫法
public class TestArray2{
	public static void main(String args[]){
		//第一種寫法
		int[][] arr = new int[2][3];
		arr[0][0] = 85;
		arr[0][1] = 99;
		arr[0][2] = 67;
		
		arr[1][0] = 55;
		arr[1][1] = 68;
		arr[1][2] = 84;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr);
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println(arr[i][j]);
			}
		}
		//第二種寫法
		int[][] arr2 = {{11,18,85,99,67} , {0,55,68,84}};
		
		for(int i=0;i<arr2.length;i++){
			for(int j=0;j<arr2[i].length;j++){
				System.out.println(arr2[i][j]);
			}
		}
	}
}