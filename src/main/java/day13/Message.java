package day13;

import java.util.Date;

public class Message {
    User sender;
    User receiver;
    String text;
    //дата отправки сообщения (здесь почитать про альтернативы классу Date и пременить)
    Date date;

    public Message(User sender, User receiver, String text, Date date) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = date; //сдесь нужно назначить текущее время
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "FROM: " + sender + "\n" +
                "TO: " + receiver + "\n" +
                "ON" + date + "\n" +
                text;
    }
}
