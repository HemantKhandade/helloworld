package techm.test;

import org.junit.Test;

import junit.framework.Assert;

public class TestHelloWorld {

	@Test
	public void testSayHello() {
		HelloWorld hw = new HelloWorld();
		String hello = hw.sayHello();
		Assert.assertEquals("Hello World", hello);
	}

}
