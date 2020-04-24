package bg.tu_varna.bg;

public class EMailImpl 
extends EMailMessage 
implements IEMail, Comparable<EMailImpl> {

	private int number;
	private String username;
	private String domain;
	private String message;
	
	public EMailImpl(
			int number, 
			String username, 
			String domain, 
			String message) {
		//super(strEMailMessage);
		this.number = number;
		this.username = username;
		this.domain = domain;
		this.message = message;
	}

	public EMailImpl(String message) {
		//super(strEMailMessage);
		//1
		//name1
		//yahoo.com
		//
		//abcd trs bak
		
		String[] tokend = message.split("[-@:=]", 0);
		this.number = Integer.parseInt(tokend[0]);
		this.username = tokend[1];
		this.domain = tokend[2];
		this.message = tokend[4];

		//this.message = tokend[3].substring(1, tokend[3].length() - 1);
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String toMessage() {
		return this.number + "-" + 
				this.username + "@" + 
				this.domain + ":=" + 
				this.message;
	}
	
	@Override
	public void setEMailMessage(String mess) {
		super.setStrEMailMessage(mess);	
	}

	@Override
	public String getEMailMessage() {
		return super.getStrEMailMessage();
	}

	@Override
	public int compareTo(EMailImpl o) {
	 /*int num1=compareToId(o.getUsername());
	    int num2=compareToMessage(o.getMessage());
	    if(num1==0)
	        return num2;
	    else
	        return num1;*/
		return this.toMessage().compareTo(o.toMessage());
	}

	@Override
	public int compareToId(String id) {
		return this.username.compareTo(id);
	}

	@Override
	public int compareToMessage(String mess) {
		return this.message.compareTo(mess);
	}

	//EMailImpl1.equals(EMailImpl2);
	@Override
	public boolean equals(Object obj) {
		EMailImpl email = (EMailImpl) obj;
		return this.toMessage().equals(email.toMessage());
	}

	@Override
	public String toString() {
		return this.toMessage();
	}
}
