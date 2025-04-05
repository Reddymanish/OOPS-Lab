abstract class GameCharacter {
    abstract void attack();
}


class Warrior extends GameCharacter {
    void attack() {
        System.out.println("Warrior attacks with a sword!");
    }
}

class Mage extends GameCharacter {
    void attack() {
        System.out.println("Mage attacks with a fireball!");
    }
}

public class Abstract1 {
    public static void main(String[] args) {
        GameCharacter warrior = new Warrior();
        GameCharacter mage = new Mage();
       
        warrior.attack();
        mage.attack();
    }
}
