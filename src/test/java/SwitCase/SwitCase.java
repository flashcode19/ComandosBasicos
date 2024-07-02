package SwitCase;

import java.util.Scanner;

public class SwitCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String time = scanner.next();
		
		switch (time) {
		case "bragantino":
			System.out.println("Time da primeira divisao de são paulo");
			
			break;
		case "palmeiras":
			System.out.println("Time campeao Paulista");
			break;
		default:
			System.out.println("todas as opçoes sao invalidas");
			break;
		}
		
		
	}


	
	}


