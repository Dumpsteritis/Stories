
public class Bars {

	public static void Veggas()
	{
	System.out.print("They're not open! \n");
	}

	public static void Gig()
	{	
	System.out.print("It's Happy Hour! \n");
	}		

	public static void Tracks()
	{	
		System.out.print("It's looking pretty dead! \n");
	}

	public static void Uptowner()
	{	
		System.out.print("The gang's all here! \n");
	}

	public static void Wolskis()
	{	
		System.out.print("No pinball? \n");
	}

	public static void Stubbys()
	{	
		System.out.print("Great, a $4.00 tap of Schlitz what a travesty! \n");
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
		System.out.print("Why not be sociable! \n");
		break;
	case "3":
		System.out.print("Is that woman the same one as when I got here? \n");
		break;
	case "4":
		System.out.print("Its party time! \n");
		break;
	case "5":
		System.out.print("I'm not getting out of here alive! \n");
		break;
	default:
		System.out.print("Maybe I better just go home and work on my assignments! \n");
		break;
	}
	}
}
