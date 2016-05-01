package main;

public class RomanNumbers {
	
	/*
	 * Don't repeat yourself
	 * Complexity under 2
	 */
	

	private static final int[] VALUES = { 1000, 900,  500, 400,  100, 90,   50,  40,   10,  9,    5,   4,    1   };
	private static final String[] ROMAN = { "M",  "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	public static String toRomanNumbers(int arabic) {
		StringBuilder result = new StringBuilder();
		int remaining = arabic;
		for(int i=0; i < VALUES.length; i++)
			remaining = romanAppender(remaining, ROMAN[i], result, VALUES[i]);
		return result.toString();
	}
	
	public static int romanAppender(int remaining, String roman, StringBuilder sb, int value){
		int result = remaining;
		while(result >= value ){
			sb.append(roman);
			result -= value;
		}
		return result;
	}

}
