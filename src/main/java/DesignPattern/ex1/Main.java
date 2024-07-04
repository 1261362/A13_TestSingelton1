package DesignPattern.ex1;

/**
 * La classe Main est le point d'entrée de l'application.
 * Elle teste l'implémentation du pattern Singleton en obtenant
 * plusieurs références et en vérifiant qu'elles pointent vers la même instance.
 */
public class Main {
    /**
     * La méthode principale qui exécute le programme.
     *
     * @param args les arguments de la ligne de commande (non utilisés)
     */
    public static void main(String[] args) {

        // Obtenir l'instance du singleton
        Singleton s1 = Singleton.getInstance();
        System.out.println("Singleton 1 : " + s1);

        // Obtenir à nouveau l'instance du singleton
        Singleton s2 = Singleton.getInstance();
        System.out.println("Singleton 2 : " + s2);

        // Vérifier si les deux références pointent vers la même instance
        if (s1 == s2) {
            System.out.println("Les deux instances sont identiques.");
        } else {
            System.out.println("Il existe différentes instances.");
        }
    }
}
