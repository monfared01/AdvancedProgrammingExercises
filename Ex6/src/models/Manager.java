package models;

public class Manager {

	private static Manager[] managers = { new Manager("student", "123") };

	public static Manager login(String username, String password) {
		for (Manager obj : managers) {
			if (obj.username.equals(username) && obj.password.equals(password)) {
				return obj;
			}
		}
		return null;
	}

	private String username, password;

	public Manager(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String viewAllBooks() {
		return Book.viewAll();
	}
	public String viewAllMembers() {
		return Member.viewAll();
	}
	
	public boolean addMember(Member obj) {
		return Member.addMember(obj);
	}
	public boolean addBook(Book obj) {
		return Book.addBook(obj);
	}
	
}
