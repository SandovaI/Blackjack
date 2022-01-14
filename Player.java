
import java.util.*;

public class Player
{
   private ArrayList<Card> hand = new ArrayList<Card>();
   private ArrayList<Card> cpuHand = new ArrayList<Card>();
    private int totalValue = 0;
    private int cpuValue = 0;
    private boolean contains;
    private boolean dealer;

    public Player(boolean state)
    
    {
        dealer = state;
    }
    
    
    public void deal(Card[] deck, int count)
    {
      if(dealer)
      {
         cpuHand.add(deck[count]);
      count++; 
          
      }
      else
      {
      hand.add(deck[count]);
      count++;

    }
    }
   public void hand()
   {
       cpuValue= 0;
       totalValue=0;
       
       if(dealer)
       {
        System.out.println("These are the cpu's cards");
       

        for(Card i: cpuHand)
        {
           cpuValue += i.getValue();
        }
          if(cpuValue > 21)
        {
         for(Card j: cpuHand)
        {
          if( j.getRank().equals("Ace"))
          j.setValue(1);
        }
        
    } 
    cpuValue =0;
    
        for(Card b: cpuHand)
        {
            
           System.out.println(b);
           cpuValue += b.getValue();
        }
    
       
       
      System.out.println("The CPU's value is " + cpuValue);  
       System.out.println();  

    }else
    {
       
        for(Card i: hand)
        {
           totalValue += i.getValue();
        }
          if(totalValue > 21)
        {
         for(Card j: hand)
        {
          if( j.getRank().equals("Ace"))
          j.setValue(1);
        }
        
    } 
    totalValue = 0;
    
        for(Card b: hand)
        {
            
           System.out.println(b);
           totalValue += b.getValue();
        }
    
       
      System.out.println("Your hand's value is " + totalValue); 
             System.out.println();  

    }
       
    }
    
    public int value()
    {
          if(dealer)
        return cpuValue;
        
        return totalValue;
        
    }
    public void reset()
    {
          if(dealer)
          {
        cpuHand.removeAll(cpuHand);
        cpuValue=0;
    }
    
        hand.removeAll(hand);
        totalValue=0;
        
    }
        
    
    
 
}