public class Archer extends Hero{

  public Archer(long id) {
    super(id);
  }
  
  public int getMaxHp() {
    return Heros.getMaxHp(Role.ARCHER, super.getLevel());
  }

  public int getMaxMp() {
    return Hero.getMaxMp(Role.ARCHER, super.getLevel());
  }
}
