
public class Bars {
	public static void Veggas()
	{
	System.out.println("  ");
	System.out.println("They're not open!");
	}
	public static void Gig()
	{
	System.out.println("  ");
	System.out.println("It's Happy Hour!");
	}		
	public static void Tracks()
	{
		System.out.println("  ");
		System.out.println("It's too crowded");
	}
	public static void Uptowner()
	{
		System.out.println("  ");
		System.out.println("The gang's all here!");
	}
	public static void Wolskis()
	{
		System.out.println("  ");
		System.out.println("No pinball?");
	}
	public static void Stubbys()
	{
		System.out.println("  ");
		System.out.println("There goes my paycheck!");
	}
	public static void Goolsbys()
	{
		System.out.println("  ");
		System.out.println("Too many hipsters!");
	} 
	public static void Finks()
	{
		System.out.println("  ");
		System.out.println("Its a pinball abundanza!");
	}
	public static void noDrinks(String Drinks)
	{
	switch (Drinks)
	{
	case "1":
		System.out.println("Just a quick in and out!");
		break;
	case "2":
		System.out.println("Why not be sociable?");
		break;
	case "3":
		System.out.println("Looks like I'll be here for awhile");
		break;
	case "4":
		System.out.println("Its party time!");
		break;
	case "5":
		System.out.println("Let's call it a day!");
		break;
	default:
		System.out.println("Maybe I better go home and work on my assignments");
		break;
	}
	}
}
