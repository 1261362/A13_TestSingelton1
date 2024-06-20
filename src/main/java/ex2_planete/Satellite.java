package ex2_planete;

public class Satellite implements IOrbitable {

    private static Satellite lune = new Satellite();

    private Satellite() {
    }

    public static Satellite getInstance() {
        return lune;
    }

    @Override
    public void orbit(Planete p) {

    }

    @Override
    public void orbit(Satellite s) {
        System.out.println(s+ " Orbite autour de la lune");
    }

    }

