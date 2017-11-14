// Raymond Wu (with Thet Zaw, Kerwin Chen -- team TRK)
// APCS1 pd1
// HW31 -- Ye Olde Role Playing Game, Expanded
// 2017-11-13

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


  /*=============================================
    String about() -- Who am I?
      returns String to describe this type of Protagonist.
    =============================================*/
  public static String about()
  {
    return "Dothraki warriors are strong. Dothraki warriors can hit. Their special attribute is _strength.";
  } // end about()

} // end Protagonist > Dothraki class
