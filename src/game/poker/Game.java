package game.poker;

import utilities.Card;
import utilities.Deck;

public class Game {

    private Deck deck;
    private Dealer dealer;
    private Hand hand;

    public Game(){
        deck = new Deck();
        dealer = new Dealer();
    }
    public void play(){
        System.out.println("Cards in deck: " + deck.showCards().size());
        hand = dealer.deal(deck);
        System.out.println("Cards in deck: " + deck.showCards().size());
        for (Card card : hand.getCards()){
            System.out.println(card);
        }
    }
    }

