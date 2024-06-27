package ex2_planete;

public class Main {

    public static void main(String[] args) {
       Soleil soleil = Soleil.getInstance();
        System.out.println(Soleil.getInstance());

       Planete terre = Planete.getInstance();
        System.out.println();

        Satellite lune = Satellite.getInstance();
        System.out.println(Satellite.getInstance());




    }
}
