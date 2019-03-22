package Elevens;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//make a Deck class
public class Deck{
    
    public static final int NUMCARDS = 52;
    public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
    public static final int FACES[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
    private List<Card> cards;
    private int top;

   //make a Deck constructor
    public Deck(){
          
   	//refer cards to new ArrayList
        cards = new ArrayList<Card>();
   	//set top to the top of the deck 51
        top = 51;
   	
   	//loop through all suits
        for(int s = 0; s<SUITS.length; s++){
   		//loop through all faces 1 to 13
            for(int f = 0; f<FACES.length; f++){
   			//add a new TwentyOneCard to the deck
                Card c = new BlackJackCard(SUITS[s],FACES[f]);
                //Card c = new Card(SUITS[s],FACES[f]);
                cards.add(c);
            }
        }
    }
   
   //make a dealCard() method that returns the top card
    public Card dealCard(){
        Card temp = cards.get(top);
        top--;
        return temp;
        
    }
            
   //write a shuffle() method
    public void shuffle(){
        //use Colletions.shuffle
        Collections.shuffle(cards);
        //reset the top card
        top = 51;
    }
   	
}