package TestngKeywords;

//import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depends {
	@Test
	public void login() {
		Reporter.log("login the app",true);
		//Assert.fail();
	}
@Test(dependsOnMethods= {"login"})
public void logout() { 
	Reporter.log("logout the app",true);
}
}
