package oregon.controller;

public class OregonController 
{
	private int gameStage = 0;
	
	public void start()
	{
		int option = 0;
		
		System.out.println("You are the General of your army. Your goal is to capture the enemy base."
				+ " You have an army of 15 men. The game is over when you either capture the enemy base or"
				+ " lose all your men");
		
		do
		{
			gameStage++;
			
			ProgressStory();
			
		}while(option != 3);
		
	}
	
	private void ProgressStory()
	{
		switch(gameStage)
		{
			case 1: 
				System.out.println("You are marching and come across a lake. Do you:");
				System.out.println("1. Go across the lake?");
				System.out.println("2. Go around the lake?");
				System.out.println("3. Quit the game");
				break;
			case 2:
				// output story and options
				break;
			case 3: 
				// output story and options
				break;
			case 4:
				// output story and options
				break;
			case 5: 
				// output story and options
				break;
			case 6:
				// output story and options
				break;
				
			
		}
	
	}
	
	

}
