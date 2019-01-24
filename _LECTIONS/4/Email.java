import java.time.LocalDateTime;

public class Email extends Message {
    LocalDateTime receiveDate;
    LocalDateTime sentDate;

    public Email(LocalDateTime receiveDate, LocalDateTime sentDate,String to, String from, String message) {
        super(to, from, message);
        this.receiveDate = receiveDate;
        this.sentDate = sentDate;
    }

    @Override
    public String getDeliveryMethod() {
        return "Через интернет";
    }

    @Override
    public String toString() {
        return "Email{" + "receiveDate=" + receiveDate + ", sentDate=" + sentDate + ", to='" + getTo() + '\'' + ", from='" + getFrom() + '\''
                + ", message='" + getMessage() + '\'' + '}';
    }
}
