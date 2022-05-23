package models;

public class Book {

	private static int i = 0;
	
	private static Book[] books = new Book[100];

	public static boolean addBook(Book obj) {
		if (i < 100) {
			books[i] = obj;
			i++;
			return true;
		}
		return false;
	}
	
	public static String viewAll() {
		String tmp = "";
		for (int j = 0; j < i; j++) {
			tmp += j + " : " + books[j].getName() + " - " + books[j].getIndex() + " - " + books[j].getAuthor() + " - " + books[j].getQty() + "\n"; 
		}
		return tmp;
	}

	private String name, author, index;
	private int qty;

	public Book(String name, String author, String index, int qty) {
		this.name = name;
		this.author = author;
		this.index = index;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

}
