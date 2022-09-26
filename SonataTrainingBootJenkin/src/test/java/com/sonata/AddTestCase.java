package com.sonata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTestCase {

	@Test
	void test() {
		AddInterface add = new AddImple();
		assertEquals(20,add.add(10,10));
	}


}
