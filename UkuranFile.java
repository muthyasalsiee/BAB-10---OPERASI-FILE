import java.io.File;
import java.util.Scanner;

public class UkuranFile {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        System.out.print("Masukkan nama file: ");
        var namaFile = keyboard.nextLine();

        var file = new File(namaFile);

        if (file.exists() && file.isFile()) {
            long sizeBytes = file.length();
            long satu_mb = 1024L * 1024L;

            if (sizeBytes < satu_mb) {
                double sizeKB = sizeBytes / 1024.0;
                System.out.printf("Ukuran file: %.2f KB%n", sizeKB);
            } else {
                double sizeMB = sizeBytes / (1024.0 * 1024.0);
                System.out.printf("Ukuran file: %.2f MB%n", sizeMB);
            }
        } else {
            System.out.println("File tidak ditemukan: " + namaFile);
        }
    }
}
