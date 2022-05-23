package cli;

import java.util.Scanner;

import models.*;

public class Main {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("Main Menu \n 1 : login as a member \n 2 : login as a manager \n 3 : exit");
			int key = in.nextInt();
			if (key == 1) {
				Member tmp = null;
				while (tmp == null) {
					System.out.print("username : ");
					String u = in.next();
					System.out.print("password : ");
					String p = in.next();
					tmp = Member.login(u, p);
					if (tmp == null) {
						System.out.println("invalid username or password");
					}
				}

				while (true) {
					System.out.println("Menu for member : \n 1 . logout \n 2 . view all books");
					int _key = in.nextInt();
					if (_key == 1) {
						break;
					} else if (_key == 2) {
						System.out.println(tmp.viewAllBooks());
					}
				}
			} else if (key == 2) {
				Manager tmp = null;
				while (tmp == null) {
					System.out.print("username : ");
					String u = in.next();
					System.out.print("password : ");
					String p = in.next();
					tmp = Manager.login(u, p);
					if (tmp == null) {
						System.out.println("invalid username or password");
					}
				}

				while (true) {
					System.out.println(
							"Menu for manager : \n 1 . add a book \n 2 . add a member \n 3 . view all members \n 4 . view all books \n 5 . logout");
					int _key = in.nextInt();
					if (_key == 1) {
						System.out.print("name : ");
						String n = in.next();
						System.out.print("author : ");
						String a = in.next();
						System.out.print("index : ");
						String i = in.next();
						System.out.print("qty : ");
						int q = in.nextInt();
						if (!tmp.addBook(new Book(n, a, i, q))) {
							System.out.println("Full");
						}
					} else if (_key == 2) {
						System.out.print("username : ");
						String u = in.next();
						System.out.print("password : ");
						String p = in.next();
						System.out.print("index : ");
						String i = in.next();
						if (!tmp.addMember(new Member(u, p, i))) {
							System.out.println("Full");
						}
					} else if (_key == 3) {
						System.out.println(tmp.viewAllMembers());
					} else if (_key == 4) {
						System.out.println(tmp.viewAllBooks());
					} else if (_key == 5) {
						break;
					}
				}
			} else if (key == 3) {
				break;
			}
		}
	}
}
