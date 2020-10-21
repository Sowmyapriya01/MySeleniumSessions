package SeleniumSessions;

public class LoginPage {
	public static void main(String args[]) {

		Browserutil br =new Browserutil();
		br.init_driver("Chrome");
		br.launchURL("https://www.google.com");
		String page=br.getPageTitle();
		System.out.println(page);
		System.out.println(br.getcurrentpageURL());
		br.QuitBrowser();
	}

}
