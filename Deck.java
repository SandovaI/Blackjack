
public class Deck
{
    // instance variables - replace the example below with your own
    private int top;
    private Card[] deck;
    //private ArrayList<Card> deck;
    /**
     * Constructor for objects of class Deck
     */
    public Deck()
    {
    deck = new Card[52];
    top = 0;
    
    String[] ranks = {"Ace","King","Queen","Jack","Ten","Nine","Eight","Seven","Six","Five","Four","Three","Two"};
    String[] suits ={"Hearts","Spades","Diamonds","Clubs"};
    int[] values ={11,10,10,10,10,9,8,7,6,5,4,3,2};

    for(int i=0; i<deck.length; i++)
    {
        deck[i] = new Card(ranks[i%13], suits[i%4], values[i%13]);  // assigns all values of 
    }    
    }
    
    public Card[] shuffle()
    {
        int random;
        Card temp;
        for(int i = 0;i<deck.length; i++)
        {
            random = (int) (Math.random() * deck.length) + 0;
            temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
            
            
            
        }
        return deck;
    }
   
    
   
    
    //write a method that shuffles.
    


}