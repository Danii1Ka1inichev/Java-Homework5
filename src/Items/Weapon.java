package Items;


import Units.Humanoid;

public abstract class Weapon implements Item{
    public int attack;
    public int strength;
    public String name;


    public Weapon(String name, int attack, int strength){
        this.name = name;
        this.attack = attack;
        this.strength = strength;
    }

    public static void blockAction() {
    }
    public abstract int weaponAttack(Weapon weapon);
}
