//Thet Htay Zaw (with Raymond Wu, Kerwin Chen -- Team TRK)
//APCS1 pd1
//HW31 -- Ye Olde Role Playing Game, Expanded
//2017-11-13

public class Vanguard extends Protagonist {

    //~~~~~~~ INSTANCE VARIABLES~~~~~~~~~~
    private String _name = "Cucumber Pencil";
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
    default constructor
    pre:  instance vars are declared
    post: initializes instance vars.
    =============================================*/

    public Vanguard() {

	_hitPts = 500;
	_strength = 100;
	_defense = 40;
	_attack = .4;

    }

    /*=============================================
    overloaded constructor
    pre:  instance vars are declared
    post: initializes instance vars. _name is set to input String.
    =============================================*/

    public Vanguard(String name) {
	this();
	_name = name;
    }


    /*=============================================
    String about() -- Who am I?
      returns String to describe this type of Protagonist.
    =============================================*/

    public static String about() {

	return "Vanguards are bulky. Vanguards take a while to fall. Their special attribute is _hitPts";

    } //end about()

}//end Protagonist > Vanguard class
