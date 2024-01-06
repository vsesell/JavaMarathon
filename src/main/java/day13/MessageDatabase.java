package day13;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();
    public static void sendMessage(User u1, User u2, String text) {
//        - этот метод “отправляет” новое сообщение от пользователя ​ u1​пользователю
//u2​с текстом ​ text​ . Отправка в нашем контексте означает добавление
//сообщения в нашу “базу данных”
        messages.add(new Message(u1, u2, text, new Date()));
    }
    public static List<Message> getMessages() {
//        возвращает список всех
//        сообщений в “базе данных
        return messages;
    }
    public static void showDialog(User u1, User u2) {
//        - этот метод
//        должен вывести цепочку сообщений (диалог) пользователей ​ u1​и ​ u2​ . Формат
//        вывода должен быть таким:
//        user1: Привет!
//                user2: Привет, user1!
//                user1: Как у тебя дела?
//        user2: Все ок, спасибо :)
        for(Message message : messages) {
            if ((message.getSender() == u1 && message.getReceiver() == u2)
            || (message.getSender() == u2 && message.getReceiver() == u1)) {
                System.out.println(message.getSender() + ": " + message.getText());
            }
        }
    }

}
