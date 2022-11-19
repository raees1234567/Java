package tictactoe;

public class Driver {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Board board = new Board();
		board.layout();
		Playgame play = new Playgame();
		play.startgame();
		play.restofgame();
		
	}

}
