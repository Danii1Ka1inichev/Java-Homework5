package Units;

import Items.Armor;
import Items.Inventory;
import Items.Weapon;

public class Human extends Humanoid {
    public int coin;
    public Weapon weapon;
    public Armor helmet;
    public Armor body;
    public Armor gloves;
    public Armor boots;


    public Human(Inventory bag, String name, int maxHp, int attack, int defence, int coin, Weapon weapon, Armor helmet, Armor body, Armor gloves, Armor boots) {
        super(name, attack, defence, maxHp, bag);
        this.coin = coin;
        this.weapon = weapon;
        this.helmet = helmet;
        this.body = body;
        this.gloves = gloves;
        this.boots = boots;
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
            if (damage > 0) {
                target.maxHp -= damage;
                System.out.println("У персонажа" + target.name + " осталось: " + target.maxHp + " ед. здоровья");
                if (weapon != null) System.out.println("Прочность пердмета " + weapon.name + " = " + weapon.strength);
//                if (target.helmet != null) System.out.println("Прочность пердмета " + target.helmet.name + " = " + target.helmet.strength);
//                if (target.body != null) System.out.println("Прочность пердмета " + target.body.name + " = " + target.body.strength);
//                if (target.gloves != null) System.out.println("Прочность пердмета " + target.gloves.name + " = " + target.gloves.strength);
//                if (target.boots != null) System.out.println("Прочность пердмета " + target.boots.name + " = " + target.boots.strength);
            } else System.out.println("Урона не прошел");
        }
    }

    @Override
    public void attack(Reptiloids target) {
        int damage = 0;
        int defence = target.defence;
        if (weapon != null) {
            if (weapon.strength > 0) {
                damage += weapon.weaponAttack(weapon);
                weapon.strength = -2;
            }
            damage = damage + attack - target.defence;
            System.out.println("Персонаж " + name + " наносит по " + target.name + " урон = " + damage + " ед. здоровья");
            if (damage > 0) {
                target.maxHp -= damage;
                System.out.println("У монстра " + target.name + " осталось: " + target.maxHp + " ед. здоровья");
                if (weapon != null) System.out.println("Прочность пердмета " + weapon.name + " = " + weapon.strength);
//                if (target.helmet != null) System.out.println("Прочность пердмета " + target.helmet.name + " = " + target.helmet.strength);
//                if (target.body != null) System.out.println("Прочность пердмета " + target.body.name + " = " + target.body.strength);
//                if (target.gloves != null) System.out.println("Прочность пердмета " + target.gloves.name + " = " + target.gloves.strength);
//                if (target.boots != null) System.out.println("Прочность пердмета " + target.boots.name + " = " + target.boots.strength);
            } else System.out.println("Урона не прошел");
        }
    }
//    public void equip(Armor item) {
//        armor += item.armor;
//        System.out.println(name + " надел " + item.armor + " броня: " + armor);
//    }
}

//    // метод суммирования брони
//    public void equip(Armor) {
//        int damage = 0;
//        int defence = target.helmet + target.body + target.gloves + target.boots;
//        if (armor != null) {
//            if (armor.strength > 0) {
//                damage += armor.Defence(armor);
//                armor.strength = -2;
//                System.out.println(name + " вся броня одета");
//            }
//        }
//    }
//    @Override
//    public void block(Humanoid target) {
//        int attack = target.attack;
//        if (target.block) {
//            if (Math.random() < 0.75) {
//                System.out.println(target.name + "  полностью заюлокировал атаку");
//                return;
//            } else {
//                attack *= 2;
//            }
//        }Weapon.blockAction();
//    }
//    public static void blockAction(){
//
//        block = true;
//        System.out.println(name + " блокирует атаку");
//    }
//    public void reset(){
//        block = false;
//    }





