import java.util.*;

public class BlackJackClass
{
    public static void main(String[] args)
    {
        boolean deala = true;
        boolean keepPlaying = true;
        Player dealer = new Player(deala);
        Player user = new Player(!deala);
        Deck cards = new Deck();
        Card[] deck = cards.shuffle();
        int count = 0;
        
        
        Scanner input = new Scanner(System.in); 
       
       user.deal(deck,count);
       count++;
       dealer.deal(deck,count);
       count++;
       user.deal(deck,count);
       count++;
       dealer.deal(deck,count);
       count++;
       user.hand();
       dealer.hand();
       while(keepPlaying)
       {
       while(user.value() <=21)
       {
           
        
          
           
          // System.out.println("Your hands value is " + user.value());
         //  System.out.println("The CPU's value is " + dealer.value());

           System.out.println("Would you like to hit or stay. Press h or s");
         
           if(input.nextLine().equals("h"))
           {
               user.deal(deck,count);
               count++;
              
           }
           
           else
           {
               break;
               
               
           }
            user.hand();
          
               
           
       }
                  if(user.value() >21)
                  System.out.println("You busted at " + user.value()); 

       
       if(user.value() <=21)
       {
       while(dealer.value() <= 17)
       {
               dealer.deal(deck,count);
               count++;

               dealer.hand();
               if(dealer.value() > 21)
               {
                   System.out.println("Dealer busted you win!");
                }
                
            }
        }
          if(dealer.value ()<= 21 && user.value() <= 21)
          {
          if(user.value() > dealer.value())
          System.out.println("You Win!");
          else if (user.value() == dealer.value())
          System.out.println("You tied");
          else
          System.out.println("You lost");
        }
        
        System.out.println("Would you like to play again. Press y or n");
        if(input.nextLine().equals("n"))
        keepPlaying = false;
        
        else
        {
            user.reset();
            dealer.reset();
            count=0;
            deck=cards.shuffle();
            
            user.deal(deck,count);
       count++;
       dealer.deal(deck,count);
       count++;
       user.deal(deck,count);
       count++;
       dealer.deal(deck,count);
       count++;
       user.hand();
       dealer.hand();
       
        }

    }
        
        
        
        
    }
}