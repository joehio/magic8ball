package magic8ball;

public class rng 
{
public void shake()
	{
	
	System.out.println("               _______________            ");
	System.out.println("              /               \\          ");
	System.out.println("             /                 \\         ");
	System.out.println("            /                   \\        ");
	System.out.println("           /      _____          \\       ");
	System.out.println("          |      |     |          |       ");
	System.out.println("          |      |     |          |       ");
	System.out.println("          |      |_____|          |       ");
	System.out.println("          |      |     |          |       ");
	System.out.println("          |      |     |          |       ");
	System.out.println("          |      |_____|          |       ");
	System.out.println("          \\                      /       ");
	System.out.println("           \\                    /        ");
	System.out.println("            \\                  /         ");
	System.out.println("             \\________________/          ");
	
	double randomNumber = Math.random();
	randomNumber = randomNumber * 6;
	randomNumber = randomNumber + 1;
	int randomInt = (int) randomNumber;
		if (randomInt == 1)
		{
		System.out.println("yes");
		}
		else if (randomInt == 2)
		{
		System.out.println("no");
		}
		else if (randomInt == 3)
		{
		System.out.println("So it is written");
		}
		else if (randomInt == 4)
		{
		System.out.println("It shall never pass");
		}
		else if (randomInt == 5)
		{
		System.out.println("It is uncertain");
		}
		else if (randomInt == 6)
		{
		System.out.println("It is certain");
		}
		else
		{
		System.out.println("try again");
		}
	}
	
/*String fortune;
public String result()
	{
	switch (this.decision)
		{
		case 1: fortune = "Yes";
		case 2: fortune = "no";
		case 3: fortune = "So it is written";
		case 4: fortune = "It shall never pass";
		case 5: fortune = "It is uncertain";
		case 6: fortune = "It is certain";
		default: fortune = "try again";
		}
	System.out.println(fortune);
	return fortune;
	}*/

	
	
}


