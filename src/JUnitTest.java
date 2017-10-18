import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JUnitTest {
	
	Project test_simple;

	@Before
	public void setUp(){
		test_simple = new Project(
				new String[][]{{"A", "D"}, {"B", "C"}, {"A", "B"}}
	    );
	}
	
	@Test
	public void test_simple_example_1_B() {
		assertTrue(test_simple.isWellSorted_A(new String[]{"A", "D", "B", "C"})); //Wahr
	}
	@Test
	public void test_simple_example_2_B() {
		assertFalse(test_simple.isWellSorted_A(new String[]{"D", "A", "B", "C"})); //Falsch
	}
	@Test (expected = NullPointerException.class)
	public void test_simple_example_3_B() {
		assertFalse(test_simple.isWellSorted_A(null)); //NullPointer
	}
	
	@Test
	public void test_simple_example_4_B() {
		assertTrue(test_simple.isWellSorted_B(new String[]{"A", "D", "B", "C"})); //Wahr
	}
	@Test
	public void test_simple_example_5_B() {
		assertFalse(test_simple.isWellSorted_B(new String[]{"D", "A", "B", "C"})); //Falsch
	}
	@Test
	public void test_simple_example_6_B() {
		assertFalse(test_simple.isWellSorted_B(null)); //Falsch
	}
}
