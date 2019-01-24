package ru.mera.atuzhil.task3;

public class MailBox {
    private static int START_CAPACITY = 100;
    private static int ADDITIONAL = 100;

    protected EmailMessage emailMessages[];
    protected PaperMessage paperMessages[];

    public MailBox() {
        emailMessages = new EmailMessage[START_CAPACITY];
        paperMessages = new PaperMessage[START_CAPACITY];
    }

    public void addEmailMessage(EmailMessage msg) {
        if (emailMessages[emailMessages.length-1] != null) {
            EmailMessage[] tempArray = new EmailMessage[emailMessages.length + ADDITIONAL];
            System.arraycopy(emailMessages, 0, tempArray, 0, emailMessages.length);
            tempArray[emailMessages.length] = msg;
            emailMessages = tempArray;
        }
        else
        {
            for (int i=0; i < emailMessages.length-1; i++) {
                if (emailMessages[i] == null) {
                    emailMessages[i] = msg;
                    break;
                }
            }
        }
    }

    public void addPaperMessage(PaperMessage msg) {
        if (paperMessages[paperMessages.length-1] != null) {
            PaperMessage[] tempArray = new PaperMessage[paperMessages.length + ADDITIONAL];
            System.arraycopy(paperMessages, 0, tempArray, 0, paperMessages.length);
            tempArray[paperMessages.length] = msg;
            paperMessages = tempArray;
        }
        else
        {
            for (int i=0; i < paperMessages.length-1; i++) {
                if (paperMessages[i] == null) {
                    paperMessages[i] = msg;
                    break;
                }
            }
        }
    }

    public EmailMessage[] getEmailMessages() {
        return this.emailMessages;
    }

    public PaperMessage[] getPaperMessages() {
        return this.paperMessages;
    }
}