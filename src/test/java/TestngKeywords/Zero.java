package TestngKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Zero {
	@Test(enabled=false)
	public void demo() {
		Reporter.log("hello ammu",true);
	}

}
