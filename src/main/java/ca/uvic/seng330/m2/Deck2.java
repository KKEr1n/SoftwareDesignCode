package ca.uvic.seng330.m2;

import ca.mcgill.cs.swdesign.m2.Card;

import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

public class Deck2
{
	private final Stack<Card> aCards;
	public Deck2(Deck2 pDeck)
	{
		aCards = new Stack<>();
		for(Card card : pDeck.aCards)
		{
			aCards.add(card);
		}
	}
	   public void sort()
	   {				
	      Collections.sort(aCards, new Comparator<Card>() {
	         @Override
	         public int compare(Card pCard1, Card pCard2)
	         { /* Comparison code */
	         return -1;
	         }
	      });
	   }
}
