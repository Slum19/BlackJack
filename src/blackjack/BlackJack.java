
/**
 * Write a description of class BlackJack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackJack
{
    /**
     * Constructor for objects of class BlackJack
     */
    public BlackJack(){
    }
    
        //starts the game and gives the player their cards
    public void play(){
        Player paulie = new Player();
        paulie.start();
        paulie.start();
        paulie.getPlayerHand();
            //the player chooses whether to hit or hold
        paulie.choose();    
        if (paulie.bustedCheck() == true){
            System.out.println("You lose");
        }
    }
}
