package nanonano;

import java.util.Scanner;

public class program_gabungan {

	public static void main(String[] args) {
		//deklarasi variable
		int input;
		
		//membuat variable dan new scanner
		Scanner a = new Scanner(System.in);
		
		System.out.println("POGRAM KUMPULAN LATIHAN JAVA ");
		System.out.println("*****************************");
		System.out.println();
		System.out.println("      MENU        ");
		System.out.println("      ****        ");
		System.out.println("1. program hello world ");
		System.out.println();
		
		System.out.println("masukan pilhan anda");
		input  = a.nextInt();
		
		switch (input) {
		case 1:
			hello();
			break;

		default:
			System.out.println("pilhan anda tidak tersedia");
			break;
		}
	}
	
	public static void hello() {
		System.out.println("hello world");
	}
}


	

