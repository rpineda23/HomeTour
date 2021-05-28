package game;
import fixtures.Room;
import java.util.Scanner;

public class Main {

	protected static RoomManager manager = new RoomManager(6);
	protected static boolean done = false;
	
	public static void main(String[] args) {
		// Initialize Player
		Player player = new Player();
		// Initialize Rooms
		manager.init();
		// Set Starting Room
		player.setCurrent(manager.getStartingRoom());
		
		System.out.println("Welcome to your house tour...");
		System.out.println("To use tour guide for the house please use the term 'go' & ");
		System.out.println("direction you would like to go, i.e. 'go east'. If you would like to end ");
		System.out.println("guide please enter 'quit now'. Enjoy the tour!");
		
		while(!done) {
			printRoom(player);
			String[] input = collectInput();
			parse(input, player);
		}
		
		if(done)
			System.out.println("Thank you for using Tour Guide. Goodbye.");	
	}

	private static void printRoom(Player player) {
		System.out.println("YOU ARE IN...");
		System.out.println("Room: " + player.getCurrent().getName());
		System.out.println("Short Des: " + player.getCurrent().getShortD());
		System.out.println("Long Des: "+ player.getCurrent().getLongD());
	}
	
	private static String[] collectInput() {
		String[] words;
		String input;
		Scanner scan = new Scanner(System.in);
		input = scan.nextLine();
		words = input.split(" ");
	
		return words;
	}

	private static void parse(String[] input, Player player) {
		String com = input[0].toLowerCase().intern();
		String dir = input[1].toLowerCase().intern();
	
		if(com == "go") {
			System.out.println("You are moving... " + dir);
			Room move = player.getCurrent().getExit(dir);
			player.setCurrent(move);
		}
		else if(com == "quit") {
			done = true;
		}
	}
}
