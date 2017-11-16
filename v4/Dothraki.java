// Raymond Wu (with Thet Zaw, Kerwin Chen -- team TRK)
// APCS1 pd1
// HW32 -- Ye Olde Role Playing Game, Unchained
// 2017-11-14

public class Dothraki extends Protagonist
{
  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
  private String _name = "Haj Lajak";
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  /*=============================================
    default constructor
    pre:  instance vars are declared
    post: initializes instance vars.
    =============================================*/
  public Dothraki()
  {
    _hitPts = 180;
    _strength = 1000;
    _defense = 40;
    _attack = .4;
  }


  /*=============================================
    overloaded constructor
    pre:  instance vars are declared
    post: initializes instance vars. _name is set to input String.
    =============================================*/
  public Dothraki( String name )
  {
    this();
    _name = name;
  }


  // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
  public String getName() { return _name; }
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  //prepare a Dothraki for a special attack
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
    return "Dothraki warriors are strong. Dothraki warriors can hit. Their special attribute is _strength.";
  } // end about()

} // end Protagonist > Dothraki class
