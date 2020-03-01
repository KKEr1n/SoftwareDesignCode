package ca.uvic.seng330;

import ca.mcgill.cs.swdesign.m2.Card.Suit;
import ca.mcgill.cs.swdesign.m2.Card.Rank;

public class FlyWeightCard {
  private static final FlyWeightCard[][] CARDS =
      new FlyWeightCard[Suit.values().length][Rank.values().length];

  //pre-initialize the Flyweight store
  static {
    for (Suit suit : Suit.values()) {
      for (Rank rank : Rank.values()) {
        CARDS[suit.ordinal()][rank.ordinal()] = new FlyWeightCard(rank, suit);
      }
    }
  }

  private final Rank aRank;
  private final Suit aSuit;

  //important change to private constructor
  private FlyWeightCard(Rank pRank, Suit pSuit) {
    aRank = pRank;
    aSuit = pSuit;
  }

  public static FlyWeightCard get(Rank pRank, Suit pSuit) {
    assert pRank != null && pSuit != null;
    return CARDS[pSuit.ordinal()][pRank.ordinal()];
  }
}