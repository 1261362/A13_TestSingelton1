package DesignPattern.ex4_Decorateur;

public class Ognion extends Ingrediant {

    public Ognion(Plat p) {
        sur = p;
    }

    public double getPrix(){
        return sur.getPrix()+3.00;
    }
}
