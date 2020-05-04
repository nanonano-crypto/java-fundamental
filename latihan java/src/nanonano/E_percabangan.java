package nanonano;

import java.util.Scanner;

public class E_percabangan {
	public static void main(String[] args) {
		int input;
		
		
		//membuat variable dan scanner
		Scanner abs = new Scanner(System.in);
		
		System.out.println("program percabangan");
		System.out.println("*******************");
		System.out.println("      MENU         ");
		System.out.println("      ****         ");
		System.out.println("1. if ");
		System.out.println("1. if else ");
		System.out.println("1. if elseif else");
		System.out.println();
		System.out.print("Masukan pilhan  anda : ");
		input = abs.nextInt();
		
		switch (input) {
		case 1:
			percabanganIf();
			break;
			
		case 2:
			percabanganIfElse();
			break;
			
		case 3:
			percabanganIfElseIf();
			break;

		default:
			break;
		}
	}
	
	public static void percabanganIf() {
		int angka;
		
		Scanner b = new Scanner(System.in);
		
		System.out.print("masukan umur anda : ");
		angka = b.nextInt();
		
		if (angka >= 17 ) {
			System.out.println("anda sudah dewasa");
		}		
	}
	
	public static void percabanganIfElse() {
		int angka;
		
		Scanner b = new Scanner(System.in);
		
		System.out.println("masukan umur anda : ");
		angka = b.nextInt();
		
		if (angka <= 17 ) {
			System.out.print("anda masih kecil");
		} else {
			System.out.println("anda sudah dewasa");
		}
	}
	
	public static void percabanganIfElseIf() {
		int angka;
		
		Scanner b = new Scanner(System.in);
		
		System.out.println("masukan umur anda : ");
		angka = b.nextInt();
		
		if (angka <= 17 ) {
			System.out.print("anda masih kecil");
		} else if (angka > 17 && angka < 50) {
			System.out.println("anda sudah dewasa");
		} else {
			System.out.println("anda sudah expiyet");
		}
	}
	
	
}
