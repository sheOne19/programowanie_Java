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
				System.out.println("dodoaj ksi¹¿kê");
				biblioteka.AddBook();
				break;
			case 2:
				System.out.println("wybrano 2");
				break;
			case 3:
				System.out.println("wybrano 3");
				break;
			case 4:
				System.out.println("wybrano 4");
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
		System.out.println("1: Zrob cos");
		System.out.println("2: Zrob cos");
		System.out.println("3: Zrob cos");
		System.out.println("4: Zrob cos");
		System.out.println("5: Exit");
		}

}
