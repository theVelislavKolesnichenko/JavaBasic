package bg.tu_varna.bg;

public abstract class EMailMessage {
	private String strEMailMessage;
	
	public EMailMessage(String strEMailMessage) {
		this.strEMailMessage = strEMailMessage;
	}
	
	public EMailMessage() {
		this("");
	}	
	
	public String getStrEMailMessage() {
		return strEMailMessage;
	}

	public void setStrEMailMessage(String strEMailMessage) {
		this.strEMailMessage = strEMailMessage;
	}

	public abstract void setEMailMessage(String mess); // изпращане на съобщение
	public abstract String getEMailMessage(); // получаване на съобщение
}
