/*
IF粂猭

if(兵ンΑ)
 朝瓃;
else
 朝瓃; 

某秨﹍朝瓃常{}ず礛if 盻
*/
import java.util.*; //硂︽甧а癘SCAN~

public class TestIf{
	public static void main (String args[]){
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("だ计蝶粂");
		System.out.print("叫块だ计:");
		double score = scan.nextDouble();
		//硂柑рscan.nextInt(), эΘscan.nextDouble(), 碞耞Τ计Θ罿
		
		if (score <=0 || score >= 100){
			System.out.println("计Τ粇!!");
		}
		else if (score >= 90){
			System.out.println("Θ罿の!\n单A");
		}
		else if (score >= 80){
			System.out.println("Θ罿の!\n单B");
		}
		else if (score >= 70){
			System.out.println("Θ罿の!\n单C");
		}
		else if(score >= 60){
			System.out.println("Θ罿の!\n单D");
		}
		else{
			System.out.println("Θ罿ぃの!\n单F");
			}
		//IF砏玥:琌0~100耞单
	}
}