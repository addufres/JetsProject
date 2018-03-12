## Jets Project

### Skill Distillery Week 2 Homework

Create a fleet of jets with different capabilities. This application will be a menu to use the jets and access information about them.

#### Project Description
This program displays information about jets in the airfield and gives the user the ability to add more to it.
It is an automatic program with everything past the user input handled by learned java techniques.

It uses: 
* Objects that I make my Jet class and subclasses allowing for a cleaner code.
	* The super class is Jet.
	* There are three types of jets available to pick from. These subclasses of Jet are FighterJet, CargoPlane, JetImpl.
	* FighterJet and CargoPlane each utilize interfaces to perform specific methods.
* Switch statements are used to deliminate the users choice and to call the appropriate method.
* Takes input from a user through the use of the Scanner object.
* I use abstract classes i.e. Jet. 
* Call methods with parameters and call methods from objects.

##### Logic of calculations
The only logic needed to figure out this program was some basic math calculations.
1. To convert from miles per hour to Mach you multiply the mph speed by 0.0013
2. To find the time it takes to run out of fuel we took the result of distance / speed.

#### How To Run This Project
Run this through the console in eclipse or the terminal by going to the proper directory and type ```java JetApplication```


#### Lessons Learned

I learned about how to use interfaces and their relationship with the objects that implement them. 
I also struggled to get the counter on the array of jets to sync up with what I wanted. This took some time in debug mode and jumping into and out of methods
to follow the trail of code.
I am able to much more confidently conceptualize a mental model of my program which has proven helpful in sorting through several objects and subclasses and interfaces.  