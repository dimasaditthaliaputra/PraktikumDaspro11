import java.util.Scanner;

public class Tugas106 {
    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    public static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        int s, volume, luasPermukaan;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sisi = ");
        s = input.nextInt();

        volume = hitungVolume(s);
        System.out.println("Volume Kubus adalah " + volume);
        
        luasPermukaan = hitungLuasPermukaan(s);
        System.out.println("Luas Permukaan Kubus adalah " + luasPermukaan);

        input.close();
    }
}
