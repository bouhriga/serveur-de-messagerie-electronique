package Model;

import java.util.Date;

public class Email {
	private String uuid;
    private int id;
    private String from;
    private String to;
    private String message;
    private String subject;
    private Date createdAt;
    private String d;
    public Email(){

    }
    public Email(int id,String from, String to, String subject, String message, String d) {
    	this.id = id;
        this.from = from;
        this.to = to;
        this.message = message;
        this.subject = subject;
        this.d = d;
    }
    public Email(String from, String to, String message, String subject, Date createdAt) {
        this.from = from;
        this.to = to;
        this.message = message;
        this.subject = subject;
        this.createdAt = createdAt;
    }
    public String getd() {
        return d;
    }

    public void setd(String d) {
        this.d = d;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String i) {
        this.from = i;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
