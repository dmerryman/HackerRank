package Tests;

import Problems.StringProblems;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringProblemsTests {

	@Test
	void Basic() {
		assertEquals("ava\nwel", StringProblems.getSmallestAndLargest("welcometojava", 3));
	}

	@Test
	void Gibberish()
	{
		assertEquals("ASDFHDSFHsdlfhsdlfLDFHSDLFHsdl\nsdlkfhsdlfhsLFDLSFHSDLFHsdkfhs", 
				StringProblems.getSmallestAndLargest(
				"ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFH" + 
				"SDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs",
				30));
	}
}
