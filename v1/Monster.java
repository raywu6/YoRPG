//TRK - Thet Htay Zaw, Raymond Wu, Kerwin Chen
//APCS1 period1
//HW28 -- Ye Olde Role Playing Game
//2017-11-08

public class Monster 
{

    //Attributes
    public String name;
    public int life, strength, defense;
    public double attack;

    //Constructors
    public Monster() 
    {
        name = "Grrrrrowl Bear";
    	strength = (int)(Math.random() * 45) + 20;
    	life = 150;
    	defense = 20;
    	attack = 1;
    }
    //Setting all the attributes to the defaults given

    public boolean isAlive() 
    {
	    return life > 0;
    }

    //If you have more than 0 life, you are alive so return true
    //If not, then you are dead and return false

    public int getDefense() 
    {
	    return defense;
    }
    //Just returning the defense


    public String getName() 
    {
	    return name;
    }
    //Although this is a method, the directions don't say to make it an attribute

    public void lowerHP(int damage) 
    {
        int afterFight = life - damage;
	    life = Math.max(0,afterFight);
    }
    //Just editing life
    //If life dips under 0, set it to 0 because negative life doesn't make much sense

    public int attack( Protagonist warrior ) 
    {   
    	double damage = (strength * attack) - warrior.defense;
	    warrior.lowerHP( (int) damage);
    	return (int) damage;
    } 
	
} // end class Monster 
