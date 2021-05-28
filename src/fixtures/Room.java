package fixtures;

public class Room extends Fixture{
	public Room[] exits;
	
	public Room(String name, String shortDes, String longDes) {
		super(name, shortDes, longDes);
		this.exits = new Room[4];
	}
	
	public Room[] getExits() {
		return this.exits;	
	}
	
	public Room[] getExit(Room[] exits) {
		return exits;
	}
	
	public Room getExit(String dir) {
		int i = 0;
		dir = dir.toLowerCase();
		switch(dir) {
		case "north":
			i = 0;
			break;
		case "east":
			i = 1;
			break;
		case "south":
			i = 2;
			break;
		case "west":
			i = 3;
			break;
		}
		if(i >= this.exits.length || this.exits[i] == null) {
			System.out.println("THIS IS A WALL. TRY AGAIN...");
			return this;
		}
		return this.exits[i];	
	}
	
	public void setExits(Room[] exits) {
		this.exits = exits;
	}
	
	public void setExits(Room exit, int index) {
		this.exits[index] = exit;
	}
}
