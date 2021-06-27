package com.bridgelabz.tictactoe;
import java.util.Scanner;
public class TicTacToe {
	public static void main(String[] args) {
		System.out.println("Welcome to tic tac toe");
	}
	public static char[] createBoard() {
		char[] board =new char[10];
		for(int i = 1; i <board.length; i++) {
						board[i]= ' ';
					}
				return board;
			}
			char[] board = createBoard();
			 static char chooseOption() {
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

