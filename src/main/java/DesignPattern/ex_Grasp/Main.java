package DesignPattern.ex_Grasp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IPaiement> list;
        list = new ArrayList<IPaiement>();
        IPaiement p1 = new PaiementLiquide();
        list.add(p1);

        IPaiement p2 = new PaiementCarte();
        list.add(p2);

        //Afficher liste
        for(IPaiement p : list){
            p.fairePaiement();
        }
    }
}
