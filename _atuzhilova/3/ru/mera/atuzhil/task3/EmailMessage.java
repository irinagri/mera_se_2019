package ru.mera.atuzhil.task3;

public class EmailMessage extends Message {
    protected java.time.LocalDateTime sendDate;
    protected java.time.LocalDateTime receiveDate;

    public EmailMessage(String from, String to, String message, java.time.LocalDateTime sendDate, java.time.LocalDateTime receiveDate) {
        super(from, to, message);
        this.sendDate = sendDate;
        this.receiveDate = receiveDate;
    }

    public void setSendDate(java.time.LocalDateTime sendDate) {
        this.sendDate = sendDate;
    }

    public void setReceiveDate(java.time.LocalDateTime receiveDate) {
        this.receiveDate = receiveDate;
    }
}