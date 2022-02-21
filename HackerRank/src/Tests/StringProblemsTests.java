package Tests;

import Problems.StringProblems;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringProblemsTests {

	@Test
	void getSmallestAndLargestBasic() {
		assertEquals("ava\nwel", StringProblems.getSmallestAndLargest("welcometojava", 3));
	}

}
