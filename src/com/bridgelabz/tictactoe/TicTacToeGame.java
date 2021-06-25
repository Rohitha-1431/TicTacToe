package com.bridgelabz.tictactoe;
import java.util.Scanner;
public class TicTacToeGame {
	public static char chooseOption() {
		char computersSymbol=0;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Give an option 'o' or 'x':");
		char option = scanner.next().charAt(0);
		scanner.close();
		if (option == 'o' ) {
			computersSymbol='x';	
		}else if (option == 'x' ) {
			computersSymbol ='o';
		}else {
			System.out.println("invalid option:");
		}
	System.out.println("Players option:"+ option+ "computers option is:"+computersSymbol);
		return option;
	}
}
