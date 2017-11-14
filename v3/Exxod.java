// Kerwin Chen (with Thet Zaw, Raymond Wu -- team TRK)
// APCS1 pd1
// HW31 -- Ye Olde Role Playing Game, Expanded
// 2017-11-13

public class Exxod  extends Protagonist
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


  /*=============================================
    String about() -- Who am I?
      returns String to describe this type of Protagonist.
    =============================================*/
  public static String about()
  {
    return "Exxod is the Master of The Guard. Exxod serves as a near impenetrable Gatekeeper. Their special attribute is _defense.";
  } // end about()

} // end Monster > Exxod class
