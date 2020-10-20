/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualanlaptop.diskon;

import java.util.Scanner;

/**
 *
 * @author apple
 */
public class PenjualanLaptopDiskon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] Kategori = {""
             , "Macbook"
             , "Asus"
             , "Lenovo"};
        
        
        String[] Laptop = {""
             , "Macbook Air"
             , "Macbook Pro "
             , "Macbook"
             , "Asus ROG"
             , "Asus Vivobook Ultra "
             , "Asus Zenbook"
             , "Lenovo Thinkpad"
             , "Lenovo Yoga "
             , "Lenovo Legion"};
        int[] HargaLaptop = {0
                , 21000000 
                , 32000000
                , 23000000
                , 42000000
                , 15000000
                , 18000000
                , 52000000 
                , 15000000
                , 20000000};
        
        
        for (int i=1; i<Kategori.length; i++ ){
            System.out.println(i+". "+Kategori[i]);
        }
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Pilihan Kategori : ");
        int PilihanKategori = input.nextInt();
        System.out.println("");
        switch (PilihanKategori){// menampilkan pilihan laptop
        case 1 :
            for (int i=1; i<4; i++ ){
                System.out.println(i+". "+Laptop[i]+" Harganya "+HargaLaptop[i]);
            }
        break;
        case 2 :
            for (int i=4; i<7; i++ ){
                System.out.println(i+". "+Laptop[i]+"Harganya "+HargaLaptop[i]);
            }
        break;
        case 3 :
            for (int i=7; i<Laptop.length; i++ ){
                System.out.println(i+". "+Laptop[i]+" Harganya "+HargaLaptop[i]);
            }
        break;
        
        
    }
        //menginputkan pemilihan laptop
        System.out.print("Masukkan Pilihan Laptop : ");
        int PilihanLaptop = input.nextInt();
        System.out.println("");
        
        int Diskon = HargaLaptop[PilihanLaptop]*10/100;
        
        if(HargaLaptop[PilihanLaptop]>20000000 ){// menampilkan keterangan kondisi ketika dapat diskon
            System.out.println("Anda Mendapatkan diskon sebesar 10%");
            System.out.println("Anda Mendapatkan Potongan Harga sebesar : "+ Diskon);
            System.out.println("Total Harga Sekarang : " +(HargaLaptop[PilihanLaptop]-Diskon));
        }else{// menampilkan keterangan kondisi ketika x dapat diskon
            System.out.println("Anda belum Mencapai syarat diskon");
            System.out.println("Total Harga Sekarang : "+HargaLaptop[PilihanLaptop]);
        }
        
        int HargaDiskon=HargaLaptop[PilihanLaptop]-Diskon;
        
        System.out.println("");
        System.out.print("Masukkan Nominal Pembayaran : ");
        int NominalPembayaran = input.nextInt();
        System.out.println("");
        
        System.out.println ("          Nota Pembelian         ");//menampilkan input user
        System.out.println ("–––––––––––––––––––––––––––––––––");
        System.out.println("Nama Laptop            : "+Laptop[PilihanLaptop]);
        if(HargaLaptop[PilihanLaptop]>20000000 ){//menampilkan harga dengan kondisi ketika diskon
            
            System.out.println("Harga Laptop           : " +(HargaLaptop[PilihanLaptop]-Diskon));
        }else{//menampilkan harga dengan kondisi ketika x diskon
            System.out.println("Harga Laptop           : "+HargaLaptop[PilihanLaptop]);
        }
         
            System.out.println("Nominal Pembayaran     : "+NominalPembayaran);
        
        if(HargaLaptop[PilihanLaptop]>20000000 ){ //menampilkan kembalian dengan kondisi kembalian ketika diskon
            if(NominalPembayaran>HargaDiskon){
            System.out.println("Kembalian              : "+(NominalPembayaran-HargaDiskon));
            }else if (NominalPembayaran<HargaDiskon){
            System.out.println("Pembayaran Anda Kurang : "+(NominalPembayaran-HargaDiskon));
            }else {
            System.out.println("Kembalian          : - ");
            }
        }else{
            if(NominalPembayaran>HargaLaptop[PilihanLaptop]){//menampilkan kembalian dengan kondisi kembalian ketika x diskon
            System.out.println("Kembalian              : "+(NominalPembayaran-HargaDiskon));
            }else if (NominalPembayaran<HargaLaptop[PilihanLaptop]){
            System.out.println("Pembayaran Anda Kurang : "+(NominalPembayaran-HargaDiskon));
            }else {
            System.out.println("Kembalian          : - ");
            }
        }
        
        
        System.out.println("-----Terimakasih Sudah Belanja-----");
    }
    
}
