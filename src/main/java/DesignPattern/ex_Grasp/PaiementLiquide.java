package DesignPattern.ex_Grasp;

public class PaiementLiquide implements IPaiement {
    @Override
    public void fairePaiement() {
        System.out.println("Paiement en argent");
    }
}
