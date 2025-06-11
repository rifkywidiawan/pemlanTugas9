import java.io.File;

public class ListFilesInDirectory {

    public static void main(String[] args) {
        
        File directory = new File("D:\\SEMESTER 6\\PEMLAN\\PRAKTIKUM\\Modul 9"); 

        if (directory.exists() && directory.isDirectory()) {
            String[] files = directory.list();

            if (files != null && files.length > 0) {
                System.out.println("Daftar file dan direktori di dalam " + directory.getAbsolutePath() + ":");
                for (String fileName : files) {
                    System.out.println(fileName);
                }
            } else {
                System.out.println("Direktori kosong atau tidak ada file/direktori yang dapat diakses.");
            }
        } else {
            System.out.println("Direktori tidak ada atau bukan sebuah direktori.");
        }
    }
}