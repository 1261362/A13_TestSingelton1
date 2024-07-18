package DesignPattern.ex3_Observateur;

public class Main {
    public static void main(String[] args) {

        // Creer un subcriber(Observeur)
        Observeur subcriber1 = new MessageSubscriber1();
        Observeur subcriber2 = new MessageSubscriber2();
        System.out.println();

        // Creer un publisher(Subject)
        MessagePublisher1 publisher1 =  new MessagePublisher1();
        MessagePublisher1 publisher2 =  new MessagePublisher1();






        // L'observateur s'incrit au publisher
        publisher1.Ajouter(subcriber1);
        publisher2.Ajouter(subcriber2);

        // Envoyer un message au
        publisher1.notifier( new Message("Message 1"));
        System.out.println();
        publisher1.Supprimer(subcriber1);

        System.out.println();



        publisher2.Ajouter(subcriber2);
        publisher2.notifier(new Message("Message 3"));


    }
}
