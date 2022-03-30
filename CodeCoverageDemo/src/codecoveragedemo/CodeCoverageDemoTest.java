/**
 * 
 */
package codecoveragedemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author nhasa
 *
 */
class CodeCoverageDemoTest {

	CodeCoverageDemo obj = new CodeCoverageDemo();
	
	
	@Test
	void testComparator() {
		assertEquals(1,obj.Comparator(3,4));
		assertEquals(3,obj.Comparator(5,2));
		assertEquals(0,obj.Comparator(3,3));
	
	}

}
