package part2.xin;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Hello2Test {

	Hello2 obj;
	@Before
	public void setUp() throws Exception {
		obj = new Hello2();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHello() {
		assertEquals("I am back2", obj.hello2());
	}

}
