package game;
import fixtures.Room;

public class RoomManager{
	protected Room startingRoom;
	protected Room[] rooms;
	
	public RoomManager(int counter) {
		rooms = new Room[counter];
	}
	
	public Room getStartingRoom() {
		return this.startingRoom;
	}
	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}
	
	public Room getRoom(int index) {
		return rooms[index];
	}
	
	public Room getRoom(String room) {
		for(int j = 0; j < rooms.length; j++) {
			if(room.toLowerCase() == rooms[j].getName().toLowerCase())
				return getRoom(j);
		}
		return null;
	}
	public Room[] getRooms() {
		return this.rooms;
	}
	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}
	
	public void init() {
	    Room livingRoom = new Room(
	    		"The Living Room",
	    		"main living room",
	    		"This is the main living space for the house. It consists of an L-shaped couch, "
	    		+ "center table, plants by the window, and a 65 in. Tv mounted. There is a small "
	    		+ "look over to the kitchen to the right of the room.");
	    		this.rooms[0] = livingRoom;	
	    		
	    Room kitchen = new Room(
	    		"The Kitchen",
	    		"dinning area",
	    		"The kitchen is east of the living room. It has all new appliances with a black finish. "
	    		+ "The table has a marble top and 4 chairs surround it.");
	    		this.rooms[1] = kitchen;
	    		
	    Room guestRoom = new Room(
	    		"The Guest Room",
				"small guest room",
	    		"The guest room is simple but clean, it has a queen bed with gray nighstands on each "
	    		+ "side of it. The TV sits on a TV stand at the end of the bed. It is adjacent to bathroom and living room.");
	    		this.rooms[2] = guestRoom;
	    		
	    Room bathRoom = new Room(
	    		"The Bathroom",
	    		"main bathroom",
	    		"The bathroom has both a walk-in shower and a bathtub for your choice. "
	    		+ "The counter is also marble to match with the rest of the house. It is between guest room and play room.");
	    		this.rooms[3] = bathRoom;
	    		
	    Room playRoom = new Room(
	    		"The Play Room",
	    		"video game room",
	    		"This is best room in the house. It has every console you can imagine taking all the way back "
	    		+ "to super nintendo. Each console comes with at least ten games to play from. This room has a 75 "
	    		+ "in TV mounted. There is also a big window east of the room. It is the only room that connects to master bedroom.");
	    		this.rooms[4] = playRoom;
	    		
	    Room masterRoom = new Room(
	    		"The Master Room",
	    		"master bedroom",
	    		"This the biggest room in house. Consists of a Calofirnia king bed, a projector with a screent that "
	    		+ "comes down. There is windows north,east, and west. It also has a small living area with two single "
	    		+ "chairs and a table in between.");
	    		this.rooms[5] = masterRoom;
	    			
	    	this.startingRoom = livingRoom;
	    	
	    //Set Map of house and responding exits
	    Room[] livingExits = {guestRoom,kitchen};
	    livingRoom.setExits(livingExits);
	    kitchen.setExits(livingRoom, 3);
	    guestRoom.setExits(bathRoom, 1);
	    guestRoom.setExits(livingRoom, 2);
	    bathRoom.setExits(guestRoom, 3);
	    bathRoom.setExits(playRoom, 1);
	    playRoom.setExits(bathRoom, 3);
	    playRoom.setExits(masterRoom, 0);
	    masterRoom.setExits(playRoom, 2);
	}
}
