package Units;

public class Dragon extends Reptiloids{

    public Dragon(String name, int attack, int defence, int maxHp, int flySpeed) {
        super(name, attack, defence, maxHp, flySpeed);
    }

    @Override
    public void attack(Humanoid target) {
        if (attack >= defence) {
            target.maxHp -= attack;
            System.out.println(name + " нанес персонажу " + target.name + " урон = " + attack + " ед. здоровья");
            System.out.println("У персонажа " + target.name + " осталось: " + target.maxHp + " ед. здоровья");
        }
    }

    @Override
    public void attack(Reptiloids target) {

    }
}
