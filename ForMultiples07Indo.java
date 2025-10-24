import java.util.Scanner;

public class ForMultiples07Indo{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double nilai, tertinggi = 0, terendah = 100;
        for (int i = 1; i <= 10; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai < tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                
            }
            System.out.println("nilai tertinggi: " + tertinggi);
            System.out.println("nilai terendah: " + terendah);
            
        }
    }
}