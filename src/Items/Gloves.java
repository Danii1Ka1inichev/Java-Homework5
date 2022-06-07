package Items;

public class Gloves extends Armor{

    public Gloves(String name, int defence, int strength, int coin) {
        super(name, defence, strength, coin);
    }

    @Override
    public int Defence(Armor gloves) {
        return 0;
    }

    @Override
    public void repair() {

    }
}
