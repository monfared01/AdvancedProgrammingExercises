import java.util.ArrayList;

public class Human {
	private String name;
	private ArrayList<Singer> faves;

	public Human(String name) {
		this.setName(name);
		faves = new ArrayList<Singer>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void like(Singer e) {
		this.faves.add(e);
	}

	/***/
	public ArrayList<Singer> getFaves() {
		return faves;
	}
}