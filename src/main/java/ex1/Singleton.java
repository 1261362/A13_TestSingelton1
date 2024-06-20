package ex1;

public class Singleton {

    // Instance unique de la classe
    private static Singleton instance;

    // Constructeur privé pour empêcher l'instanciation
    private Singleton() {
    }

    // Méthode publique pour fournir l'accès à l'instance
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
