public class Card {
  // static: shared values
  // final: cannot be modified after initialization
  // static and final can be together
  // "static final" -> constant
  // Constant naming convention
  public static final char[] SUITES = new char[] {'D', 'C', 'H', 'S'};
  public static final Rank[] RANKS = new char[] {Rank.ACE, Rank.TWO, Rank.THREE, //
      Rank.FOUR, Rank.FIVE, Rank.SIX, Rank.SEVEN, Rank.EIGHT, Rank.NINE, //
      Rank.TEN, Rank.JACK, Rank.QUEEN, Rank.KING};

  public static final int x = 3;

  private Rank rank; // 'A', '2' ..'T', 'J', 'Q' 'K'
  private char suite; // 'D', 'C', 'H', 'S'

  public Card(char rank, char suite) {
    this.rank = rank;
    this.suite = suite;
  }

  public Rank getRank() {
    return this.rank;
  }

  public char getSuite() {
    return this.suite;
  }

  public boolean isSameRank(Card card) {
    return this.rank == card.getRank();
  }

}