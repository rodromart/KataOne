package main	;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RomanNumbersTest {

	@Test
	public void oneTwoThree() {
		assertEquals("I", RomanNumbers.toRomanNumbers(1));
		assertEquals("II", RomanNumbers.toRomanNumbers(2));
		assertEquals("III", RomanNumbers.toRomanNumbers(3));
	}

	@Test
	public void four(){
		assertEquals("IV", RomanNumbers.toRomanNumbers(4));
	}
	
	@Test
	public void five(){
		assertEquals("V", RomanNumbers.toRomanNumbers(5));
	}
	
	@Test
	public void six(){
		assertEquals("VI", RomanNumbers.toRomanNumbers(6));
		assertEquals("VII", RomanNumbers.toRomanNumbers(7));
		assertEquals("VIII", RomanNumbers.toRomanNumbers(8));

	}
	
	@Test
	public void nine() {
		assertEquals("IX", RomanNumbers.toRomanNumbers(9));

	}
	
	@Test
	public void teneleven() {
		assertEquals("X", RomanNumbers.toRomanNumbers(10));
		assertEquals("XI", RomanNumbers.toRomanNumbers(11));
	}
	
	@Test
	public void fifteen(){
		assertEquals("XV", RomanNumbers.toRomanNumbers(15));

	}
	
	@Test
	public void tweentys(){
		assertEquals("XX", RomanNumbers.toRomanNumbers(20));
		assertEquals("XXIV", RomanNumbers.toRomanNumbers(24));
	}
	
}
