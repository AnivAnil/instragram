package org.insta;

import java.util.Date;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Instragram extends BaseMethod {

	@BeforeClass
	private void brforeclass() {
		browserlauch("chrome");
		implicitywait(200);
	}

	@BeforeMethod
	private void beforemethod() {
		System.out.println("date" + new Date());
	}
     
	@Test
	private void test() throws InterruptedException {
		geturl("https://www.instagram.com/");
        LoginPage l=new LoginPage();
        SendKeys(l.getUser(), "anil");
        Thread.sleep(5000);
        SendKeys(l.pass(), "kumar");
	}
}
