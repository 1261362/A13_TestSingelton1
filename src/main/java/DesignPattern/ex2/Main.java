package DesignPattern.ex2;

public class Main {
    public static void main(String[] args) {

    Robot r1 = new Robot("R1");
    Robot r2 = new Robot("R2");
    Robot r3 = new Robot("R3");
    Robot r4 = new Robot(r1);

        System.out.println("Début du programme");
        r1.setBehaviour(new AgressiveBehaviour());
        r2.setBehaviour(new DefensiveBehaviour());
        r3.setBehaviour(new NormalBehaviour());

        r1.move();
        System.out.println();
        r2.move();
        System.out.println();
        r3.move();

        System.out.println("Fin du programme");
        System.out.println();
        System.out.println("R1 devien defensif");
        r1.setBehaviour(new DefensiveBehaviour());
        r1.move();
        System.out.println();
        System.out.println("R2 de devien normal");
        r2.setBehaviour(new NormalBehaviour());
        r2.move();
        System.out.println();
        System.out.println("R3 de devient aggressif");
        r3.setBehaviour(new AgressiveBehaviour());
        r3.move();
}
 }