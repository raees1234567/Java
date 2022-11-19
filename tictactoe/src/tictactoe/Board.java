package tictactoe;

public class Board 
{
	String[][] dashes = {{"1  ", " 3", "   ", "4"},
	  {"1","__", "|", "__", "|", "__"},
      {"2","__","|", "__", "|", "__"},
      {"3","__", "|", "__", "|", "__"}, 
      {"1  ", " 3", "   ",  "5"}};
	
	public void layout()
	{
		/*String [][]dashes  = {{"1  ", " 3", "   ", "4"},
							  {"1","__", "|", "__", "|", "__"},
				              {"2","__","|", "__", "|", "__"},
		                      {"3","__", "|", "__", "|", "__"}, 
		                      {"1  ", " 3", "   ",  "5"}};*/
		
		
		for(String[] row: dashes)
		{
			System.out.println("");
			for(String c: row)
			{
				System.out.print(c);
			}
		}
		
				
	}
}
