import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class MazeOne {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		int HEIGHT, LENGTH;
		//Get file name from keyboard
		File importFileName = new File("MazeOne.txt");
		Scanner inFile = new Scanner(importFileName);
		
		
		int height = inFile.nextInt();
		int length = inFile.nextInt();
		HEIGHT = height-1;
		LENGTH = length-1;
		String [][] MazeArray = new String[HEIGHT][LENGTH];
		String [][] Start = new String[][]{{".",".","."},{".","S","."},{".",".","."}};
		String [][] Block = new String[][]{{"X","X","X"},{"X","X","X"},{"X","X","X"}};
		String [][] Finish = new String[][]{{".",".","."},{".","F","."},{".",".","."}};
		String [][] Normal = new String[][]{{".",".","."},{".",".","."},{".",".","."}};
		
		for(int i = 0; i < HEIGHT; i++)
		{
			for(int j = 0; j < LENGTH; j++)
			{
				MazeArray[i][j] = ".";
			}
		}
		
		if(inFile.hasNextLine())
		{
			int X = inFile.nextInt();
			int Y = inFile.nextInt();
			MazeArray[Y][X] = "S";
		}
		if(inFile.hasNextLine())
		{
			int X = inFile.nextInt();
			int Y = inFile.nextInt();
			MazeArray[Y][X] = "F";
		}
		
		while(inFile.hasNextLine())
		{
			while(inFile.hasNextInt()){
				int X = inFile.nextInt();
				int Y = inFile.nextInt();
				MazeArray[Y][X] = "X";
				
			}
		}

		for (String[] row : MazeArray)
		{
			System.out.println(Arrays.toString(row));;
		}
		
	}

}
