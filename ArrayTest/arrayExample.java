package ArrayTest;

public class arrayExample {
	public static void main (String[] args) { 
		String [] dataProdi={"Administrasi",
				"Agroteknologi", 
				"Teknik Elektro",
				"Bahasa Arab", 
				"Bahasa Inggris",
				"Teknik Informatika",
				"FIsika", "Kimia", 
				"Biologi", 
				"Manajemen"};
		for (int i = 0; i<dataProdi.length; i++) {
			//Fungsi untuk mengecualikan data prodi ke 3
			if(i==3) {
				continue;
			}
			//Fungsi untuk menampilkan data prodi
			System.out.println(dataProdi[i]);
			
		}
	}
}
