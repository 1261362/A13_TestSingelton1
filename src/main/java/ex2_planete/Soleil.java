package ex2_planete;

public class Soleil {

    // Instance unique de la classe
    private static Soleil instanceUnique = new Soleil();

    // Constructeur privé pour empêcher l'instanciation
    private Soleil() {
    }

    // Methode publique pour fournir l'instance
    public static Soleil getInstance() {
        return instanceUnique;
    }
}
