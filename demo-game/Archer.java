public class Archer extends Hero{

  public Archer(int level, long id, int hp, int mp, int pd, int pa, int ma, int md) {
    super(level,id, hp, mp, pd, pa, ma, md);
  }
  

  
  public int getMaxHp() {
    return Hero.getMaxHp(Role.ARCHER, super.getLevel());
  }

  public int getMaxMp() {
    return Hero.getMaxMp(Role.ARCHER, super.getLevel());
  }

 public static void main(String[] args) {
  System.out.
 }

  }

