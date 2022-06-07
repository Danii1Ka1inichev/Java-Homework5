package Items;

public abstract class Armor implements Item {
    public String name;
    public int defence;
    public int strength;
    public int coin;

    public Armor(String name, int defence, int strength, int coin){
        this.name = name;
        this.defence = defence;
        this.strength = strength;
        this.coin = coin;
    }

    public abstract int Defence(Armor armor);

}
