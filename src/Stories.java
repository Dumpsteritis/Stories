import java.util.Scanner;

public class Stories 
{

	public static void main(String[] args) 
	{
		{
			Scanner keyboard = new Scanner(System.in);

			String Route="";
			String Street="";
			String Bar1=""; 
			String Bar2="";
			String Drinks="";

			System.out.println("WHERE SHOULD I STOP FOR BEER");
			System.out.println("  ");
			System.out.println(
					" You need to stop for a beer on the drive home. Are you planning on driving the 'Interstate' or 'City' streets? ");
			System.out.print("> ");
			Route = keyboard.nextLine();

			if (Route.equalsIgnoreCase("Interstate")) 
			{
				System.out.println("Should I get off on 'North Avenue' or 'Locust Street'. ");
				System.out.print(">  ");
				Street = keyboard.nextLine();

				if (Street.equalsIgnoreCase("North Avenue")) 
				{
					System.out.println("Should I stop by 'Veggas' or 'Gig'?");
					System.out.print(">  ");
					Bar1 = keyboard.nextLine();

					if (Bar1.equalsIgnoreCase("Veggas")) 
					{
						Bars.Veggas();
					} 
					else if (Bar1.equalsIgnoreCase("Gig")) 
					{
						Bars.Gig();
					} 
				} 
				else if (Street.equalsIgnoreCase("Locust Street")) 
				{
					System.out.println("Should I stop by 'Tracks' or 'Uptowner'?");
					System.out.print(">  ");
					Bar2 = keyboard.nextLine();

					if (Bar2.equalsIgnoreCase("Tracks")) 
					{
						Bars.Tracks();
					} 
				}
					else if (Bar2.equalsIgnoreCase("Uptowner")) 
					{
						Bars.Uptowner();
					} 
				} 
			else if (Route.equalsIgnoreCase("City")) 
			{
					System.out.println("Should I take '4th Street' or '6th Street'. ");
					System.out.print(">  ");
					Street = keyboard.nextLine();

					if (Street.equalsIgnoreCase("4th Street")) 
					{
						System.out.println("Should I stop by 'Wolskis' or 'Stubbys'?");
						System.out.print(">  ");
						Bar1 = keyboard.nextLine();

						if (Bar1.equalsIgnoreCase("Wolskis")) 
						{
							Bars.Wolskis();
						} 
						else if (Bar1.equalsIgnoreCase("Stubbys")) 
						{
							Bars.Stubbys();
						} 
						System.out.print(">  ");
						System.out.println("How many should I have?");
						Drinks = keyboard.nextLine();
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
					else if (Street.equalsIgnoreCase("6th Street")) 
					{
						System.out.println("Should I stop by 'Major Goolsbys' or 'Binks'?");
						System.out.print(">  ");
						Bar2 = keyboard.nextLine();

						if (Bar2.equalsIgnoreCase("Goolsbys")) 
						{
							Bars.Goolsbys();
						} 
						else if (Bar2.equalsIgnoreCase("Binks")) 
						{
							Bars.Binks();
						} 
						System.out.print(">  ");
						System.out.println("How many should I have?");
						Drinks = keyboard.nextLine();
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
			}
		}
}