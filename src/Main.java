public class Main {
    public static void main(String[] args) {
        Deck deck_obj = new Deck();
        System.out.println(deck_obj.getDeckSize() + " cards in the deck.\n");
        deck_obj.shuffleDeck();
        System.out.println("Shuffled Deck:");
        deck_obj.outputDeck();

        deck_obj.sortByRank();
        System.out.println("\nSorted by Rank:");
        deck_obj.outputDeck();

        deck_obj.shuffleDeck();
        deck_obj.sortByRankAndSuit();
        System.out.println("\nSorted by Suit and Rank:");
        deck_obj.outputDeck();
    }
}