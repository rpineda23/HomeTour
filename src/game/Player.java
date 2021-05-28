package game;
import fixtures.Room;

public class Player{
	protected Room currentRoom;
	
	public Room getCurrent() {
		return this.currentRoom;
	}
	
	public void setCurrent(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
}
