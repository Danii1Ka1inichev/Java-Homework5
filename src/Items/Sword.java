package Items;

public class Sword extends Weapon {

    public Sword(String name, int attack, int strength) {
        super(name, attack, strength);
    }

    @Override
    public void repair() {
    }

    @Override
    public int weaponAttack(Weapon weapon) {
        return weapon.attack;
    }
}
