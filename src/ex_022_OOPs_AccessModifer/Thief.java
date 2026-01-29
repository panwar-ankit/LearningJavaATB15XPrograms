package ex_022_OOPs_AccessModifer.police;

class Cop {
    private int bullet;

    // Constructor
    public Cop(int bullet) {
        this.bullet = bullet;
    }

    public void canIshoot() {
        if (bullet > 0) {
            System.out.println("Yes, I can shoot!");
        } else {
            System.out.println("No bullets left!");
        }
    }

    public void shoot() {
        if (bullet > 0) {
            bullet--;
            System.out.println("Bang! Bullets left: " + bullet);
        } else {
            System.out.println("No bullets left!");
        }
    }

    public int getBullet() {
        return bullet;
    }

    public void setBullet(int bullet) {
        this.bullet = bullet;
    }
}