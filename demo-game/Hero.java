public abstract class Hero {
    private long id;
    private int hp;
    private int mp;
    private int pa;
    private int pd;
    private int ma;
    private int md;
    private int level;
    
    private static final int[] ARC_MAX_HP_TAB;
    private static final int[] WAR_MAX_HP_TAB;
    private static final int[] MAG_MAX_HP_TAB;
    static {
     ARC_MAX_HP_TAB = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
     WAR_MAX_HP_TAB = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
     MAG_MAX_HP_TAB = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }
    
    
    private static final int[] ARC_MAX_MP_TAB;
    private static final int[] WAR_MAX_MP_TAB;
    private static final int[] MAG_MAX_MP_TAB;
    static {
     ARC_MAX_MP_TAB = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
     WAR_MAX_MP_TAB = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
     MAG_MAX_MP_TAB = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }
       
    

  
    public Hero(long id, int hp, int mp, int pd, int pa, int ma, int md) {
     this.level = 1;
      this.id = id;
       this.hp = hp;
       this.mp = mp;
       this.pd = pd;
       this.pa = pa;
       this.ma = ma;
       this.md = md;
    }

    public static int getMaxHp(Role role, int level) {
      switch (role) {
        case ARCHER:
          return ARC_MAX_HP_TAB[level - 1];
        case WARRIOR:
          return WAR_MAX_HP_TAB[level - 1];
        case MAGE:
          return MAG_MAX_HP_TAB[level - 1];
        default:
          break;
      }
      return -1;
    }

    public static int getMaxMp(Role role, int level) {
      switch (role) {
        case ARCHER:
        return ARC_MAX_MP_TAB[level-1];
        case WARRIOR:
        return WAR_MAX_MP_TAB[level-1];
        case MAGE:
        return MAG_MAX_MP_TAB[level-1];
        default:
        break;
      }
      return -1;
    }
    // public void levelUp() {          
    //     level++;
    //      this.hp = maxHp[level-1];
    //     this.mp = maxMp[level-1];
    //   }
      
      public int getLevel() {
        return this.level;
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
      heros[2] = new Mage(3L,1, 1, 1, 1, 1, 1 );

      System.out.println(Hero.getMaxHp(Role.WARRIOR, 5));
      System.out.println(Hero.getMaxMp(Role.ARCHER, 10));


      
    }
  }