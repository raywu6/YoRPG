# YoRPG-TRK
Simulates monster encounters of a wandering adventurer. - tbm <br>
Developed by Kerwin Chen, Raymond Wu, and Thet Zaw, with the help of tbm & Clyde "Thluffy" Sinclair

# YoRPG

Driver of all classes written in this repository. Used to run the RPG. <br>

## Character
Superclass for all entities (Protagonist, Monster) in the RPG.

### Protagonist
Defines traits and actions of a regular Protagonist. <br>
Superclass for all types of Protagonist (Dothraki, Exxod, Vanguard).

#### Dothraki :monkey:
A type of Protagonist. <br>
Defines traits of a Dothraki protagonist. <br>
Dothraki warriors are strong. Dothraki warriors can hit. Their special attribute is &#95;strength.

#### Exxod :guardsman:
A type of Protagonist. <br>
Defines traits of an Exxod protagonist. <br>
Exxod is the Master of The Guard. Exxod serves as a near impenetrable Gatekeeper. Their special attribute is &#95;defense.

#### Vanguard :muscle:
A type of Protagonist. <br>
Defines traits of a Vanguard protagonist. <br>
Vanguards are bulky. Vanguards take a while to fall. Their special attribute is &#95;hitPts.


### Monster
Defines traits of a regular Monster. <br>
Superclass for all types of Monster (Bakeneko, GlassCannon, RoadBlock).

#### Bakeneko :cat:
A type of Monster. <br>
Defines traits of a Bekeneko monster. <br>
Bakenekos are weak, but they have many lives. Their special attribute is &#95;hitPts.

#### GlassCannon :tada:
A type of Monster. <br>
Defines traits of a GlassCannon monster. <br>
GlassCannons attack super hard, but are also super frail. Their special attribute is &#95;strength.

#### RoadBlock :construction:
A type of Monster. <br>
Defines traits of a RoadBlock monster. <br>
RoadBlocks can't hit, but RoadBlocks are strong. Their special attribute is &#95;defense.

## Functionality Incorporation
###Feature Additions
- [ ] incorporation of the Monster subclasses
- [ ] incorporation of a Poison concept
	- [ ] When the character's life is under 150 HP, you can choose to drink a mysterious liquid, <br>
		which may kill them, or heal them
			= [ ] like hitting in blackjack with a hand of 17, this is high risk, high reward
