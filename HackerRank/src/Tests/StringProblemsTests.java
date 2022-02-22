package Tests;

import Problems.StringProblems;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class StringProblemsTests {

	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	
	@BeforeEach
	public void setUp() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}
	
	@AfterEach
	public void tearDown() {
		System.setOut(standardOut);
	} 
	
	@Test
	void isAnagramBasic()
	{
		assertTrue(StringProblems.isAnagram("anagram", "margana"));
		assertFalse(StringProblems.isAnagram("anagram", "mmargana"));
	}
	
	@Test
	void getSmallestAndLargestBasic() {
		assertEquals("ava\nwel", StringProblems.getSmallestAndLargest("welcometojava", 3));
	}

	@Test
	void getSmallestAndLargestGibberish()
	{
		assertEquals("ASDFHDSFHsdlfhsdlfLDFHSDLFHsdl\nsdlkfhsdlfhsLFDLSFHSDLFHsdkfhs", 
				StringProblems.getSmallestAndLargest(
				"ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFH" + 
				"SDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs",
				30));
	}
	
	@Test
	void isPalindromeBasic()
	{
		StringProblems.isPalindrome("madam");
		assertEquals("Yes", outputStreamCaptor.toString());
	}
}
