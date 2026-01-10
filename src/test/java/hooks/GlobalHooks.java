package hooks;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class GlobalHooks {
	@BeforeAll
	public static void loadConfig() {
		System.out.println("This is to load environment specific config property file e.g. qa, dev etc...");
	}
		
	@BeforeAll
	public static void loggingConfig() {
		System.out.println("This is to load log4j2 logging configuration file");
	}
	
	@BeforeAll
	public static void extentReportConfig() {
		System.out.println("This is to load extent report configuration file");
	}
	
	@AfterAll
	public static void globaTeardown() {
		System.out.println("Cleaning up resources including env, log4j2 and Extent Report.");
		System.out.println("order we will figure out in actual implementation");
	}
	
}