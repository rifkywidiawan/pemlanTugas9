import java.io.File;

public class UkuranFile {

    public static void main(String[] args) {
        
        File file = new File("test.txt");

        if (file.exists() && file.isFile()) {
            long fileSizeInBytes = file.length();
            double fileSizeInKB = (double) fileSizeInBytes / 1024;
            double fileSizeInMB = fileSizeInKB / 1024;

            if (fileSizeInMB < 1) {
                System.out.printf("Ukuran file: %.2f KB\n", fileSizeInKB);
            } else {
                System.out.printf("Ukuran file: %.2f MB\n", fileSizeInMB);
            }
        } else {
            System.out.println("File tidak ada atau bukan sebuah file.");
        }
    }
}