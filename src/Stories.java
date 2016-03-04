import java.util.Scanner;

public class Stories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
					System.out.println("Should I stop by 'Veggas' or 'The Gig'?");
					System.out.print(">  ");
					Bar1 = keyboard.nextLine();

					if (Bar1.equalsIgnoreCase("Veggas")) 
					{
						System.out.println("  ");
						System.out.println("They're not open!");
					} 
					else if (Bar1.equalsIgnoreCase("The Gig")) 
					{
						System.out.println("  ");
						System.out.println("It's Happy Hour!");
					}
				} 
				else if (Street.equalsIgnoreCase("Locust Street")) 
				{
					System.out.println("Should I stop by 'The Tracks' or 'The Uptowner'?");
					System.out.print(">  ");
					Bar2 = keyboard.nextLine();

					if (Bar2.equalsIgnoreCase("The Tracks")) 
					{
						System.out.println("  ");
						System.out.println("It's too crowded");
					}
				}
					else if (Bar2.equalsIgnoreCase("The Uptowner")) 
					{
						System.out.println("  ");
						System.out.println("The gang's all here!");
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
							System.out.println("  ");
							System.out.println("No pinball?");
						} 
						else if (Bar1.equalsIgnoreCase("Stubbys")) 
						{
							System.out.println("  ");
							System.out.println("There goes my paycheck!");
						}
						System.out.print(">  ");
						System.out.println("Should I have 1, 2 or 3?");
						Drinks = keyboard.nextLine();
						switch (Drinks)
						{
						case "1":
							System.out.println("Staying Sober");
							break;
						case "2":
							System.out.println("Going to be sociable");
							break;
						case "3":
							System.out.println("Looks like you'll be here for awhile");
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

						if (Bar2.equalsIgnoreCase("Major Goolsbys")) 
						{
							System.out.println("  ");
							System.out.println("Too many hipsters!");
						} 
						else if (Bar2.equalsIgnoreCase("Binks")) 
						{
							System.out.println("  ");
							System.out.println("Its a pinball abundanza!");
						}
						System.out.print(">  ");
						System.out.println("Should I have 1, 2 or 3?");
						Drinks = keyboard.nextLine();
						switch (Drinks)
						{
						case "1":
							System.out.println("Staying Sober");
							break;
						case "2":
							System.out.println("Going to be sociable");
							break;
						case "3":
							System.out.println("Looks like you'll be here for awhile");
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
