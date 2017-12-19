/*
Date

  Date   date   =        new          Date   ();
//類別   物件   指派  跟記憶體要空間  建構子
//class  object
*/



import java.util.*;
public class TestDate{
	public static void main (String args []){
		Date date = new Date();
		System.out.println(date.toString());
		
		String text = new String ("Java");
		//類別 物件       建構子
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		System.out.println(text.length());
		System.out.println(text.replace("J","j"));
		System.out.println(text);
	}
}