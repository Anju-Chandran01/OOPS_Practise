package com.blz.deckofcards;

import java.util.Random;

public class DeckOfCards {

    // INITIALIZATION OF DECK OF CARDS
    String[] suit = {"Clubs","Diamonds","Hearts","Spades"};
    String[] rank = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
    String[][] players = new String[4][9]; // 9 CARDS TO 4 PLAYERS
    String[][] cardToDistribute = new String[4][13];

    public static void main(String[] args) {

        System.out.println("--- Welcome to Deck Of Cards ---");

        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.getCards();
        deckOfCards.getPlayers();
    }

    // METHOD TO GET THE CARD COMBINATION TO DISTRIBUTE IN 2D ARRAY
    private void getCards() {
        for(int i = 0; i < 4; i++){ // SUIT
            for(int j = 0; j < 13; j++){ // RANK
                cardToDistribute[i][j] = suit[i] + rank[j];
            }
        }
    }

    //METHOD TO PRINT CARDS RECEIVED BY FOUR PLAYERS
    private void getPlayers() {
        for(int i = 0; i < 4; i++){
            System.out.println("   Player" + (i + 1));
            System.out.println("-------------");
            for (int j = 0; j < 9; j++){
                Random random = new Random();
                int suitValue = random.nextInt(4);
                int rankValue = random.nextInt(13);
                players[i][j] = cardToDistribute[suitValue][rankValue];
                System.out.println(players[i][j]);
            }
        }
    }
}
