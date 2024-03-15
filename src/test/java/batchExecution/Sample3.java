package batchExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample3 {
	@Test
	public void TC1() {
		Reporter.log("I am verification 1",true);
	}
	@Test
	public void TC2() {
		Reporter.log("I am verification 2",true);
	}
	@Test
	public void TC3() {
		Reporter.log("I am verification 3",true);
	}
}
