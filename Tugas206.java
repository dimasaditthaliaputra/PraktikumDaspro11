import java.util.Scanner;

public class Tugas206 {
    static int[][] nilaiMahasiswa = new int[5][7];
    static String[] namaMahasiswa = { "Sari", "Rina", "Yani", "Dwi", "Lusi" };

    public static void inputData() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.println("Masukkan nilai untuk " + namaMahasiswa[i] + " (minggu 1 hingga 7):");
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
    }

    public static void tampilkanNilai() {
        System.out.println("Nilai Mahasiswa:");
        System.out.println("Nama\tM1\tM2\tM3\tM4\tM5\tM6\tM7");
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print(namaMahasiswa[i] + "\t");
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                System.out.print(nilaiMahasiswa[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void cariMingguNilaiTertinggi() {
        int maxNilai = 0;
        int mingguTertinggi = 0;

        for (int j = 0; j < 7; j++) {
            int totalMinggu = 0;
            for (int i = 0; i < 5; i++) {
                totalMinggu += nilaiMahasiswa[i][j];
            }
            if (totalMinggu > maxNilai) {
                maxNilai = totalMinggu;
                mingguTertinggi = j + 1;
            }
        }
        System.out.println("Minggu dengan nilai tertinggi adalah Minggu ke-" + mingguTertinggi + " dengan total nilai "
                + maxNilai);
    }

    public static void tampilkanMahasiswaNilaiTertinggi() {
        int maxNilai = 0;
        String nama = "";
        int minggu = 0;

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                if (nilaiMahasiswa[i][j] > maxNilai) {
                    maxNilai = nilaiMahasiswa[i][j];
                    nama = namaMahasiswa[i];
                    minggu = j + 1;
                }
            }
        }
        System.out.println("Mahasiswa dengan nilai tertinggi adalah " + nama + " dengan nilai " + maxNilai
                + " pada Minggu ke-" + minggu);
    }

    public static void main(String[] args) {
        inputData();
        tampilkanNilai();
        cariMingguNilaiTertinggi();
        tampilkanMahasiswaNilaiTertinggi();
    }
}