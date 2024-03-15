package TestngKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Time {
	@Test(timeOut=10)
	public void demo() {
		Reporter.log("hello ammu",true);
	}

}
