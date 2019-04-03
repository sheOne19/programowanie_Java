package ap.projekt.lib;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Biblioteka biblioteka = new Biblioteka();
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		boolean exit = false;
		while (!exit) {
			menu();
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Wpisz nazwe ksi¹¿ki");
				scanner.nextLine();
				String nazwa =scanner.nextLine();
				System.out.println("Wpisz iloœæ stroñ");
				int count = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Wpisz imiê autora");
				String nameauthor = scanner.nextLine();
				biblioteka.AddBook(nazwa, count, nameauthor);
				break;
			
			case 2:
				biblioteka.GetBooks();
				break;
			
			case 3:
				System.out.println("Wpisz imiê u¿ytkownika");
				scanner.nextLine();
				String name = scanner.nextLine();
				System.out.println("Wpisz nazwisko u¿ytkownika");
				String surname = scanner.nextLine();
				System.out.println("Wpisz wiek u¿ytkownika");
				int age = scanner.nextInt();
				break;
			
			case 4:
				biblioteka.GetUsers();
				break;
			
			case 5:
				System.out.println("wybrano 5, exit");
				exit = true;
				break;
			
			default:
				System.out.println("wybrano nieznany numer");
			}
			
		}

	}

	private static void menu() {
		System.out.println("Witamy w bibliotece");
		System.out.println("Wybierz:");
		System.out.println("1: Dodaj ksiazek");
		System.out.println("2: Wyœwietl ksiazki");
		System.out.println("3: Dodaj u¿ytkownika");
		System.out.println("4: Wyœwietl u¿ytkowników");
		System.out.println("5: Exit");
		}

}
