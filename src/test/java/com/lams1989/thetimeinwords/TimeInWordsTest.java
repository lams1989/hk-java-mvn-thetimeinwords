package com.lams1989.thetimeinwords;

import junit.framework.TestCase;

public class TimeInWordsTest extends TestCase {

	public void testEspcialCase() {
		assertEquals("five o' clock ", TimeInWords.espcialCase(0,  5));

		assertEquals("quarter past twelve ", TimeInWords.espcialCase(15, 12));
		
		assertEquals("half past five ", TimeInWords.espcialCase(30, 5));
		
		assertEquals("quarter to one ", TimeInWords.espcialCase(45, 12));

		assertEquals("one ", TimeInWords.minAnalizer(1));
		
		assertEquals("ten ", TimeInWords.minAnalizer(10));
		
		assertEquals("twenty ", TimeInWords.minAnalizer(40));
		
		assertEquals("twenty eigth ", TimeInWords.minAnalizer(32));
		
		assertEquals("four ", TimeInWords.minAnalizer(56));
		
		assertEquals("eighteen ", TimeInWords.minAnalizer(42));
		
		assertEquals("two ", TimeInWords.hrsAnalizer(2));
		
		assertEquals("five ", TimeInWords.hrsAnalizer(5));
		
		assertEquals("eight ", TimeInWords.hrsAnalizer(8));
		
		assertEquals("twelve ", TimeInWords.hrsAnalizer(12));
		
		assertEquals("three ", TimeInWords.hrsAnalizer(3));
		
		assertEquals("ten ", TimeInWords.hrsAnalizer(10));
		
	}

}
