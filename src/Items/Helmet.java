package Items;

public class Helmet extends Armor{

    public Helmet(String name, int defence, int strength, int coin) {
        super(name, defence, strength, coin);
    }

    @Override
    public int Defence(Armor helmet) {
        return 0;
    }

    @Override
    public void repair() {

    }
}

