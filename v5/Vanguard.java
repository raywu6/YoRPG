//Raymond Wu (with Thet Zaw, Kerwin Chen -- Team TRK)
//APCS1 pd1
//HW32 -- Ye Olde Role Playing Game, Unchained
//2017-11-14

public class Vanguard extends Protagonist {

  //~~~~~~~ INSTANCE VARIABLES~~~~~~~~~~
  private String _name = "Cucumber Pencil";
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  /*=============================================
  default constructor
  pre:  instance vars are declared
  post: initializes instance vars.
  =============================================*/

  public Vanguard()
  {
  	_hitPts = 500;
  	_strength = 120;
  	_defense = 40;
  	_attack = .5;
  }

  /*=============================================
  overloaded constructor
  pre:  instance vars are declared
  post: initializes instance vars. _name is set to input String.
  =============================================*/

  public Vanguard(String name)
  {
  	this();
  	_name = name;
  }


  // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
  public String getName() { return _name; }
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  //prepare a Vanguard for a special attack
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
     return "Vanguards are bulky. Vanguards take a while to fall. Their special attribute is _hitPts";
  } //end about()

}//end Protagonist > Vanguard class
