package modul2;

import javax.swing.JOptionPane;

public class MenghitungLuasBangun {
    public double Luas_Persegi_Panjang (int Panjang, int Lebar) {
        int total = Panjang * Lebar;
        return total;
    }

    public double Luas_Segitiga (int Alas, int Tinggi) {
        int total = (Alas * Tinggi) / 2;
        return total;
    }    
    
    public double Luas_Lingkaran (int Diameter) {
        int Jari_Jari = Diameter / 2;
        double total = Math.PI * Math.pow(Jari_Jari, 2);
        return total;
    }
    
    public static void main(String[] args) {
        MenghitungLuasBangun count = new MenghitungLuasBangun();
        
        try {
            double total = 0;
            String jenis = "";
            int Pilihan = Integer.parseInt(JOptionPane.showInputDialog("Pilihan : \n" 
                    + "1. Luas Persegi Panjang\n"
                    + "2. Luas Segitiga\n" 
                    + "3. Luas Lingkaran\n"));
            
            switch (Pilihan) {
                case 1:
                    int Panjang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang : "));
                    int Lebar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar : "));
                    total = count.Luas_Persegi_Panjang(Panjang, Lebar);
                    jenis = "Persegi Panjang";
                    break;
                case 2:
                    int Alas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Alas : "));
                    int Tinggi = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Tinggi : "));
                    total = count.Luas_Segitiga(Alas, Tinggi);
                    jenis = "Segitiga";
                    break;
                case 3:
                    int Diameter = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Diameter : "));
                    total = count.Luas_Lingkaran(Diameter);
                    jenis = "Lingkaran";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Inputan Salah, Masukkan Nomor Sesuai Pilihan");
                    return;          
            }
            
            JOptionPane.showMessageDialog(null, "Luas " + jenis + " = " + total);
            System.out.println("Luas " + jenis + " = " + total);   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Inputan Salah, Masukkan Nomor Sesuai Pilihan");
            System.out.println("Inputan Salah, Masukkan Nomor Sesuai Pilihan");
        
        }
    }
}