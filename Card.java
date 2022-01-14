public class Card
{

    private String rank; // number or q k j
    private int value; // how many points
    private String suit;// diamond, hearts, spades, clubs

    public Card(String inRank, String inSuit, int inValue)
    {
        rank = inRank;// this.rank is the private variable above //rank is input
        value = inValue;
        suit = inSuit;
    }

    public void setValue(int inValue)
    {
        value = inValue;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public String getRank()
    {
        return rank;
    }
    
    public String toString()
    {
        return "Rank: " + rank +" Suit: " + suit +" Value: " + value;
    }
}