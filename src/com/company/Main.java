package com.company;

import javax.smartcardio.Card;

public class Main {

    public static void main(String[] args) {

        // Step 1 code goes here.  Declare an array to hold the deck of cards.
        // Name the array deck.  Make the array size 52

        int intArray[Deck];
        intArray = new int[52];


        //Method to populate the deck of cards
        populateDeck(deck);

        //Method to print deck of cards
        printDeck(deck);

        //Method to shuffle deck of cards
        shuffleDeck(deck);

        //Method to print deck of cards
        printDeck(deck);
    }


    //Method to populate the deck of cards
    public static void populateDeck(String[] deck){

        // Array to hold suits
        String[] suits = {"Hearts","Spades","Clubs","Diamonds"};
        for( int i = 0; i <n; i++);
        System.out.println(a[i]);

        //Array to hold card values
        String[] values ={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        //Step 2 code goes here.  Use the arrays (suits and values) and a nested loop to
        // populate the deck array


        int deckIndex = 0;

        for (int suit = 0; suit < 4 ; suit++){
            for (int rank = 1; rank < 13; rank++){
                deck[index] = new Card(suit, rank);
                index++;

                deck[deckIndex] = suits[suitIndex] + values[valuesIndex];
            }
        }
    }

    //Method to populate the deck of cards
    public static void printDeck(String[] deck){

        //Step 3 code goes here.  Use a for loop to print the deck array

        for (int i = 0; i < n; i++)
            System.out.println(a[i]);
    }

    //Method to populate the deck of cards
    public static void shuffleDeck(String[] deck){

        //Step 4 code goes here.  Use a for loop to swap each card in the deck
        //with a random card in the deck

        double[] a = new double [];
        for (int i = 0; i < n; i++)
            a[i] = Math.random();
    }

    //Method to swap the value of two spots in the deck array
    public static void swap(String[] deck, int i, int x){
        //step 5 code goes here.  Swap the values held by deck[i] and deck[x]

        for (int i = 0; i < n;i++){
            double temp = x[i];
            x[i] = x[n-1-i];
            x[n-i-1] = temp;
        }
    }
}
