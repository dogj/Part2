package part2.xin;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloTest {

	Hello obj;
	
	@Before
	public void setUp() throws Exception {
		obj = new Hello();
	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testHello() {
		assertEquals("I am back", obj.hello());
	}

}
