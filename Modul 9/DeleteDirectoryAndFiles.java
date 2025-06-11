import java.io.File;

public class DeleteDirectoryAndFiles {

    public static void main(String[] args) {
        
        String dirToDeletePath = "my_temp_directory";
        File directory = new File(dirToDeletePath);

        
        if (directory.mkdir()) {
            System.out.println("Direktori '" + dirToDeletePath + "' berhasil dibuat.");
            try {
                new File(directory, "file1.txt").createNewFile();
                new File(directory, "file2.txt").createNewFile();
                System.out.println("File dummy berhasil dibuat di '" + dirToDeletePath + "'.");
            } catch (Exception e) {
                System.err.println("Gagal membuat file dummy: " + e.getMessage());
            }
        } else {
            System.out.println("Direktori '" + dirToDeletePath + "' sudah ada atau gagal dibuat.");
        }

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) { 
                        if (file.delete()) {
                            System.out.println("Berhasil menghapus file: " + file.getName());
                        } else {
                            System.err.println("Gagal menghapus file: " + file.getName());
                        }
                    }
                }
            }

            
            if (directory.delete()) {
                System.out.println("Berhasil menghapus direktori: " + directory.getName());
            } else {
                System.err.println("Gagal menghapus direktori: " + directory.getName() + ". Pastikan direktori kosong.");
            }
        } else {
            System.out.println("Direktori tidak ada atau bukan sebuah direktori.");
        }
    }
}