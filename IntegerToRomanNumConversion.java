package com.example;

public class IntegerToRomanNumConversion {

	public static void main(String[] args) {
		System.out.println(intToRoman(93));

	}
	
	public static String intToRoman(int num) {
		String[] thousands=new String[] {"","M","MM","MM"};
		String[] hundreds=new String[] {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String[] tens=new String[] {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String[] units=new String[] {"","I","II","III","IV","V","VI","VII","VII","IX"};
		
		return thousands[num/1000]+
				hundreds[(num %1000)/100]+
				tens[(num%100)/10]+
				units[num%10];		
				
	}

}
