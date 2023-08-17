import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

// confirm test framework is setup
public class TestsStart {

	@Test
	public void test1() {

		assertEquals(1,1); // just confirm that the test framework is configured on the system

	}

	@Before
	public void before() {

		System.out.println("Before tests");

	}



}