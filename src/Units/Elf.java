package Units;

import Items.Armor;
import Items.Inventory;
import Items.Weapon;

public class Elf extends Humanoid {
    public int coin;
    public Weapon weapon;
    public Armor armor;

    public Elf(Inventory bag, String name, int maxHp, int attack, int defence, int coin, Weapon weapon) {
        super(name, attack, defence, maxHp, bag);
        this.coin = coin;
        this.weapon = weapon;
    }
    @Override
    public void attack(Humanoid target) {
        int damage = 0;
        int defence = target.defence;
        if (weapon != null) {
            if (weapon.strength > 0) {
                damage += weapon.weaponAttack(weapon);
                weapon.strength = -2;
            }
            damage = damage + attack - target.defence;
            System.out.println("Персонаж " + name + " наносит по " + target.name + " урон = " + damage + " ед. здоровья");
            if(damage > 0){
                target.maxHp -= damage;
                System.out.println("У персонажа " + target.name + " осталось: " + target.maxHp + " ед. здоровья");
                if (weapon != null) System.out.println("Прочность пердмета " + weapon.name + " = " + weapon.strength);
//                if (target.head != null) System.out.println("Прочность пердмета " + target.head.name + " = " + target.head.strength);
//                if (target.body != null) System.out.println("Прочность пердмета " + target.body.name + " = " + target.body.strength);
//                if (target.legs != null) System.out.println("Прочность пердмета " + target.legs.name + " = " + target.legs.strength);
            }else System.out.println("Урона не прошел");
        }
    }
    @Override
    public void attack(Reptiloids target) {
        int damage = 0;
        int defence = target.defence;
        if (weapon != null){
            if (weapon.strength > 0){
                damage += weapon.weaponAttack(weapon);
                weapon.strength = -2;
            }
            damage = damage + attack - target.defence;
            System.out.println("Персонаж " + name + " наносит по " + target.name + " урон = " + damage + " ед. здоровья");
            if(damage > 0){
                target.maxHp -= damage;
                System.out.println("У монстра " + target.name + " осталось: " + target.maxHp + " ед. здоровья");
                if (weapon != null) System.out.println("Прочность пердмета " + weapon.name + " = " + weapon.strength);
//                if (target.head != null) System.out.println("Прочность пердмета " + target.head.name + " = " + target.head.strength);
//                if (target.body != null) System.out.println("Прочность пердмета " + target.body.name + " = " + target.body.strength);
//                if (target.legs != null) System.out.println("Прочность пердмета " + target.legs.name + " = " + target.legs.strength);
            }else System.out.println("Урона не прошел");
        }
    }
}
