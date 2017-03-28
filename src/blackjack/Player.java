import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class Player here.
 * 
 * @author (Sutter Lum) 
 * @version (3/21)
 */
public class Player
{
    //holds player's cards
    public static Card[] pCards = new Card[4];
    //keeps track of where in the array the next card goes
    public static int pIndex = 0;
    //records the sum of all of the cards in the player's hand
    int pCardSum = 0;
    
    /**
     * Constructor for objects of class Player
     */
    public Player()
    {
        
    }
    
        //allows the player to choose whether to hit or hold
    public void choose()
    {
        System.out.println("Do you want to hit or hold?");
        
        Scanner scan = new Scanner(System.in);
        String pChoice = scan.nextLine();
        
        if (pChoice.equals("hit")){
            //returns the players hand + a new card
            getPlayerHand();
            pIndex++;
            hit();
        }
        else{
            //returns the players hand
            getPlayerHand();
        }
    }
    
    public void start(){
        //generates one half of the player's initial hand
        Random randomGenerator = new Random();
        int newCardValue = randomGenerator.nextInt(13) + 1;
        String newCardName = "";
        if (newCardValue == 11){
            newCardName = "Jack";
            newCardValue = 10;
        }
        else if (newCardValue == 12){
            newCardName = "Queen";
            newCardValue = 10;
        }
        else if (newCardValue == 13){
            newCardName = "King";
            newCardValue = 10;
        }
        else if (newCardValue == 1){
            newCardName = "Ace";
            newCardValue = 1;
        }
        else{
            newCardName = "" + newCardValue + "";
        }
        Card tempC = new Card (newCardValue, newCardName);
        pCards[pIndex] = tempC;
        pIndex++;
    }
    
    public void hit(){
        Random randomGenerator = new Random();
        int newCardValue = randomGenerator.nextInt(13) + 1;
        String newCardName = "";
        if (newCardValue == 11){
            newCardName = "Jack";
            newCardValue = 10;
        }
        else if (newCardValue == 12){
            newCardName = "Queen";
            newCardValue = 10;
        }
        else if (newCardValue == 13){
            newCardName = "King";
            newCardValue = 10;
        }
        else if (newCardValue == 1){
            newCardName = "Ace";
            newCardValue = 1;
        }
        else{
            newCardName = "" + newCardValue + "";
        }
        Card tempC = new Card (newCardValue, newCardName);
        pCards[pIndex] = tempC;
    }

    public boolean bustedCheck(){
         //adds up all the player's cards' values
        for(int x = 0; x < pIndex; x++){
            pCardSum = pCardSum + pCards[x].getValue();
        }
                //checks to see if the player is bust
        boolean busted = false;
        if (pCardSum > 21){
            busted = true;
        }
        return busted;
    }
    
    public void getPlayerHand(){
        for(int x = 0; x < pIndex; x++){
                System.out.print("You have a " + pCards[x].getName() + ". ");
        }
        System.out.println("");    
    }
}
