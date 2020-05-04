package nanonano;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D_input_buffered {

	public static void main(String[] args) throws IOException {
		//deklarasi variable
		String nama;
		int umur;
		
		//membuat objek input stream
		InputStreamReader input = new InputStreamReader(System.in);
		//membuat objek buffered
		BufferedReader br = new BufferedReader(input);
		
		System.out.print("nama anda :");
		nama = br.readLine();
		
		System.out.print("umur anda :");
		umur = br.read();
		
		System.out.println("nama anda adalah : " + nama);
		System.out.println("umur anda adalah : " + umur);
		
		
	}
}
