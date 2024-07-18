package DesignPattern.ex4_Decorateur;

public class Main {
    public static void main(String[] args) {
        Plat p1 = new PizzaBase();
        System.out.println("Pizza de base : " + p1.getPrix());
        Plat p2 = new Ognion(new PizzaBase());
        System.out.println("Pizza de base avec ognion : " + p2.getPrix());
        Plat p3 = new Peperoni(new Ognion(new PizzaBase()));
        System.out.println("Pizza de base  avec ognion et peperoni: " + p3.getPrix());
    }
}
