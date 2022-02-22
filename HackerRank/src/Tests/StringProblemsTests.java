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
	
	@Test
	void splitWithRegexBasic()
	{
		StringProblems.splitWithRegex("He is a very very good boy, isn't he?");
		assertEquals("10\nHe\nis\na\nvery\nvery\ngood\nboy\nisn\nt\nhe\n", outputStreamCaptor.toString());
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
