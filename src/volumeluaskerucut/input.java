package VolumeLuasKerucut;
import java.util.Scanner;
public class input {
        float r, t, pi, volume, luas;
        operasi hitung;       
        
        public input() {
            hitung = new operasi();
            perkenalanio();
        }
        
        public void perkenalanio() {
            
        Scanner masuk = new Scanner(System.in);
        System.out.println("Volume dan Luas Kerucut Kelompok 13");
        System.out.println("----------------------------");
        System.out.println("Daniel Felix Nainggolan - 21120117130069");
        System.out.println("Faiza Awalia - 21120117130081");
        System.out.println("----------------------------");
        System.out.println("Masukkan jari-jari alas kerucut = ");
        r = masuk.nextInt();
        hitung.r = this.r;
        System.out.println("Masukkan tinggi kerucut = ");
        t = masuk.nextInt();        
        hitung.t = this.t;
        
}
        
        public void volumekerucut() {
            volume = (float) 3.14 * hitung.perkalianvolume() / 3;            
        }
        
        public void luaskerucut() {
            luas = (float) 3.14 * hitung.perkalianluas();
        }
        
        public void display() {
            System.out.println("Volume kerucut = "+ volume);
            System.out.println("Luas kerucut = " + luas);
        }

            
            
}