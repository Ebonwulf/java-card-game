package com.nology.javaCardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardGame extends Card{

    public CardGame() {

    }

    public static void main(String[] args) {
        CardGame generateCards = new CardGame();
        generateCards.generateDeck();
    }

    public ArrayList<Card> deckOfCards = new ArrayList<>();
    int counter;

    public CardGame(String suit, String card) {
        super(suit, card);
    }


    public void generateDeck() {
        deckOfCards = new ArrayList<Card>();
        for (int i = 0; i<suits.length; i++) {
            for(int x = 0; x < cards.length; x++){
                this.deckOfCards.add(new Card(suits[i], cards[x]));
            }
        }
        //Shuffle after the creation
        Collections.shuffle(List.of(this.cards));
        System.out.println(cards);

    }

    public String[] getCards() {
        return cards;
    }

    }
