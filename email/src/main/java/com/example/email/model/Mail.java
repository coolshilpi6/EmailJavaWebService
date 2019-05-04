package com.example.email.model;

/**
 * Pojo class for mail
 * @author Shilpi Das
 *
 */
public class Mail {

    private String userName;
    private String emailAddress;
    private String subject;
    private String content;

     
    public Mail() {	
	}


	public Mail(String userName, String emailAddress, String subject, String content) {
		this.userName = userName;
		this.emailAddress = emailAddress;
		this.subject = subject;
		this.content = content;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	@Override
    public String toString() {
        return "Mail{" +
                "from='" + userName + '\'' +
                ", to='" +  + '\'' +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
