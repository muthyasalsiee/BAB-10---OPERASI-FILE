import java.io.File;
import java.util.Scanner;

// TUGAS 3: Menampilkan nama semua file di dalam suatu direktori
public class ListFile {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        System.out.print("Masukkan path direktori: ");
        var pathDir = keyboard.nextLine();

        var dir = new File(pathDir);

        if (dir.exists() && dir.isDirectory()) {
            File[] daftarFile = dir.listFiles();

            if (daftarFile != null) {
                System.out.println("\nIsi direktori: " + dir.getAbsolutePath());
                System.out.println("Total item: " + daftarFile.length);
                System.out.println("-----------------------------------");

                for (File item : daftarFile) {
                    if (item.isFile()) {
                        System.out.println("[FILE] " + item.getName());
                    } else if (item.isDirectory()) {
                        System.out.println("[DIR ] " + item.getName());
                    }
                }
            } else {
                System.out.println("Tidak dapat membaca isi direktori.");
            }
        } else {
            System.out.println("Direktori tidak ditemukan: " + pathDir);
        }
    }
}
