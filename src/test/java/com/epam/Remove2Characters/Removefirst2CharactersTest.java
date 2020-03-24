package com.epam.Remove2Characters;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Removefirst2CharactersTest {
	
  /** 
   * ABCD => BCD
   * AACD=> CD
   * BACD => BCD
   * BBAA => BBAA
   * AABAA => BAA
   * AA => ''
   * A => ''
   * B => B
   * '' => ''
   * BCD => BCD
   * **/
	
	RemoveFirst2A removeFirst2A;
	
	@BeforeEach
	void setUp() {
		removeFirst2A = new RemoveFirst2A();
	}
	

	@Test
	void testFirstA() {
		assertEquals("BCD",removeFirst2A.remove("ABCD"));
	}
	
	@Test
	void testFirst2A() {
		assertEquals("CD",removeFirst2A.remove("AACD"));
	}
	
	@Test
	void testSecondA() {
		assertEquals("BCD",removeFirst2A.remove("BACD"));
	}
	
	@Test
	void testWithLastA() {
		assertEquals("BBAA",removeFirst2A.remove("BBAA"));
	}
	@Test
	void testforAllA() {
		assertEquals("BAA",removeFirst2A.remove("AABAA"));
	}
	
	@Test
	void testforOnlyAs() {
		assertEquals("",removeFirst2A.remove("AA"));
	}
	
	@Test
	void testforOnlyA() {
		assertEquals("",removeFirst2A.remove("A"));
	}
	
	@Test
	void testfor1Char() {
		assertEquals("B",removeFirst2A.remove("B"));
	}
	
	@Test
	void testforEmpty() {
		assertEquals("",removeFirst2A.remove(""));
	}
	
	@Test
	void testforNoneA() {
		assertEquals("BCD",removeFirst2A.remove("BCD"));
	}

}
