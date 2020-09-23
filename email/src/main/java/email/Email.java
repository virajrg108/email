package email;

import java.util.List;

public class Email {
	
	String emailId;
	String emailSubject;
	String emailBody;
	List emailAttachment;
	
	public Email(String emailId, String emailSubject, String emailBody) {
		super();
		this.emailId = emailId;
		this.emailSubject = emailSubject;
		this.emailBody = emailBody;
//		this.emailAttachment = emailAttachment;
	}
	
	public void send() throws InterruptedException {
		Thread.sleep(2500);
	}

}
