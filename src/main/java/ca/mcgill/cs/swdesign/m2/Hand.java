package ca.mcgill.cs.swdesign.m2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * A collection of cards, presumably in a player's hand.
 */
public class Hand implements Iterable<Card>
{
	private int aMaxCards;
	private List<Card> aCards = new ArrayList<>();
	
	/**
	 * Creates a new hand that can hold between
	 * 0 and pMaxCards inclusively.
	 * @param pMaxCards A number between 0 and 52
	 */
	public Hand(int pMaxCards)
	{
		assert pMaxCards >=0 && pMaxCards <= Card.Rank.values().length * Card.Suit.values().length;
		aMaxCards = pMaxCards;
	}
	
	/**
	 * @return True if the number of cards is the hand is the maximum permissible.
	 */
	public boolean isFull()
	{
		return aCards.size() == aMaxCards;
	}
	
	/**
	 * @param pCard The card to add.
	 * @pre !isFull()
	 */
	public void add(Card pCard)
	{
		assert !isFull();
		aCards.add(pCard);
	}

//  public static Comparator<Hand> createByRankComparator(Card.Rank pRank)
//  {
//    return new Comparator<Hand>()
//    {
//      @Override
//      public int compare(Hand pHand1, Hand pHand2)
//      {
//        //pRank from outer method
//        //return countCards(pHand1, pRank) - countCards(pHand2, pRank);
//      }
//      //...
//    };
//  }
	@Override
	public Iterator<Card> iterator()
	{
		return aCards.iterator();
	}
}
