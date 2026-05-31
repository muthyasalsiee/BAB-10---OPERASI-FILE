import java.io.File;
import java.util.Scanner;

public class HapusDirektori {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        System.out.print("Masukkan path direktori yang akan dihapus: ");
        var pathDir = keyboard.nextLine();

        var dir = new File(pathDir);

        if (dir.exists() && dir.isDirectory()) {
            File[] daftarFile = dir.listFiles();

            if (daftarFile != null) {
                for (File file : daftarFile) {
                    boolean berhasil = file.delete();
                    System.out.println((berhasil ? "Berhasil" : "Gagal") + " menghapus: " + file.getName());
                }
            }


            boolean hapusDir = dir.delete();
            System.out.println((hapusDir ? "Berhasil" : "Gagal") + " menghapus direktori: " + dir.getName());

        } else {
            System.out.println("Direktori tidak ditemukan: " + pathDir);
        }
    }
}
