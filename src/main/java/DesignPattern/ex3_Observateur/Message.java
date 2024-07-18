package DesignPattern.ex3_Observateur;

/**
 * Message contient un String
 */
public class Message {

    final String message;

    public Message(String m) {

        this.message = m;
    }

    public String getMessage() {
        return message;
    }
}
