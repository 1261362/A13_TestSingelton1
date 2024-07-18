package DesignPattern.ex2_Robot;

public class AgressiveBehaviour implements IBehaviour {
    @Override
    public void moveCommand() {
        System.out.println("Robot Agressif");
    }
}
