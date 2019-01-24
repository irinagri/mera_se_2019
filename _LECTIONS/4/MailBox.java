import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Random;

public class MailBox {

    public static void main(String[] args) {
        MailBox mb = new MailBox();
        LocalDateTime now = LocalDateTime.now();

        Email email = new Email(now, now.plusMinutes(1), "Vasya", "Andrey", "Privet");
        mb.addEmail(email);

        Email email2 = new Email(now.plusMinutes(1), now.plusMinutes(2), "Andrey", "Vasya", "И тебе привет");
        mb.addEmail(email2);

        Email email3 = new Email(now.plusMinutes(2), now.plusMinutes(3), "Vasya", "Petya", "Tadam!");
        mb.addEmail(email3);


        Message sms =  new SmsMessage("Petya","Vasya","Privet");
        //Message sms = new SmsMessage("Petya","Vasya","Privet");
        //sms = new Email(now.plusMinutes(2), now.plusMinutes(3), "Vasya", "Petya", "Tadam!");
        mb.addSms((SmsMessage) sms);

       // Message m = new Message("", "", ""); нельзя создать абстрактный класс
        //System.out.println(Arrays.toString(mb.getMessages()));

        Message messag;
        Random r = new Random(System.currentTimeMillis());
        if (r.nextBoolean()) {
            messag = new Email(now.plusMinutes(2), now.plusMinutes(3), "Vasya", "Petya", "Tadam!");
        } else {
            messag = new SmsMessage("1", "2", "3");
        }

        System.out.println(messag.getDeliveryMethod());
        if (messag instanceof Email) {
            System.out.println(((Email)messag).toString());
        }

    }

    Message[] messages = new Email[1];
    int index=0;

    public void addEmail(Message email) {
        if (index < messages.length) {
            messages[index++] = email;
        } else {
            Message[] newArray = new Message[messages.length + 10];
            for (int i = 0; i < messages.length; i++) {
                newArray[i] = messages[i];
            }

            System.arraycopy(messages, 0, newArray, 0, messages.length);
            messages = newArray;
            messages[index++] = email;
        }
    }
    public void addSms(SmsMessage sms) {
        if (index < messages.length) {
            messages[index++] = sms;
        } else {
            Message[] newArray = new Message[messages.length + 10];
            for (int i = 0; i < messages.length; i++) {
                newArray[i] = messages[i];
            }

            System.arraycopy(messages, 0, newArray, 0, messages.length);
            messages = newArray;
            messages[index++] = sms;
        }
    }

    public Message[] getMessages() {
        return messages;
    }
}
