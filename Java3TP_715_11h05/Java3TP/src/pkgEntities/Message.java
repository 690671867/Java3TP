package pkgEntities;

import java.io.Serializable;
import java.util.Date;


public class Message implements Serializable {
	private int id;
	private int msgFrom;
	private int msgTo;
	private Date sendDate = new Date();
	private String contenu;
	private Boolean dejalu = false;
	private int replyToMsgId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMsgFrom() {
		return msgFrom;
	}
	public void setMsgFrom(int msgFrom) {
		this.msgFrom = msgFrom;
	}
	public int getMsgTo() {
		return msgTo;
	}
	public void setMsgTo(int msgTo) {
		this.msgTo = msgTo;
	}
	public Date getSendDate() {
		return sendDate;
	}
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public Boolean getDejalu() {
		return dejalu;
	}
	public void setDejalu(Boolean dejalu) {
		this.dejalu = dejalu;
	}
	
	public int getReplyToMsgId() {
		return replyToMsgId;
	}
	public void setReplyToMsgId(int replyToMsgId) {
		this.replyToMsgId = replyToMsgId;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", msgFrom=" + msgFrom + ", msgTo="
				+ msgTo + ", sendDate=" + sendDate + ", contenu=" + contenu
				+ ", dejalu=" + dejalu + ", replyToMsgId=" + replyToMsgId + "]";
	}

	
}
