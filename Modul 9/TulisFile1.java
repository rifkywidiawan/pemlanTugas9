import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TulisFile1 { 

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);

        System.out.print("Masukkan teks yang akan disimpan: ");
        var text = keyboard.nextLine();

        // Mengubah 'false' menjadi 'true' untuk mode append
        try (var writer = new FileWriter("test.txt", true)) { // Menambahkan true di sini
            writer.write(text + "\n"); // Menambahkan baris baru agar lebih mudah dibaca saat append
        } catch (IOException e) {
            System.err.println("Gagal menulis ke file");
        } finally {
            keyboard.close(); 
        }
    }
}