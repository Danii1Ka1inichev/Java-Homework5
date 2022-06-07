package Units;

import Items.Inventory;

public abstract class Reptiloids implements Unit {
    public String name;
    public int attack;
    public int defence;
    public int maxHp;
    public int flySpeed;

    public Reptiloids(String name, int attack, int defence, int maxHp, int flySpeed) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.maxHp = maxHp;
        this.flySpeed = flySpeed;
    }
    public abstract void attack(Reptiloids target);
}
