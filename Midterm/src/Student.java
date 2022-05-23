
public class Student extends Human {
	private String ID;

	public Student(String name, String ID) {
		super(name);
		setID(ID);
	}

	public String getID() {
		return this.ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

}