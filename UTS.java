package uts;

import java.util.Scanner;

/**
 *
 * @author I Gusti Ngurah Angga Putra Sukanta 19103028
 */
public class UTS {

public String[] listPengunjung;
    
    public String tambahListPengunjung(UTS data,String pengunjungBaru){  
        String datas[] = new String[data.tampilkanListPengunjung().length + 1];
        int i;
        for(i = 0; i < data.tampilkanListPengunjung().length; i++) {
            datas[i] = this.listPengunjung[i];
        }
        datas[i] = pengunjungBaru;
        
        this.listPengunjung = new String[datas.length];
        for(i = 0; i < datas.length; i++) {
            this.listPengunjung[i] = datas[i];
        }
        
        return pengunjungBaru;
    }
    
    public String[] tampilkanListPengunjung(){
        String[] datas = {};
        if(this.listPengunjung != null){
            if(this.listPengunjung.length > 0){
                datas = this.listPengunjung;
            }
        }
        
        return datas;
    }
    
    static void prosesMain(UTS data){
        System.out.println("### Daftar Pengunjung Kebun Binatang ###");
        System.out.println("1. Tampilkan data pengunjung");
        System.out.println("2. Tambah data pengunjung");
        System.out.println("3. Keluar aplikasi");
        System.out.println("##############################################");
        Scanner inputScan = new Scanner(System.in);
        System.out.print("Pilih menu (1,2, atau 3) : ");
        int menu = inputScan.nextInt();
    
        if(menu == 1){
            if(data.tampilkanListPengunjung().length > 0){
                for(int a = 0; a < data.tampilkanListPengunjung().length; a++){
                    System.out.println(a+1 + ". "+data.tampilkanListPengunjung()[a]);    
                }
            }else{
                System.out.println("Tidak ada pengunjung");
            }
        }else if(menu == 2){
            System.out.print("Masukkan nama pengunjung : ");
            Scanner sca = new Scanner(System.in);
            String nama = sca.nextLine();
            data.tambahListPengunjung(data,nama);
        }else if(menu == 3){
            System.out.println("Kamu berhasil keluar");
        }else{
            System.out.println("Menu tidak ditemukan");
        }
        
        if(menu != 3){
            System.out.println("Tekan enter enter untuk melanjutkan");
        }
    }
    
    public static void main(String[] args) {
        UTS constructor = new UTS();
        prosesMain(constructor);
        Scanner inputScan = new Scanner(System.in);
        String readString = inputScan.nextLine();
        while(readString!=null) {
            if (readString.isEmpty()) {
                prosesMain(constructor);
            }
    
            if (inputScan.hasNextLine()) {
                readString = inputScan.nextLine();
            } else {
                readString = null;
            }
        }
    }
    
}
