// Formulir Pendaftaran Peserta Lomba
/*
 * ● Gunakan objek Scanner untuk menerima input: nama lengkap (String), umur (int), dan tinggi badan dalam meter (double).
 * ● Tampilkan kembali seluruh data yang diinput dalam bentuk 'Bukti Pendaftaran' yang rapi.
 * ● Tambahkan sebuah pesan otomatis: jika umur peserta kurang dari 17 tahun, tambahkan catatan 'Wajib didampingi orang tua'.
 */

import java.util.Scanner;

public class latihan6 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("masukan nama : ");
        String nama = input.nextLine();
        
        System.out.print("masukan umur: ");
        int umur = input.nextInt();
        
        System.out.print("masukan tinggi badan : ");
        double tinggiBadan = input.nextDouble();
        
        // membersihkan Enter
        // sering dipakai untuk membersihkan Enter yang masih tersisa 
        // setelah nextInt() atau nextDouble().
        input.nextLine(); 

        System.out.print("masukan catatan : ");
        String cttn = input.nextLine();
        
        
        System.out.println("\n=== BUKTI PENDAFTARAN ===");
        System.out.println("Nama \t: " +nama);
        System.out.println("Umur \t: " +umur + "tahun");
        System.out.println("Tinggi \t:" + tinggiBadan+"cm");
        System.out.println("Catatan : " + cttn);
        
        input.close();
        
        
    
        
    }
    
}
