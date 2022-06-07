package Items;

public class Boots extends Armor{

    public Boots(String name, int defence, int strength, int coin) {
        super(name, defence, strength, coin);
    }

    @Override
    public int Defence(Armor boots) {
        return 0;
    }

    @Override
    public void repair() {

    }
}

