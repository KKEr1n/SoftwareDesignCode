package ca.mcgill.cs.swdesign.m1;

import ca.mcgill.cs.swdesign.m2.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Deck
{
   /* There is no door */
   public Stack<Card> aCards = new Stack<>();
	
   /* The front door is open */
   public Stack<Card> getCards()
   { return aCards; }
	
   /* The door was not closed */
   public void setStack(Stack<Card> pCards)
   { aCards = pCards; }
	
   /* The back door is open */
   public void applyAll( List<Stack<Card>> pTaskList )
   { pTaskList.add(aCards); }
}

public class Deck2 {
  private List<Card> aCards = new ArrayList<>();
  public List<Card> getCards() { return aCards; } //escae the scope restriction
}
