package email;

import static org.junit.Assert.*;

import java.util.List;
import java.util.regex.Pattern;

import org.junit.AfterClass;
import org.junit.Test;

public class EmailTest {
	public static Email email;
	
	
	@AfterClass
    public static void deleteEmailObject() {
        email = null;
        System.gc();
    }
	
	@Test
	public void testEmailId() {
		Email email = new Email("viraj.gawde@db.com", "sdfdf", "asd we");
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +"(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"; 
 
		Pattern pat = Pattern.compile(emailRegex); 
		if (email.emailId == null) 
			assertTrue(false);
		assertTrue(pat.matcher(email.emailId).matches()); 
	}
	
	@Test
	public void testEmailSubject() {
		Email email = new Email("sdfsdf", "sdfdf_", "asd we");
		
		assertTrue(email.emailSubject.length()<=25  && !email.emailSubject.contains("#") && !email.emailSubject.contains("_"));
	}

	
	@Test
	public void testEmailBody() {
		Email email = new Email("sdfsdf", "sdfdf", "asd we");
		if(email.emailBody.length()!=0)
			assertTrue(email.emailBody instanceof String);
	}
	
	@Test(timeout = 3000)
    public void testSendMail() throws InterruptedException {
        Email email = new Email("viraj.gawde@db.com", "sdfdf", "asd we");
        email.send();
    }
	

}
