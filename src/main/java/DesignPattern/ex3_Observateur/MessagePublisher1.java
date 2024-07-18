package DesignPattern.ex3_Observateur;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher1 implements Subject {
    List<Observeur> observeurs = new ArrayList<>();

    public int getNumberOfObservers() {
        return observeurs.size();
    }


        @Override
        public void Ajouter(Observeur o){

            observeurs.add(o);
        }

        @Override
        public void Supprimer(Observeur o){
            observeurs.remove(o);
        }

        @Override
        public void notifier(Message message){

            //Maniere 1 plus facile
            for (Observeur o : observeurs) {
                o.update(message);
            }


            //Maniere 2 plus complexe
//        for (int i = 0; i < observeurs.size(); i++) {
//            Observeur o = observeurs.get(i);
//            o.update(message);
//        }

        }
    }

