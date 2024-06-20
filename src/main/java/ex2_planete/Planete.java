package ex2_planete;

public class Planete extends Astres implements IOrbitable {



    // Instance unique de la classe
    private static Planete planete = new Planete();

    // Constructeur privé pour empêcher l'instanciation
    private Planete() {
        super();

    }

    // Methode publique pour fournir l'instance
    public static Planete getInstance() {
        return planete;
    }


    @Override
    public void orbit(Planete p) {
        System.out.println(p+ " Orbite autour du Soleil");
    }

    @Override
    public void orbit(Satellite s) {

    }

}

