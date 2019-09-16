package utilities;

public class Card {
    private CardNaipe naipe;
    private CardValue values;

    public Card(CardNaipe naipe, CardValue values){
        this.naipe = naipe;
        this.values = values;
    }

    @Override
    public String toString() {
        return " " + values + " "+ naipe;
    }
}
