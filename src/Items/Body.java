package Items;

public class Body  extends Armor {


    public Body(String name, int defence, int strength, int coin) {
        super(name, defence, strength, coin);
    }

    @Override
    public int Defence(Armor body) {
        target.defence += name.defence;
        System.out.println("Броня " + target.name + " увеличена " + target.defence);
        return defence;
    }

    @Override
    public void repair() {

    }
}
