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
	  public void test_simple_example_1() {
	    assertTrue(test_simple.isWellSorted(new String[]{"A", "D", "B", "C"}));
	  }
	  @Test
	  public void test_simple_example_2() {
	    assertFalse(test_simple.isWellSorted(new String[]{"D", "A", "B", "C"}));
	  }
	  @Test
	  public void test_simple_example_3() {
	    assertNotNull(test_simple.isWellSorted(null));
	  }
}
