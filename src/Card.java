public class Card {
    private int rank;
    private Suit suit;

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public String getRankString() {
        switch (this.rank) {
            case 2:
                return "TWO";
            case 3:
                return "THREE";
            case 4:
                return "FOUR";
            case 5:
                return "FIVE";
            case 6:
                return "SIX";
            case 7:
                return "SEVEN";
            case 8:
                return "EIGHT";
            case 9:
                return "NINE";
            case 10:
                return "TEN";
            case 11:
                return "JACK";
            case 12:
                return "QUEEN";
            case 13:
                return "KING";
            case 14:
                return "ACE";
            default:
                System.out.println("Unknown rank");
                break;
        }
        return null;
    }
}
