package tictactoe;
import java.util.Random;
import java.util.Scanner;

public class Playgame 
{
	int playerone = 0;//keeps track of the score
	int playertwo = 0;
		
	boolean playone = false;//will go to true when it is your go
	boolean playtwo = false;
	
	
	Scanner scn = new Scanner(System.in);
	
	Board board = new Board();
	
	
    public void startgame()
	{
		/*Scanner scn = new Scanner(System.in);
		Random random = new Random();
		int randomnumber = random.nextInt(1);
		System.out.println(randomnumber);
		Board board = new Board();*/
		
		Random random = new Random();
		int randomnumber = random.nextInt(1);
		System.out.println(randomnumber);
		String dashes[][] = board.dashes;
		
		if(randomnumber == 0)
		{
			
			playone = true; /* side note: this class may need to be every instance for a game not every user.
			There will only ever be two users but the game generated is new every time and the user variables can be set
			back to 0*/
			System.out.println("You are user one and you are noughts/nIt is your turn");
			System.out.println("Enter your name: ");
			String playone_name = scn.nextLine();
			board.layout();
			System.out.println("Choose between 1, 3, 5 for the x axis: ");
			String coor_x = scn.nextLine();
			int int_coor_x = Integer.parseInt(coor_x);
			System.out.println("Choose 1,2,3 for the y axis: ");
			String coor_y = scn.nextLine();
			int int_coor_y = Integer.parseInt(coor_y);
			
			dashes[int_coor_x][int_coor_y] = "_o_";
			board.layout();
		}
		else
		{
			playtwo = true;
			System.out.println("You are user two/nIt is your turn");
			System.out.println("Enter your name: ");
			String playtwo_name = scn.nextLine();
			board.layout();
			System.out.println("Choose between 1,3,5 for the x axis: ");
			String coor_x = scn.nextLine();
			int int_coor_x = Integer.parseInt(coor_x);
			System.out.println("Choose 1,2,3 for the y axis: ");
			String coor_y = scn.nextLine();
			int int_coor_y = Integer.parseInt(coor_y);
			
			dashes[int_coor_x][int_coor_y] = "_x_";
			board.layout();
			
			
				
			
		}
	}

	
	
	public void restofgame()
	{
		String dashes[][] = board.dashes;
		while(dashes[1][1] == "_x_" && dashes[1][3] == "_x_" && dashes[1][5] == "_x_" != true
				|| dashes[2][1] == "_x_" && dashes[2][3] == "_x_" && dashes[2][5] == "_x_" != true
				|| dashes[3][1] == "_x_" && dashes[3][3] == "_x_" && dashes[3][5] == "_x_" != true
				|| dashes[1][1] == "_x_" && dashes[2][1] == "_x_" && dashes[3][1] == "_x_" != true
				|| dashes[1][3] == "_x_" && dashes[2][3] == "_x_" && dashes[3][3] == "_x_" != true
				|| dashes[1][1] == "_x_" && dashes[2][3] == "_x_" && dashes[3][5] == "_x_" != true
				|| dashes[1][5] == "_x_" && dashes[2][3] == "_x_" && dashes[3][1] == "_x_" != true)
		{
			if(playone == true)
			{
				playone = false;
				playtwo = true;
				System.out.println("It is your turn now player two/n Enter your coordinates for x axis(choose between 1,3,5)");
				String coor_x = scn.nextLine();
				int int_coor_x = Integer.parseInt(coor_x);
				System.out.println("Enter y coordinates(choose 1,2,3)");
				String coor_y = scn.nextLine();
				int int_coor_y = Integer.parseInt(coor_y);
				
				dashes[int_coor_x][int_coor_y] = "_x_";
				board.layout();
			}
			else if(playtwo == true)
			{
				playtwo = false;
				playone = true;
				System.out.println("Player one turn/n Enter your coordinates for x axis(choose between 1,3,5)");
				String coor_x = scn.nextLine();
				int int_coor_x = Integer.parseInt(coor_x);
				System.out.println("Enter y coordinates(choose 1,2,3)");
				String coor_y = scn.nextLine();
				int int_coor_y = Integer.parseInt(coor_y);
				
				dashes[int_coor_x][int_coor_y] = "_o_";
				board.layout();
				
			}
			else
			{
				restofgame();
			}
		}
	}
}
