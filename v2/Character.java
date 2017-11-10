// Raymond Wu (collaborators: Thet Zaw, Kerwin Chen -- team TRK)
// APCS1 pd1
// HW30 -- Ye Olde Role Playing Game, Improved
// 2017-11-10

public class Character
{
	public int life, strength, defense;
	public double attack;

	public boolean isAlive()
	{
		return life > 0;
	}

	public int getDefense()
	{
		return defense;
	}

	public void lowerHP( int decreaseAmt)
	{
		life -= decreaseAmt;
	}

	public int attack( Character opponent)
	{
		int damage = (int) ( (strength * attack) - opponent.getDefense() );

		damage = Math.max( 0, damage);
		opponent.lowerHP( damage);

		return damage;
	}
	
} // end Character SUPERCLASS
