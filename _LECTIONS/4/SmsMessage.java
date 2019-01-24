public class SmsMessage extends Message {

    boolean deliveryStatus = false;

    public SmsMessage(String to, String from, String message) {
        super(to, from, message);
    }

    public boolean isDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(boolean deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    @Override
    public String getDeliveryMethod() {
        return "Через телефон";
    }


}
