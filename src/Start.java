import Items.*;
import Units.Dragon;
import Units.Elf;
import Units.Human;
import Units.Orc;


import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        //Создание персонажей, оружия, экиперовки
        Weapon sword = new Sword("Меч Нарсил", 20, 100);
        Armor helmet = new Helmet("Шлем", 1,1,1);
        Armor body = new Body("Туника",1,1,1);
        Armor gloves = new Gloves("Перчатки",1,1,1);
        Armor boots = new Boots("Ботинки", 1,1,1);
        Human human = new Human(new Inventory(10), "Арагорн", 100, 10,0, 100, sword, helmet, body, gloves, boots);
        Weapon hammer = new Hammer("Молот Гронд", 30, 100);
        Orc orc = new Orc(new Inventory(10), "Азог", 100, 10, 0, 100, hammer);
        Weapon bow = new Bow("Белфрондинг", 40, 100);
        Elf elf = new Elf(new Inventory(10),"Леголас", 100, 10, 0, 100, bow );
        Dragon dragon = new Dragon("Глаурунг", 50, 10, 100, 100);
        //метод атаки
        System.out.println("_______Битва начинается_______");
        human.attack(dragon);
        elf.attack(dragon);
        orc.attack(dragon);
        System.out.println("_______Атакует Дракон_________");
        dragon.attack(human);
        dragon.attack(elf);
        dragon.attack(orc);
        System.out.println("______________________________");
        //Создание инвентаря для персонажа
        System.out.println("__________Инвентарь___________");
        Sword rustySword = new Sword("Ржавый Меч", 1,1);
        human.bag.inventory[0] = rustySword;
        Body rustyBody = new Body("Ржавый Нагрудник", 1,1,1);
        human.bag.inventory[1] = rustyBody;
        Boots rustyBoots = new Boots("Ржавые Ботинки", 1, 1, 1);
        human.bag.inventory[2] = rustyBody;
        Gloves rustyGlover = new Gloves("Ржавые Перчатки", 1, 1, 1);
        human.bag.inventory[3] = rustyGlover;
        Helmet rustyHelmet = new Helmet("Ржавый Шлем", 1, 1, 1);
        human.bag.inventory[4] = rustyHelmet;
        System.out.println(Arrays.toString(human.bag.inventory));
        Hammer rustyHammer = new Hammer("Ржавый Молот", 1,1);
        orc.bag.inventory[0] = rustyHammer;
        System.out.println(Arrays.toString(orc.bag.inventory));
        System.out.println("______________________________");



}
}
