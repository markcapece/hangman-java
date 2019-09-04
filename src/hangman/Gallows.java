package hangman;

abstract class Gallows {
	
	// Print number of misses as hanged man
	public static void current_gallow(int misses) {	
		switch(misses) {
		case 0:
			System.out.println("   -------- ");
			System.out.println("   |      | ");
			System.out.println("   |        ");
			System.out.println("   |        ");
			System.out.println("   |        ");
			System.out.println("   |        ");
			System.out.println("------      ");
			break;
		case 1:
			System.out.println("   -------- ");
			System.out.println("   |      | ");
			System.out.println("   |      O ");
			System.out.println("   |        ");
			System.out.println("   |        ");
			System.out.println("   |        ");
			System.out.println("------      ");
			break;
		case 2:
			System.out.println("   -------- ");
			System.out.println("   |      | ");
			System.out.println("   |      O ");
			System.out.println("   |      | ");
			System.out.println("   |        ");
			System.out.println("   |        ");
			System.out.println("------      ");
			break;
		case 3:
			System.out.println("   -------- ");
			System.out.println("   |      | ");
			System.out.println("   |      O/");
			System.out.println("   |      | ");
			System.out.println("   |        ");
			System.out.println("   |        ");
			System.out.println("------      ");
			break;
		case 4:
			System.out.println("   -------- ");
			System.out.println("   |      | ");
			System.out.println("   |     \\O/");
			System.out.println("   |      | ");
			System.out.println("   |        ");
			System.out.println("   |        ");
			System.out.println("------      ");
			break;
		case 5:
			System.out.println("   -------- ");
			System.out.println("   |      | ");
			System.out.println("   |     \\O/");
			System.out.println("   |      | ");
			System.out.println("   |     /  ");
			System.out.println("   |        ");
			System.out.println("------      ");
			break;
		case 6:
			System.out.println("   -------- ");
			System.out.println("   |      | ");
			System.out.println("   |     \\O/");
			System.out.println("   |      | ");
			System.out.println("   |     / \\");
			System.out.println("   |        ");
			System.out.println("------      ");
			break;
		default:
			System.out.println("Error!");
		}
		
	}
}
