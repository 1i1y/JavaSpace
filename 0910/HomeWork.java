/*

1. 使用Math.random()產生一個1~10之間的謎底數字。
2. 設計迴圈提供輸入謎底答案，並且提示是第幾次猜題。
3. 比謎底大則提示小一點，反之則提示大一點。若答對則顯示幾次猜題，恭喜答對。

Math 類別就定義了一個方法 random()，這個方法可以產生亂數，其型態為 double 
亂數的產生有一個範圍，它介於 0~1 之間，但是不等於 1 
*/

import java.util.*;
public class HomeWork{
	public static void main (String args[]){
		//謎底=i
		int i = 0;
		i = (int)(Math.random()*10)+1;
		System.out.println(i+"<<這是答案，但請你假裝看不見，謝謝~");
		//輸入謎底答案
		
		Scanner scan = new Scanner(System.in);
		System.out.println("猜猜謎底數字");
		System.out.print("請輸入1~10的數字:");
		int num = scan.nextInt();
		
		true_label:
		for (int times = 1;;times++){
			
			if (num >=1 && num <= 10){
				
				if (num == i ){
					System.out.println("第"+times+"次猜對了!!");
					break true_label;
				}
				else if (num > i){
					System.out.println("第"+times+"次猜大了");
					System.out.print("請再輸入數字");
					num = scan.nextInt();
				}
				else if (num < i){
					System.out.println("第"+times+"次猜小了");
					System.out.print("請再輸入數字");
					num = scan.nextInt();
				}
				
			}
			else{
				System.out.println("來亂的齁~");
				System.out.print("請再輸入數字");
				num = scan.nextInt();
			}		
		}
	}
}
		