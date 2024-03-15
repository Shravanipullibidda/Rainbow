package TestngKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount=12)
	public void demo() {
		Reporter.log("hello ammu",true);
	}

}
