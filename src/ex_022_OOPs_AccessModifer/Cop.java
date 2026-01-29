package ex_022_OOPs_AccessModifer;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Cop {
    public int gun;
    public String iCard;

    public Cop(int bullet){
        this.gun = bullet;

    }

    public void canIshoot(){
        System.out.println("Yes you can !!");
    }
    void thisDefaultF1() {
        System.out.println("Hi, Cop!");
    }
}
