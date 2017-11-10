//Kerwin Chen (Collaborators: Raymond Wu, Thet Zaw -- Team TRK)
// APCS1 pd1
// HW28 -- Ye Olde Role Playing Game
// 2017-11-08

public class Protagonist
{
    // instance variables
    public String name;
    public int life, strength, defense;
    public double attack;

    public Protagonist( String giveName)
    {
	name = giveName;
	life = 125;
	strength = 100;
	defense = 40;
	attack = 0.4;
    }

    public boolean isAlive()
    {
	return life > 0;
    }

    public int getDefense()
    {
	return defense;
    }

    public String getName()
    {
	return name;
    }

    public void lowerHP(int damage) 
    {
        int afterFight = life - damage;
	life = Math.max(0,afterFight);
    }
    public int attack( Monster warrior)
    {
	double damage = (strength * attack) - warrior.defense;
	warrior.lowerHP((int)damage);
	return (int) damage;
    }

    public void specialize()
    {
	defense -= 5;
	attack += .1;
    }

    public void normalize()
    {
	defense = 40;
	attack = 0.4;
    }

} // end class Protagonist
