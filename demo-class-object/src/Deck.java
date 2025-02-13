import java.util.Arrays;

public class Deck {
  private Card[] cards;

  public Deck() {
    this.cards = new Card[Card.SUITES.length * Card.RANKS.length]; // 13 * 4
    int idx = 0;
    for (char rank : Card.RANKS) {
      for (char suite : Card.SUITES) {
        this.cards[idx++] = new Card(rank, suite);
      }
    }
  }

  public List<Card> getCards() {
    return Arrays.asList(this.cards);
  }

  public static void main(String[] args) {
    Deck deck1 = new Deck(); // 52 cards

    System.out.println(Math.PI); // public & static
    // Math.PI = 1.0; // final
    Card card = new Card('A', 'S');
    Card card2 = new Card('A', 'S');
    
    if (card.equals(new Card('A', 'S'))) {

    }

    // Card.x = 10;
    // Card.suites = new char[3];

    // Card c1 = new Card('A', 'D');
  }
}