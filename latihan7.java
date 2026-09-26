import java.util.Scanner;
public class latihan7 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan jumlah barang : ");
        int jumlahBarang = input.nextInt();
        
        
        System.out.print("masukan harga satuan: ");
        double hargaSatuan = input.nextDouble();
        
        System.out.print("masukan uang yang di bayarkan : ");
        double  uangBayar = input.nextDouble();
        
        double totalBelanja = jumlahBarang*hargaSatuan;
        double kembalian = uangBayar-totalBelanja;
        int pecahan2000 = (int)kembalian/2000;
        double sisaKembalian = kembalian%2000;
        
        
        System.out.println("\nTotal Belanja \t:Rp "+ totalBelanja);         
        System.out.println("Uang di bayar \t:Rp "+ uangBayar);       
        System.out.println("kembalian \t:Rp "+ kembalian);        
        System.out.println("pecahan Rp2000 \t:RP "+ pecahan2000+" Lembar");         
        System.out.println("Sisa kembalian \t:Rp "+ sisaKembalian+"");    
        input.close();
        
        
        // note fungsinya untuk menghitung berapa lembar uang Rp2.000 yang bisa diberikan dari uang kembalian.
        
        
    }
    
}
