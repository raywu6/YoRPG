// Kerwin Chen (with Thet Zaw, Raymond Wu -- team TRK)
// APCS1 pd1
// HW31 -- Ye Olde Role Playing Game, Expanded
// 2017-11-13

public class Bakeneko extends Monster
{
  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
  private String _name = "Roar";
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  /*=============================================
    default constructor
    pre:  instance vars are declared
    post: initializes instance vars.
    =============================================*/
  public Bakeneko()
  {
    _hitPts = 1000;
    _strength = (int)(Math.random()*45);
    _defense = 20;
    _attack = 1;
  }


  /*=============================================
    overloaded constructor
    pre:  instance vars are declared
    post: initializes instance vars. _name is set to input String.
    =============================================*/
  public Bakeneko( String name )
  {
    this();
    _name = name;
  }


  /*=============================================
    String about() -- Who am I?
      returns String to describe this type of Protagonist.
    =============================================*/
  public static String about()
  {
    return "Bakenekos are weak, but they have many lives. Their special attribute is _hitPts.";
  } // end about()

} // end Monster > Bakeneko class
