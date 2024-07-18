package DesignPattern.ex3_Observateur;

/**
 * Subject / Publisher / Observable
 */
public interface Subject {

    void Ajouter(Observeur o);

    void Supprimer(Observeur o);

    void notifier(Message message);


}
