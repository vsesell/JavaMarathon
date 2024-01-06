package day13;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;
    public User(String username) {
        this.username = username;
        subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }
    //подписывает пользователя на пользователя user
    public void subscribe(User user) {
        subscriptions.add(user);
    }
    //возвращает True , если пользователь подписан на пользователя user и False , если не подписан.
    public boolean isSubscribed(User user){
        for (User thisUser : subscriptions) {
            if (thisUser.getUsername().equals(user.getUsername())) {
                return true;
            }
        }
        return false;
    }
//возвращает ​ True​ , если
//пользователь ​ user​является другом и ​ False​ , если пользователь ​ user​не
//является другом. Подумайте, что такое дружба в контексте соц. сетей.
    public boolean isFriend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(this);
    }
    //отправляет
    //сообщение с текстом ​ text​пользователю ​ user​ . Здесь должен использоваться
    //статический метод из ​ MessageDatabase​
    public void sendMessage(User user, String text){
        MessageDatabase.sendMessage(this,user,text);
    }

    @Override
    public String toString() {
        return username;
    }
}
