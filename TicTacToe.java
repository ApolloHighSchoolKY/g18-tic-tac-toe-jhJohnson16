//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		int rows = 2;
		int cols = 2;
		int[][] array = new int[rows][cols];

		array[0][0] = "X";
		array[0][1] = "O";
		array[0][2] = "X";
		array[1][0] = "O";
		array[1][1] = "X";
		array[1][2] = "O";
		array[2][0] = "X";
		array[2][1] = "O";
		array[2][2] = "X";

	}

	public TicTacToe(String game)
	{
		for(int r = 0; r<array.length; r++){
			for(int c = 0; c<array.length; c++)
		}




	}

	public String getWinner()
	{
		String victor = "";
		if(mat[0][0]==mat[0][1] && mat[0][1] == mat[0][2]){
			return ""+ mat[0][0]+ " won";
		}
		else if(mat[1][0]==mat[1][1] && mat[1][1] == mat[1][2]){
			return ""+ mat[1][0]+ " won";
		}
		else if(mat[2][0]==mat[2][1] && mat[2][1] == mat[2][2]){
			return ""+ mat[2][0]+ " won";
		}
		else if(mat[0][0]==mat[1][0] && mat[1][0] == mat[2][0]){
			return ""+ mat[0][0]+ " won";
		}
		else if(mat[0][1]==mat[1][1] && mat[1][1] == mat[2][1]){
			return ""+ mat[0][1]+ " won";
		}
		else if(mat[0][2]==mat[1][2] && mat[1][2] == mat[2][2]){
			return ""+ mat[0][2]+ " won";
		}
		else if(mat[0][0]==mat[1][1] && mat[1][1] == mat[2][2]){
			return ""+ mat[0][0]+ " won";
		}
		else if(mat[2][2]==mat[1][1] && mat[1][1] == mat[0][0]){
			return ""+ mat[2][2]+ " won";
		}
		else{
			return "cat tie!";
		}
		
	
		return "";
	}

	public String toString()
	{
		String output="";






		return output+"\n\n";
	}
}