package com.nology.javaCardGame;

import java.util.HashMap;

public class Card {
    int[] deck = new int[52];
    String suits[] = {"\u2660", "\u2661", "\u2662", "\u2663"};;
    String[] cards = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public Card(String suit, String card) {
    }

    public Card() {

    }

    public static void main(String[] args) {
        Card card = new Card();
        card.card();

    }
    public void card() {
        //individual card suit creation
//        HashMap<String, Integer> cards = new HashMap<String, Integer>();
//
//        cards.put("2", 2);
//        cards.put("3", 3);
//        cards.put("4", 4);
//        cards.put("5", 5);
//        cards.put("6", 6);
//        cards.put("7", 7);
//        cards.put("8", 8);
//        cards.put("9", 9);
//        cards.put("10", 10);
//        cards.put("J", 11);
//        cards.put("Q", 12);
//        cards.put("K", 13);
//        cards.put("A", 14);
//        System.out.println(cards.keySet());
//        System.out.println(cards.values());
//        System.out.println(cards);

        for(int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        for (int i = 0; i < deck.length; i++) {
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

    }

    public int[] getDeck() {
        return deck;
    }

    public String[] getSuit() {
        return suits;
    }

}
