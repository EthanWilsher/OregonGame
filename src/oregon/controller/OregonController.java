package oregon.controller;
import java.util.Scanner;

public class OregonController 
{
	private int gameStage = 0;
	private int armySize = 15;
	private boolean quitGame = false;
	private Scanner scanner;
	
	public void start()
	{
		scanner = new Scanner(System.in);
		
		System.out.println("You are the General of your army. Your goal is to capture the enemy base."
				+ " You have an army of 15 men. The game is over when you either capture the enemy base or"
				+ " lose all your men");
		
		do
		{
			gameStage++;
			
			ProgressStory();
			
			PrintGameStatus();
			
			if(armySize <= 0 )
			{
				System.out.println("Your army has been wiped out. You lose! Game Over!");
				quitGame = true;
			}
			
		}while(quitGame == false);
		
		System.out.println("Thanks for playing! Goodbye");
		
	}
	
	private void PrintGameStatus()
	{
		System.out.println("After Stage" + gameStage + "of the game your army's size is: " + armySize);
	}
	
	private void ProgressStory()
	{
		int selectedOption = 0;
		
		switch(gameStage)
		{
			case 1: 
				System.out.println("You are marching and come across a lake. Do you:");
				System.out.println("1. Go across the lake?");
				System.out.println("2. Go around the lake?");
				System.out.println("3. Quit the game");
				
				selectedOption = scanner.nextInt();
				
				ApplyConsequencesOfSelection(selectedOption);
				
				break;
			case 2:
				System.out.println("You are marching and come across a lake. Do you:");
				System.out.println("1. Go across the lake?");
				System.out.println("2. Go around the lake?");
				System.out.println("3. Quit the game");
				
				selectedOption = scanner.nextInt();
				
				ApplyConsequencesOfSelection(selectedOption);
				break;
			case 3: 
				System.out.println("You are marching and come across a lake. Do you:");
				System.out.println("1. Go across the lake?");
				System.out.println("2. Go around the lake?");
				System.out.println("3. Quit the game");
				
				selectedOption = scanner.nextInt();
				
				ApplyConsequencesOfSelection(selectedOption);
				break;
			case 4:
				System.out.println("You are marching and come across a lake. Do you:");
				System.out.println("1. Go across the lake?");
				System.out.println("2. Go around the lake?");
				System.out.println("3. Quit the game");
				
				selectedOption = scanner.nextInt();
				
				ApplyConsequencesOfSelection(selectedOption);
				break;
			case 5: 
				System.out.println("You are marching and come across a lake. Do you:");
				System.out.println("1. Go across the lake?");
				System.out.println("2. Go around the lake?");
				System.out.println("3. Quit the game");
				
				selectedOption = scanner.nextInt();
				
				ApplyConsequencesOfSelection(selectedOption);
				break;
			case 6:
				System.out.println("You are marching and come across a lake. Do you:");
				System.out.println("1. Go across the lake?");
				System.out.println("2. Go around the lake?");
				System.out.println("3. Quit the game");
				
				selectedOption = scanner.nextInt();
				
				ApplyConsequencesOfSelection(selectedOption);
				break;
				
			
		}
	
	}
	
	private void ApplyConsequencesOfSelection(int optionSelected)
	{
		switch(gameStage)
		{
		case 1: 
			if(optionSelected == 1)
			{
				armySize -= 2;
			}
			else if(optionSelected == 2)
			{
				
			}
			else
			{
				quitGame = true;
			}
			break;
		case 2:
			if(optionSelected == 1)
			{
				
			}
			else if(optionSelected == 2)
			{
				
			}
			else
			{
				quitGame = true;
			}
			break;
		case 3: 
			if(optionSelected == 1)
			{
				
			}
			else if(optionSelected == 2)
			{
				
			}
			else
			{
				quitGame = true;
			}
			break;
		case 4:
			if(optionSelected == 1)
			{
				
			}
			else if(optionSelected == 2)
			{
				
			}
			else
			{
				quitGame = true;
			}
			break;
		case 5: 
			if(optionSelected == 1)
			{
				
			}
			else if(optionSelected == 2)
			{
				
			}
			else
			{
				quitGame = true;
			}
			break;
		case 6:
			if(optionSelected == 1)
			{
				
			}
			else if(optionSelected == 2)
			{
				
			}
			else
			{
				quitGame = true;
			}
			break;
		}
	}
	
	

}
