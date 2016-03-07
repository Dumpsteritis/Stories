
public class Bars {

	public static void Veggas()
	{
	System.out.print("Its Happy Hour! \n");
	System.out.print("> ");
	}

	public static void Gig()
	{	
	System.out.print("Going to need change for the pinball machine! \n");
	System.out.print("> ");
	}		

	public static void Tracks()
	{	
		System.out.print("It's looking pretty dead! \n");
		System.out.print("> ");
	}

	public static void Uptowner()
	{	
		System.out.print("The gang's all here! \n");
		System.out.print("> ");
	}

	public static void Wolskis()
	{	
		System.out.print("No pinball? \n");
		System.out.print("> ");
	}

	public static void Stubbys()
	{	
		System.out.print("Great, a $4.00 tap of Schlitz what a travesty! \n");
		System.out.print("> ");
	}

	public static void Goolsbys()
	{	
		System.out.print("Too many hipsters! \n");
		System.out.print("> ");
	} 

	public static void Finks()
	{	
		System.out.print("Its a pinball abundanza! \n");
		System.out.print("> ");
	}

	public static void noDrinks(String Drinks)
	{
		switch (Drinks)
		{
		case "1":
			System.out.print("Just a quick in and out! \n");
			break;
		case "2":
			System.out.print("Why not be sociable? \n");
			break;
		case "3":
			System.out.print("Is that the same woman I saw as when I got here? \n");
			break;
		case "4":
			System.out.print("Its party time! \n");
			break;
		case "5":
			System.out.print("I'm going to feel it in the morning! \n");
			break;
		case "6":
			System.out.print("Better call the wife! \n");
			break;
		case "7":
			System.out.print("Can I leave my car where its parked? \n");
			break;
		default:
			System.out.print("Maybe I better just go home and work on my assignments! \n");
			break;
		}
	}
}
