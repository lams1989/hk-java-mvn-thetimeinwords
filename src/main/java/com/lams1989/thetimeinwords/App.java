package com.lams1989.thetimeinwords;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			int h = sc.nextInt();
			int m = sc.nextInt();
			String result = "";
			result = TimeInWords.timeInWords(h, m);
			System.out.println(result);
		}
		sc.close();

	}

}
