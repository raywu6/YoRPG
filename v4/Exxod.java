// Raymond Wu (with Thet Zaw, Kerwin Chen -- team TRK)
// APCS1 pd1
// HW32 -- Ye Olde Role Playing Game, Unchained
// 2017-11-14

public class Exxod extends Protagonist
{
  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
  private String _name = "Guard";
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  /*=============================================
    default constructor
    pre:  instance vars are declared
    post: initializes instance vars.
    =============================================*/
  public Exxod()
  {
    _hitPts = 125;
    _strength = 10;
    _defense = 1000;
    _attack = .4;
  }


  /*=============================================
    overloaded constructor
    pre:  instance vars are declared
    post: initializes instance vars. _name is set to input String.
    =============================================*/
  public Exxod( String name )
  {
    this();
    _name = name;
  }


  // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
  public String getName() { return _name; }
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  //prepare an Exxod for a special attack
  public void specialize()
  {
    _attack = .75;
    _defense = 20;
  }


  //revert to normal mode
  public void normalize()
  {
    _attack = .4;
    _defense = 40;
  }


  /*=============================================
    String about() -- Who am I?
      returns String to describe this type of Protagonist.
    =============================================*/

  // v4 - no longer static, else cannot override an abstract method
  public String about()
  {
    return "Exxod is the Master of The Guard. Exxod serves as a near impenetrable Gatekeeper. Their special attribute is _defense.";
  } // end about()

} // end Monster > Exxod class
