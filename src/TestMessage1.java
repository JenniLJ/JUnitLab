import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import model.MessageUtil;

public class TestMessage1 {
	String message = "Robert"; 
	MessageUtil messageUtil = new MessageUtil(message);
	
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
			System.out.println("Inside testPrintMessage()");
			assertEquals(message, messageUtil.printMessage());
	}

}