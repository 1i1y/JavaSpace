/*
Date

  Date   date   =        new          Date   ();
//���O   ����   ����  ��O����n�Ŷ�  �غc�l
//class  object
*/



import java.util.*;
public class TestDate{
	public static void main (String args []){
		Date date = new Date();
		System.out.println(date.toString());
		
		String text = new String ("Java");
		//���O ����       �غc�l
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		System.out.println(text.length());
		System.out.println(text.replace("J","j"));
		System.out.println(text);
	}
}