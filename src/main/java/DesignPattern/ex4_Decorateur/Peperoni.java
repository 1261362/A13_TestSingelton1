package DesignPattern.ex4_Decorateur;

public class Peperoni extends Ingrediant {


    public Peperoni(Plat p) {
        sur = p;
    }

    public double getPrix(){
        return sur.getPrix()+2.00;
    }
}
