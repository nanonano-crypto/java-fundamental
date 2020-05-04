package nanonano;

import java.util.Scanner;

public class F_perulangan_for {

	public static void main(String[] args) {
		int input;
		
		Scanner abs = new Scanner(System.in);
		
		System.out.println("program perulangan");
		System.out.println("       MENU       ");
		System.out.println("       ****       ");
		System.out.println("1. program cetak bintang bentuk persegi");
		System.out.println("2. program cetak bilangan ganjil");
		System.out.println("2. program cetak array dengan for each");
		
		System.out.print("masukan pilhan anda : ");
		input = abs.nextInt();
		
		switch (input) {
		case 1:
			cetak_bintang();
			break;
		case 2:
			cetak_bilangan_ganjil();
			break;
		case 3:
			perulalnganForEach();
			break;

		default:
			break;
		}
	}
	
	public static void cetak_bintang() {
		int input;
		
		Scanner abs = new Scanner(System.in);
		System.out.print("masukan angka : ");
		input = abs.nextInt();
		
		for(int i=0; i<input; i++) {
			for(int j=0; j<input; j++) {
				System.out.print("*");
			}
			System.out.println();
		}				
	}
	
	public static void cetak_bilangan_ganjil() {
		int input;
		
		Scanner abs = new Scanner(System.in);
		System.out.print("masukan angka : ");
		input = abs.nextInt();
		
		for(int i=1; i<input; i+=2) {			
			System.out.print(i + " ");
		}				
	}
	
	public static void perulalnganForEach() {
		//membuat array
		char angka[] = {'A', 'L', 'G', 'O', 'R', 'I', 'T', 'M', 'A'};
		char angka2[] = {'A', 'M', 'T', 'I', 'R', 'O', 'G', 'L', 'A'};
		
		
			for(int j=1; j<=angka.length; j++) {
				for(int k=0; k<j; k++) {					
						System.out.print( " " + angka[k]);					
				}
				System.out.println();
			}
			
			for(int j=1; j<=angka.length; j++) {
				for(int k=angka.length; k<j; k--) {					
						System.out.print(angka[k]);					
				}
				System.out.println();
			}
			

			
		
			
	}}
