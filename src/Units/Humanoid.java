package Units;

import Items.Inventory;

public abstract class Humanoid implements Unit {
    public Inventory bag;
    public int attack;
    public int defence;
    public int maxHp;
    public String name;

    public Humanoid(String name, int attack, int defence, int maxHp, Inventory bag){
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.maxHp = maxHp;
        this.bag = bag;
    }
}