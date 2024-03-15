package TestngKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
@Test(priority=2)
public void logout() {
	Reporter.log("logout the applicagtion",true);
}
@Test(priority=1)
public void login() {
	Reporter.log("login the app",true);
}
}
