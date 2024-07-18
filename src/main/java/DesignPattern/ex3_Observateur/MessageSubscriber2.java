package DesignPattern.ex3_Observateur;

public class MessageSubscriber2 implements Observeur {
    @Override
    public void update(Message message) {
        System.out.println("MessageSubcriber2 : " + message.getMessage());
    }
}
