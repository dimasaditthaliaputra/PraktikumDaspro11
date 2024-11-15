import java.util.Scanner;

public class UcapanTerimaKasih_06Modifikasi {
    static Scanner sc = new Scanner(System.in);

    public static String PenerimaUcapan() {
        System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan:");
        String namaOrang = sc.nextLine();
        return namaOrang;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n"
                + "You inspired in me a love for learning and made me feel Like I could ask you anything.");
    }

    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();

        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan ucapan tambahan: ");
        String tambahan = sc.nextLine();
        UcapanTambahan(tambahan);
        sc.close();
    }
}
