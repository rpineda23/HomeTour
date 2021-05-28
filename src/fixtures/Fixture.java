package fixtures;

public class Fixture {
	
	String name, shortDes, longDes;
	
	public Fixture(String name, String shortDes, String longDes) {
		this.name = name;
		this.shortDes = shortDes;
		this.longDes = longDes;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getShortD() {
		return this.shortDes;
	}
	public void setShortD(String shortDes) {
		this.shortDes = shortDes;
	}
	
	public String getLongD() {
			return this.longDes;
	}
	public void setLongD(String longDes) {
			this.longDes = longDes;
	}	
}
