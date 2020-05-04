package nanonano;

import java.util.Scanner;

public class C_input_scanner {

	public static void main(String[] args) {
		//deklarasi variable
		String nama, alamat;
		int umur, tinggi_badan;
		
		//membuat scanner baru
		Scanner input = new Scanner(System.in);
		
		//output ke layar
		System.out.println("data anak");
		System.out.println();
		System.out.println("**********");
		System.out.print("nama : ");
		
		//input jenis string
		nama = input.nextLine();
		
		System.out.print("alamat : ");
		alamat = input.nextLine();
		
		System.out.print("umur : ");
		umur = input.nextInt();
		
		System.out.print("tinggi badan : ");
		tinggi_badan = input.nextInt();
		
		System.out.println();
		System.out.println("***********");
		System.out.println("nama : " + nama);
		System.out.println("alamat : " + alamat);
		System.out.println("umur : " + umur);
		System.out.println("tinggi badan : " + tinggi_badan);
		
		
	}
}
