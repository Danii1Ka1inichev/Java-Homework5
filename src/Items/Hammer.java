package Items;

import Units.Humanoid;

public class Hammer extends Weapon{

    public Hammer(String name, int attack, int strength){
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
