package hangman;

import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
		// Welcome and initialize game
		System.out.println("Welcome to Hangman");
		System.out.println("******************");
		Game game = new Game();
		
		// Game loop
		while(game.game_state == 1) {
			System.out.println(game.return_hidden() + "\n");
			Gallows.current_gallow(game.number_of_misses);
			System.out.println("\n" + game.guessed_letters);
			game.get_guess();
		}
		
		// Terminate game as win or loss
		if (game.won == 1) {
			System.out.println("You won! The word is " + game.return_correct());
		} else {
			System.out.println("You lost! The word is " + game.return_correct());
		}
		game.record_score();
		
	}

}
