public abstract class Hero {
    private long id;
    private int hp;
    private int mp;
    private int pa;
    private int pd;
    private int ma;
    private int md;
    // private int 
    private static final int[] maxHp = new int[] {2,4,6};
    private static final int[] maxMp = new int [] {2,4,6};
    
    
    private int level;
  
    // static final
    // private int maxHp;
    // private int maxMp;
  
    // HP - Health Point
    // MP - Magic Point
    // Level
    // attackPower
  
    public Hero(long id) {
     this.level = 1;
      this.id = id;
      this.hp = maxHp[level-1];
      this.mp = maxMp[level-1];     
    }

    public void levelUp() {          
        level++;
         this.hp = maxHp[level-1];
        this.mp = maxMp[level-1];
      }   
    

    public long getId() {
      return this.id;
    }
  
    // Method:
    // Presentation: isAlive
    // Action: Level Up: +MaxHP, +MaxMP ()
  
    // Hero is a Parent Class
    // Child Class: Archer, Mage, Warrior
  
    // attackPower
    // Weapon
  
    // Hero[] heros = new Hero[3];

    public static void main(String[] args) {
      Hero[] heros = new Hero[3];
      heros[0] = new Warrior(1L);
      heros[1] = new Archer(2L);
      heros[2] = new Mage(3L);


      
    }
  }