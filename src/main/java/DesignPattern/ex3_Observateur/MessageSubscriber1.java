package DesignPattern.ex3_Observateur;

public class MessageSubscriber1 implements Observeur {

    @Override
    public void update(Message message) {
        System.out.println("MessageSubcriber1 : " + message.getMessage());
    }
}
