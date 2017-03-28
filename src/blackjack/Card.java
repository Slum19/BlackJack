
/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card 
{
    // instance variables - replace the example below with your own
    public String name;
    public int value;

    /**
     * Constructor for objects of class Card
     */
    public Card(int v, String n){
        value = v;
        name = n;
    }

    public String getName()
    {
        return name;
    }
    
    public int getValue()
    {
        return value;
    }
}
