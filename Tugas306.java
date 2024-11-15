import java.util.Scanner;

public class Tugas306 {
    static int[][] nilaiMahasiswa;
    static String[] namaMahasiswa;

    public static void inputData() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.next();
            System.out.println("Masukkan nilai untuk " + namaMahasiswa[i] + " (tugas 1 hingga " + nilaiMahasiswa[i].length + "):");
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                System.out.print("Tugas ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
    }

    public static void tampilkanNilai() {
        System.out.println("Nilai Mahasiswa:");
        System.out.print("Nama\t");
        for (int i = 0; i < nilaiMahasiswa[0].length; i++) {
            System.out.print("T" + (i + 1) + "\t");
        }
        System.out.println();
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
        int tugasTertinggi = 0;

        for (int j = 0; j < nilaiMahasiswa[0].length; j++) {
            int totalTugas = 0;
            for (int i = 0; i < nilaiMahasiswa.length; i++) {
                totalTugas += nilaiMahasiswa[i][j];
            }
            if (totalTugas > maxNilai) {
                maxNilai = totalTugas;
                tugasTertinggi = j + 1;
            }
        }
        System.out.println("Tugas dengan nilai tertinggi adalah Tugas ke-" + tugasTertinggi + " dengan total nilai " + maxNilai);
    }

    public static void tampilkanMahasiswaNilaiTertinggi() {
        int maxNilai = 0;
        String nama = "";
        int tugas = 0;

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                if (nilaiMahasiswa[i][j] > maxNilai) {
                    maxNilai = nilaiMahasiswa[i][j];
                    nama = namaMahasiswa[i];
                    tugas = j + 1;
                }
            }
        }
        System.out.println("Mahasiswa dengan nilai tertinggi adalah " + nama + " dengan nilai " + maxNilai + " pada Tugas ke-" + tugas);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = scanner.nextInt();

        // Inisialisasi array sesuai input user
        nilaiMahasiswa = new int[jumlahMahasiswa][jumlahTugas];
        namaMahasiswa = new String[jumlahMahasiswa];

        inputData();
        tampilkanNilai();
        cariMingguNilaiTertinggi();
        tampilkanMahasiswaNilaiTertinggi();
    }
}