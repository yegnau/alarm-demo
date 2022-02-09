
package com.jetbrains.alarmmanagement;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@SpringBootTest
class SecondTests {

	@Test
	void secondContextLoads() {
		assertEquals(1,1);
	}

	@Test
	void secondContextLoads_1() {
		assertEquals(2,2);
	}

	@Test
	void secondContextLoads_2() {
		assertEquals(2,2);
	}

	@Test
	void secondContextLoads_3() {
		assertEquals(2,2);
	}

	@Test
	void secondContextLoads_4() {
		assertEquals(2,2);
	}

	@Test
	void secondContextLoads_5() {
		/*if (System.currentTimeMillis() % 2 == 0) {
			fail("Flaky test");

		}*/
	}
}
