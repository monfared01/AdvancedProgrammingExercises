package models;

public class Member {

	private static int i = 0;

	private static Member[] members = new Member[100];

	public static boolean addMember(Member obj) {
		if (i < 100) {
			members[i] = obj;
			i++;
			return true;
		}
		return false;
	}

	public static Member login(String username, String password) {
		for (Member obj : members) {
			if (obj.username.equals(username) && obj.password.equals(password)) {
				return obj;
			}
		}
		return null;
	}

	public static String viewAll() {
		String tmp = "";
		for (int j = 0; j < i; j++) {
			tmp = tmp + j + " : " + members[j].getUsername() + " - " + members[j].getIndex() + "\n";
		}
		return tmp;
	}

	private String username, password, index;

	public Member(String username, String password, String index) {
		this.username = username;
		this.password = password;
		this.index = index;
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

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String viewAllBooks() {
		return Book.viewAll();
	}
}
