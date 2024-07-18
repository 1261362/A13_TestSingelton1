package DesignPattern.ex5_Grasp;

public class PaiementLiquide implements IPaiement {
    @Override
    public void fairePaiement() {
        System.out.println("Paiement en argent");
    }
}
