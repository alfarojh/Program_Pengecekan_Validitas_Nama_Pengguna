import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // Menjalankan perulangan tak terbatas untuk terus meminta input username sampai valid
            System.out.print("Masukkan nama pengguna (username): ");
            String username = scanner.next(); // Membaca input username

            if (username.length() < 5 || username.length() > 12){ // Memeriksa apakah panjang username tidak berada dalam rentang yang valid (5 hingga 12 karakter)
                System.out.println("Maaf, nama pengguna harus terdiri dari 5 hingga 12 karakter.");
            } else if(!Character.isLetter(username.charAt(0))) { // Memeriksa apakah karakter pertama username bukan huruf
                System.out.println("Maaf, nama pengguna harus dimulai dengan huruf");
            } else {
                if (!username.matches("^[A-Za-z][A-Za-z0-9]*$")) { // Memeriksa apakah username tidak sesuai dengan pola yang telah ditentukan
                    System.out.println("Maaf, nama pengguna tidak boleh mengandung karakter");
                } else {
                    System.out.println("Selamat nama pengguna valid");
                    break; // Keluar program setelah username valid
                }
            }
        }
        scanner.close();
    }
}