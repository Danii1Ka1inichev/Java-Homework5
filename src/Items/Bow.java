package Items;

public class Bow extends Weapon {

    public Bow(String name, int attack, int strength) {
        super(name, attack, strength);
    }

    @Override
    public int weaponAttack(Weapon weapon) {
        return weapon.attack;
    }

    @Override
    public void repair() {

    }
}