package javasessions.noorteck.inheritance;


public class FunDemo {
	public static void main(String[] args) {

		System.out.println("This is Grandpa");
		//The Grandpa Object

		TheGrandpa grandpaObj = new TheGrandpa();

		//grandpaObj.country = "USA";				  // We need to use the setter
		grandpaObj.setCountry("USA");
//		System.out.println(grandpaObj.getCountry());  // add (); display method print country

//		grandpaObj.addNum(2,5); 					  // We are not using the return value
		grandpaObj.display();   // No parameters needed, Delete "Friday"

		grandpaObj.setAge(66);
		System.out.println("Age: "+ grandpaObj.getAge());

		System.out.println("----------------------------");
		System.out.println("This is Dad");
		//TheDad object

		TheDad dadObj = new TheDad("Middle Child");
		//dadObj.age = 12;					// We need to use a setter
		dadObj.setAge(33);					//int theAge = dadObj.setAge(33);  // To save in a variable we need to use getAge and age is not set yet
		System.out.println("Age: "+dadObj.getAge());
		dadObj.setFavNumWho(7);				//int result = dadObj.favNumWho(7);//  Not using result variable // Not favNumWho variable or method is declared in TheDad class. Let's create a private variable with get method
		dadObj.setCountry("Canada");  		//String country = dadObj.setCountry("Canada");  // To save in a variable we need to use getAge and age is not set yet
		System.out.println("Country: "+dadObj.getCountry());		// Add )

		System.out.println("----------------------------");
		System.out.println("This is the Son");

		//TheSon object
		TheSon sonObj = new TheSon("Older Child");

		sonObj.setGrade('A');					// Grade is char type not String "A"

		char resultGrade = sonObj.getGrade();  	// doesn't need parameter and Grade is char type not String so change resultGrade type to char
		System.out.println(resultGrade);    	// Extra )

//		sonObj.addNum(3, 5);

		sonObj.setCity ("Reston"); 				// sonObj.setCity = "Reston"; It is not the right way to set a variable using set method

		System.out.println(sonObj.getCity());   // Missing (

		sonObj.trapZone();

		sonObj.moreTrap();					        //boolean isMeOkay = sonObj.moreTrap("no more please");//
													// Doesn't return anything, we can NOT store in a boolean
													//variable because there is nothing to store.
													//moreTrap method doesn't need parameters to work.
		System.out.println("Yes :)");
	}

}
