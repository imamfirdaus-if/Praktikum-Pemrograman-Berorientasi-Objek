package MultiDimensional;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		int a [][] = {{1,3,4},{3,4,5}};
		int b [][] = {{1,3,4},{3,4,5}};
		//Fungsi untuk menampilkan output yang diinginkan
        System.out.println("Output :");
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[0].length; j++){
				//a[i][j] berfungsi untuk menampilkan jumlah dari blok array pertama a dan b
				//b[i][j] berfungsi untuk menampilkan jumlah dari nlok array kedua a dan b
				int c = a[i][j] + b[i][j]; 
	            System.out.print( c + " ");
	            }
            System.out.println();
		}
	}
}
