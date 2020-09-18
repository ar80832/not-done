

public class Main{
    
     public static void main(String[] args) {
        // TODO Auto-generated method stub
        Warrior c1 = new Warrior("Jim");
        Warrior c2 = new Warrior("Bob");
        Warrior c3 = c1;
        Warrior c4 = new Warrior("Bill", 10);
        
        
    }
}

public class Warrior {
    //declare instance variables
    private String name;
    private int level;
    private int maxHealth;
    private int health;
    private int attack;
    private int defense;
    private int magicAttack;
    private int magicDefense;
    private int agility;
    private int wisdom;
    
        //constructor is for creating level 1 characters
        public Warrior(String n) {
            name = n;
            level = 1;
            maxHealth = 20;
            health = maxHealth;
            attack = 10;
            defense = 8;
            magicAttack = 0;
            magicDefense = 4;
            agility = 7;
            wisdom = 2;
        }
         //constructor for creating higher level characters
        public Warrior(String n, int lev) {
            name = n;
            level = lev;
            maxHealth = 20*lev;
            health = maxHealth;
            attack = 10*lev;
            defense = 8*lev;
            magicAttack = 0*lev;
            magicDefense = 4*lev;
            agility = 7*lev;
            wisdom = 2*lev;
        }
}