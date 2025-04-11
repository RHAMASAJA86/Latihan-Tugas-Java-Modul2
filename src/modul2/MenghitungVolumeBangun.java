package modul2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenghitungVolumeBangun {
    public double Luas_Lingkaran(int diameter) {
        int jari2 = diameter /2;
        return Math.PI * Math.pow(jari2, 2);
    }
    
    public double Volume_Tabung(int diameter, double tinggi) {
        int jari_jari = diameter /2;
        return Math.PI * Math.pow(jari_jari, 2) * tinggi;
    }
    
    public double Volume_Kerucut(int diameter, double tinggi) {
        int jari_jari = diameter /2;
        return (1.0/3) * Math.PI * Math.pow(jari_jari, 2) * tinggi;
    }
    
    public double Volume_Bola(int diameter) {
        int jari_jari = diameter /2;
        return (4.0/3) * Math.PI * Math.pow(jari_jari, 3);
    }
    
    public static void main(String[] args) {
        MenghitungVolumeBangun pp = new MenghitungVolumeBangun();
        Scanner input = new Scanner(System.in);
        
        String status = "";
        double hasil = 0.0;
        try {
            System.out.println("======== Pilihan ========\n"
                    + "1. Luas Lingkaran\n"
                    + "2. Volume Tabung\n"
                    + "3. Volume Kerucut\n"
                    + "4. Volome Bola\n"
                    + "=========================");
            
            System.out.print("Masukkan Pilihan : ");
            byte pilihan = input.nextByte();
            
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Diameter : ");
                    int diameter1 = input.nextInt();
                    hasil = pp.Luas_Lingkaran(diameter1);
                    status = "Menghitung Luas Lingkaran";
                    break;
                case 2:
                    System.out.print("Masukkan Diameter : ");
                    int diameter2 = input.nextInt();
                    System.out.print("Masukkan Tinggi   : ");
                    double tinggi2 = input.nextDouble();
                    hasil = pp.Volume_Tabung(diameter2, tinggi2);
                    status = "Menghitung Volume Tabung";
                    break;
                case 3:
                    System.out.print("Masukkan Diameter : ");
                    int diameter3 = input.nextInt();
                    System.out.print("Masukkan Tinggi   : ");
                    double tinggi3 = input.nextDouble();
                    hasil = pp.Volume_Kerucut(diameter3, tinggi3);
                    status = "Menghitung Volume Kerucut";
                    break;
                case 4:
                    System.out.print("Masukkan Diameter : ");
                    int diameter4 = input.nextInt();
                    hasil = pp.Volume_Bola(diameter4);
                    status = "Menghitung Volume Bola";
                    break;
                default:
                    status = "Inputan salah! tolong masukkan sesuai pilihan ya";
                    break;
            }
            
            System.out.println("=========================");
            System.out.println("Status\t: " + status);
            if (pilihan >= 1 && pilihan <= 4){
                System.out.println("Hasil\t: " + hasil);
            }
            
        } catch (InputMismatchException e) {
            System.out.println("\nTerjadi kesalahan input! Pastikan hanya memasukkan angka.");
        }  
        
        input.close();
    }
}