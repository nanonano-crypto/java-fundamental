# java-fundamental

				Dokumentasi belajar java
				************************

. apa itu java
	 - di baut taun 1995
	 - di gunakan untuk 
	 	- membuat apk mobile
	 	- membuat apk desktop
	 	- membuat apk web
	 	- server web dan server aplikasi
	 	- game
	 	- koneksi basis data
	 	- dan masih banyak lagi

. mengapa menggunakan java
	- berfungsi pada semua platform 
	- mudah di pelajari
	- open source
	- aman cepat, kuat
	- komunitas banyak
	- mirip dengan c++ dan c#

. instal dan setting java
	- download jdk
	- install java
	- cek versi java
		- java -version
	- seting environment  variable

. cara menjalankan java pada cmd
	- buat file java 
		- hello.java
	- isi program 
	- compile file java
		- javac hello.java
	- running file java
		- java hello

. struktur program java
	
	 1. package nanonano     

	 2. import java.io.filr  

	 3. class program {

	 4.		public static void main(Stirng[] args){
	 5.			System.out.println("Hello world");
	 6.		}
	 7. }

	 1. -> deklarasi package
	 2. -> import library
	 3. -> bagian class
	 4. -> method main
	 5. -> fungsi output

. input dan output pada java

	- ada 3 class untuk mengambil inputan
		1. class Scanner;
		2. class BufferReader
		3. class console
	
	- Scanner input = new Scanner(System.in);
	  System.out.println("masukan nama : ");
	  umur = input.nextInt();

. jenis variable
	- variable  =>  tempat menyimpan nilai
	- String 	=>  "Hello world"
	- int 		=>   1234...0
	- float 	=>   1.2344f
	- char 		=>   a b c d e
	- boolean 	=>   true or false

	- contoh penulisan 
		String nama    = "nanonano";
		int umur       = 18;
		float dosa     = 25.50f;
		char platNomer = 'D';
		boolean bool   = true;

	- jenis type data di bagi menjadi 2
		1. type data primitif di bagi menjadi 2 lagi
			- integer
				- byte 		= 1 byte
				- short 	= 2 byte
				- int 	 	= 4 byte
				- long		= 8 byte
				- float 	= 4 byte
			- floating point 
				- double 	= 8 byte
				- boolean 	= 1 byte
				- char 		= 2 byte

		2. type data non primitif
			- string 
			- array
			- class
			- interface

. jenis operator
	- link 
		https://coggle.it/diagram/WOGCoOqtdwABC7kL/t/operator
	- operator aritmatika
			(+, -, *, /, %, ++, --)
	- operator penugasan
			(=) 
				int x = 10;
	- operator pembanding
			(==, !=, >, <, >=, <=)
	- operator logis
			(&&, ||, !)
	- operator bitwise

. java if else
		- if 
		- if else
		- if else if else
		- 

. perulangan
	1. counted loop
		- for
		- foreach
	2. uncouunted loop
		- while
		- do while

. array 
	- variable yg menyimpan banyak data dalam satu variable
	- cara membuat array	
		1. String[] nama;
		2. String nama[];
		3. String[] nama = new String[5];

	- cara mengisi value array
		1. nama[0] = "linda";
		   nama[1] = "kampret";
		   nama[2] = "dia";
		   nama[3] = "nana";

		2. String[] nama ={"linda", "kampret", "dia", "nana"}

	- mengambil data array
		1. System.out.print(nama[2]);

. pengertian fungsi prosedur dan method
	- prosedur => fungsi yg tidak mengembalikan nilai 
	- fungsi   => fungsi yg mengembalikan nilai
			      ciri menggunakan return di belakang
	- method   => fungsi yg berada dalam class 

. variable global dan variable lokal
	- Global => dapat di akses oleh semua fungsi
	- Lokal  => hanya dapat di panggil oleh fungsi teresbut




arti koding

- public static void main(String[] args) => method utama yg pertama kali di eksekusi
- System.out.println()  => mencetak ke layar + enter
			print()    => mencetak ke layar tanpa enter
-  //    => komentar satu baris
   /*    => komentar multiline

- .lenght()      => menghitung jml karakter
- .toUpperCase() => membuat huruf besar semua
- .toLowerCase() => membuat huruf kecil semua
- .concat()      => menggabungkan variable
						=> firstname.concat(lastname);
- \n  => new line
- \r  => carriage return
- \t  => tab
- \b  => backspace
- \f  => form feed
- Math.max(x,y)    => mencari nilai terbesar
- Math.min(x,y)    => mencari nilai terkecil
- Math.sqrt(angka) => mengembalikan akar kuadrat
- Math.abs(-3,7)   => mengembalikan ke nilai positiff
- Math.random()    => mengemablikan nilai acak
- parseInt()       => konversi string ke integer
- valuOf()         => konversi string ke integer
- equalsIgnoreCase("ya") => membandingkan dengan string