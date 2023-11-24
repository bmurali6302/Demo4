import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtilityTestClass {

	@Test
	void testFindStingLength() {
		//fail("Not yet implemented");
		StringUtility obj=new StringUtility();
		int exp=4;
		int res=obj.findStingLength("Java");
		assertEquals(exp,res);
	}

}
