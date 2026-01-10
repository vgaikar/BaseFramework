package hooks;

import io.cucumber.java.Before;

public class LoginHooks {

	@Before(order=1)
	public void loginToApplication() {
		System.out.println("This is to log into Application");
	}
}
