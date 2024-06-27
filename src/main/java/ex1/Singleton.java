package ex1;

/**
 * La classe Singleton implémente le pattern Singleton,
 * ce qui signifie qu'une seule instance de cette classe peut exister à la fois.
 */
public class Singleton {

    // Instance unique de la classe
    private static Singleton instance;

    // Constructeur privé pour empêcher l'instanciation
    private Singleton() {
    }

    /**
     * Méthode publique pour fournir l'accès à l'unique instance de la classe.
     * Si l'instance n'existe pas encore, elle est créée.
     *
     * @return l'unique instance de la classe Singleton
     */
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
