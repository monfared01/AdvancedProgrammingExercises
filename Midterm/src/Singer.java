
public class Singer extends Human {

	public Singer(String name) {
		super(name);
	}

	public void sing() {
		System.out.println(this.getName() + " sings a song");
	}
}