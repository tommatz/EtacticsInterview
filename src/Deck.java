import java.util.*;

public class Deck {
    private List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        generateDeck();
    }

    public void generateDeck() {
        for (Suit suit : Suit.values()) {
            for (int i = 2; i < 15; i ++){
                Card new_card = new Card(i, suit);
                this.cards.add(new_card);
            }
        }
    }

    public int getDeckSize() {
       return this.cards.size();
    }

    public void shuffleDeck() {
        Collections.shuffle(this.cards);
    }

    public void manualShuffleDeck() {
        Random random = new Random();
        int deckSize = this.cards.size();
        for (int i = deckSize - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Card temp = this.cards.get(i);
            this.cards.set(i, this.cards.get(j));
            this.cards.set(j, temp);
        }
    }

    public void sortByRank() {
        this.cards.sort(new CardComparatorRank());
    }

    public void sortByRankAndSuit() {
        this.cards.sort(new CardComparatorRank());
        this.cards.sort(new CardComparatorSuit());
    }

    private static class CardComparatorRank implements Comparator<Card> {
        @Override
        public int compare(Card card1, Card card2) {
            return Integer.compare(card1.getRank(), card2.getRank());
        }
    }

    private static class CardComparatorSuit implements Comparator<Card> {
        @Override
        public int compare(Card card1, Card card2) {
            return card1.getSuit().compareTo(card2.getSuit());
        }
    }

    public void outputDeck() {
        for(Card card : this.cards){
            System.out.println(card.getRankString() + " of " + card.getSuit());
        }
    }
}
