/**********************************************
 * class Protagonist -- the protagonist of Ye Olde RPG
 * ---
 * Clyde "Thluffy" Sinclair
 **********************************************/

public abstract class Protagonist extends Character
{
  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
  private String _name = "J. Doe";
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  /*=============================================
    default constructor
    pre:  instance vars are declared
    post: initializes instance vars.
    =============================================*/
  public Protagonist()
  {
    _hitPts = 125;
    _strength = 100;
    _defense = 40;
    _attack = .4;
  }


  /*=============================================
    overloaded constructor
    pre:  instance vars are declared
    post: initializes instance vars. _name is set to input String.
    =============================================*/
  public Protagonist( String name ) {
    this();
    _name = name;
  }


  // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
  public String getName() { return _name; }
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  /*=============================================
    int attack(Monster) -- simulates attack on instance of class Monster
    pre:  Input not null
    post: Calculates damage to be inflicted, flooring at 0.
    Calls opponent's lowerHP() method to inflict damage.
    Returns damage dealt.
    =============================================*/
  public int attack( Monster opponent )
  {

    int damage = (int)( (_strength * _attack) - opponent.getDefense() );
    //System.out.println( "\t\t**DIAG** damage: " + damage );

    if ( damage < 0 )
	    damage = 0;

    opponent.lowerHP( damage );

    return damage;
  }//end attack




   /*==============================
    void vulnerary() --  Taking a chance to either restore _hitPts or end up harming yourself
    pre:
    post: Checks whether or not you are below 150 _hitPts
    Then takes a random chance of you either healing or taking 150 damage if you choose to accept
    ======================= */
    public String vulnerary()
    {
      int luck = 1 + (int) (Math.random() * 10);

      if (luck > 5) {
        _hitPts = _hitPts + 150;
        return "+150 HP! Lucky you!\n";
  		}
      else
      {
        _hitPts = _hitPts - 150;
        return "-150 HP! Oof.\n";
      }
    }

  //prepare a Protagonist for a special attack
  public abstract void specialize();


  //revert to normal mode
  public abstract void normalize();


  public abstract String about();

}//end class Protagonist
