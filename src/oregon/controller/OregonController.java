package oregon.controller;
import java.util.Scanner;

public class OregonController 
{
	private int gameStage = 0;
	private int armySize = 15;
	private boolean quitGame = false;
	private boolean capturedEnemyBase = false;
	private Scanner scanner;
	
	public void start()
	{
		scanner = new Scanner(System.in);
		
		System.out.println("You are the General of your army. Your goal is to capture the enemy base."
				+ " You have an army of 15 men. The game is over when you either capture the enemy base or"
				+ " lose all your men. Try to finish with the most amount of men.");
		
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
			
			if(capturedEnemyBase == true)
			{
				System.out.println("You chose wisely and captured the enemy base!. You Win! Game Over!");
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
				System.out.println("You are marching and come across a pond. Do you:");
				System.out.println("1. Go across the pond?");
				System.out.println("2. Go around the pond?");
				System.out.println("3. Quit the game");
				
				selectedOption = scanner.nextInt();
				
				ApplyConsequencesOfSelection(selectedOption);
				
				break;
			case 2:
				System.out.println("You find a wild wolf. Do you:");
				System.out.println("1. Swing at the wolf with your sword?");
				System.out.println("2. Shoot the wolf with your bow?");
				System.out.println("3. Quit the game");
				
				selectedOption = scanner.nextInt();
				
				ApplyConsequencesOfSelection(selectedOption);
				break;
			case 3: 
				System.out.println("You find some food rations. Do you:");
				System.out.println("1. Eat the rations?");
				System.out.println("2. Throw them out?");
				System.out.println("3. Quit the game");
				
				selectedOption = scanner.nextInt();
				
				ApplyConsequencesOfSelection(selectedOption);
				break;
			case 4:
				System.out.println("You have been marching for a while. Do you:");
				System.out.println("1. Set up camp?");
				System.out.println("2. Keep marching?");
				System.out.println("3. Quit the game");
				
				selectedOption = scanner.nextInt();
				
				ApplyConsequencesOfSelection(selectedOption);
				break;
			case 5:
				System.out.println("You come across the enemy base. Do you:");
				System.out.println("1. Sneak in and attack?");
				System.out.println("2. Fire the canons at the base?");
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
				System.out.println("You loose 3 men due to water sickness");
				armySize -= 5;
			}
			else if(optionSelected == 2)
			{
				System.out.println("You find 2 men on the rim of the pond");
				armySize += 2;
			}
			else
			{
				quitGame = true;
			}
			break;
		case 2:
			if(optionSelected == 1)
			{
				System.out.println("You swing and hit the wolf killing it dead in its tracks.");
				armySize += 0;
			}
			else if(optionSelected == 2)
			{
				System.out.println("The wolf dodges your arrows and takes out 4 of your men.");
				armySize -= 4;
			}
			else
			{
				quitGame = true;
			}
			break;
		case 3: 
			if(optionSelected == 1)
			{
				System.out.println("You eat the rations and 6 of your men die from food poisoning.");
				armySize -= 6;
			}
			else if(optionSelected == 2)
			{
				System.out.println("You throw them out and it grows into 2 human men.");
				armySize += 2;
			}
			else
			{
				quitGame = true;
			}
			break;
		case 4:
			if(optionSelected == 1)
			{
				System.out.println("You set up camp and 10 of your men die from dysentary.");
				armySize -= 10;
			}
			else if(optionSelected == 2)
			{
				System.out.println("You keep marching and find 5 men");
				armySize += 5;
			}
			else
			{
				quitGame = true;
			}
			break;
		case 5:
			if(optionSelected == 1)
			{
				capturedEnemyBase = true;
			}
			else if(optionSelected == 2)
			{
				armySize -= armySize;
			}
			else
			{
				quitGame = true;
			}
			break;
		}
	}
	
	

}
