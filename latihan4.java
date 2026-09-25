
public class latihan4 {
    
    public static void main(String[] args) {
        
        int panjangTanah = 1000;
        int lebarTanah = 500;
        
        int anakLakiLaki = 5;
        int anakPerempuan = 2;
        
        double persen = 10;
        int perMeter = 50000;
        
        
        int luasTanah = panjangTanah*lebarTanah;
        double persenDari = (persen/100*luasTanah);
        double hasilPenjualan = persenDari*perMeter;
        double luasDihibakan = luasTanah-persenDari;
        
        double totalBagian = (anakLakiLaki*2)+ anakPerempuan;
        double bagianPerempuan = luasDihibakan/totalBagian;
        double bagianLakiLaki = bagianPerempuan*2;
        
        System.out.println("luas tanah : "+ luasTanah);
        System.out.printf("luas tanah :%.2f " , persenDari);
        System.out.printf("%nHasil Penjualan :%.2f" , hasilPenjualan);
        System.out.printf("%nLuas dihibakan :%.2f" , luasDihibakan);
        System.out.printf("%nBagian Perempuan :%.2f" , bagianPerempuan);
        System.out.printf("%nBagian anak laki laki :%.2f" , bagianLakiLaki);
       
        
        
        
        
        
        
        
    }
    
}
