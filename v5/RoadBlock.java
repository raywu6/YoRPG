// Raymond Wu (with Thet Zaw, Kerwin Chen -- team TRK)
// APCS1 pd1
// HW31 -- Ye Olde Role Playing Game, Expanded
// 2017-11-13

public class RoadBlock extends Monster
{
  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  /*=============================================
    default constructor
    pre:  instance vars are declared
    post: initializes instance vars.
    =============================================*/
  public RoadBlock()
  {
    _hitPts = 10;
    _strength = 130 + (int)( Math.random() * 50 ); // [130, 180)
    _defense = 55;
    _attack = .1;
  }


  /*=============================================
    String about() -- Who am I?
    returns String to describe this type of Protagonist.
    =============================================*/
  public String about()
  {
    return "RoadBlocks can't hit, but RoadBlocks are strong. Their special attribute is _defense.";
  } // end about()

} // end Monster > RoadBlock class
