//Thet Htay Zaw (with Raymond Wu, Kerwin Chen -- team TRK)
//APCS1 pd1
//HW31 -- Ye Olde Role Playing Game, Expanded
//2017-11-13

public class GlassCannon extends Monster {

    //~~~~~~~~~~~Instance Variables~~~~~~~~~~~~~~~
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
    default constructor
    pre:  instance vars are declared
    post: initializes instance vars.
    =============================================*/

    public GlassCannon()
    {
    	_hitPts = 100;
    	_strength = 200;
    	_defense = 10;
    	_attack = .4;
    }

    /*=============================================
    overloaded constructor
    pre:  instance vars are declared
    post: initializes instance vars. _name is set to input String.
    =============================================*/


  /*=============================================
  String about() -- Who am I?
  returns String to describe this type of Protagonist.
  =============================================*/
    public static String about()
    {
      return "GlassCannons attack super hard, but are also super frail. Their special attribute is _strength.";
    } // end about()

} // end Monster > GlassCannon class
