package com.ap.vladyslav;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		double a, b, pole;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Program oblicza pole prostok¹ta.");
		System.out.println("Podaj bok a.");
		a = Double.parseDouble(br.readLine());
		System.out.println("Podaj bok b.");
		b = Double.parseDouble(br.readLine());
		pole = a * b;

		System.out.print("pole prostok¹ta o boku a = " + a + " i boku b = " + b);
		System.out.println(" wynosi " + pole + ".");
	}

}
