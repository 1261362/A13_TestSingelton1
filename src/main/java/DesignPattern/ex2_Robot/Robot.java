package DesignPattern.ex2_Robot;

public class Robot {

    /**
     * Chaine de caractère qui definit le nom du robot
     * 
     */
    private String name;
    private IBehaviour behaviour;

    //sans paramètre
    public Robot() {
    }

    /**
     *
     * @param name qui definit le nom du robot
     * @param behaviour qui definit le comportement
     */
    //Constructeur avec paramètre
    public Robot(String name, IBehaviour behaviour)
    {
        this.name = name;
        this.behaviour = behaviour;
    }

    /**
     *
     * @param name qui definit le nom du robot
     */
    //Constructeur avec paramètre
    public Robot(String name)
    {
        this.name = name;
    }

    /**
     *
     * @param r definit le robot
     */
    //constructeur de copie
    public Robot(Robot r)
    {
        this.name = r.name;
        this.behaviour = r.behaviour;
    }

    public IBehaviour getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(IBehaviour behaviour)
    {
        this.behaviour = behaviour;
    }

    public void move()
    {
        System.out.println("je suis " + name);
        behaviour.moveCommand();

    }
}
