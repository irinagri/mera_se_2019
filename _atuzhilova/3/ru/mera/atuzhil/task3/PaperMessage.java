package ru.mera.atuzhil.task3;

public class PaperMessage extends Message {
    protected String fromPostalIndex;
    protected String toPostalIndex;

    public PaperMessage(String from, String to, String message, String fromPostalIndex, String toPostalIndex) {
        super(from, to, message);
        this.fromPostalIndex = fromPostalIndex;
        this.toPostalIndex = toPostalIndex;
    }

    public void setFromPostalIndex(String fromPostalIndex) {
        this.fromPostalIndex = fromPostalIndex;
    }

    public void setToPostalIndex(String toPostalIndex) {
        this.toPostalIndex = toPostalIndex;
    }
}