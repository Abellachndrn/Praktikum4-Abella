/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pkg4.abella;

/**
 *
 * @author asus
 */
import java.util.Collections;
import java.util.Scanner;

public class DataArray {
    private java.util.ArrayList<String> name = new java.util.ArrayList();
    private java.util.ArrayList<String> NIM = new java.util.ArrayList();
    private java.util.ArrayList<String> date = new java.util.ArrayList();
    private java.util.ArrayList<Integer> gender = new java.util.ArrayList();
    
    Scanner in = new Scanner (System.in);
            
    void menu(){
        OUTER:
        while (true) {
                System.out.println("--------------------");
                System.out.println("      Olah Data     ");
                System.out.println("--------------------");
                System.out.println("Menu:");
                System.out.println("1. Tambah Data");
                System.out.println("2. Hapus Data");
                System.out.println("3. Cari Data");
                System.out.println("4. Tampil Data");
                System.out.println("5. Keluar");
                System.out.println("Menu yang dipilih:  ");
                String menu = in.next();
                switch (menu){
                case "1":
                    {
                        System.out.println("-------------------");
                        System.out.println("    Tambah Data    ");
                        System.out.println("-------------------");
                        System.out.println("Masukkan Data baru ");
                        System.out.print("Name : ");
                        String nama = in.next();
                        System.out.print("NIM  : ");
                        String nomor = in.next();
                        System.out.print("Tanggal lahir (dd-mm-yyyy) :  ");
                        String tgllahir = in.next();
                        System.out.print("Jenis Kelamin (0: Laki-laki atau 1: Perempuan) :  ");
                        int gdr = in.nextInt();
                        name.add(nama);
                        NIM.add(nomor);
                        date.add(tgllahir);
                        gender.add(gdr);
                        System.out.println("Data telah ditambahkan!");
                        break;
                    }   
                case "2":
                    {
                        System.out.println("------------------");
                        System.out.println("    Hapus Data    ");
                        System.out.println("------------------");
                        System.out.println("Masukkan data yang akan dihapus");
                        System.out.print("NIM : ");
                        String nomor = in.next();
                        int index = Collections.binarySearch(NIM, nomor);
                        name.remove(index);
                        NIM.remove(index);
                        date.remove(index);
                        gender.remove(index);
                        break;
                    }
                case"3":
                    System.out.println("-----------------");
                    System.out.println("    Cari Data    ");
                    System.out.println("-----------------");
                    System.out.println("1. Cari data berdasarkan Gender");
                    System.out.println("2. Cari data berdasarkan NIM");
                    System.out.print("Pilihan : ");
                    int pilihan = in.nextInt();
                    if (pilihan == 1){
                        System.out.println("-------------------------");
                        System.out.println("Berdasarkan Gender");
                        System.out.println("-------------------------");
                        System.out.print("Pilih gender (0 / 1) : ");
                        int gdr = in.nextInt();
                       
                        for ( int i = 0; i < name.size(); i++) {
                            if (gender.get(i) == 0){
                                System.out.println("Nama : " + name.get(i));
                                System.out.println("NIM : " + NIM.get(i));
                                System.out.println("Tanggal Lahir : " + date.get(i));
                                System.out.println("Gender : " + gender.get(i));
                                System.out.println("-----------------------");
                            } else if(gender.get(i) == 1){
                                System.out.println("Nama : " + name.get(i));
                                System.out.println("NIM : " + NIM.get(i));
                                System.out.println("Tanggal Lahir : " + date.get(i));
                                System.out.println("Gender : " + gender.get(i));
                                System.out.println("-----------------------");
                            }
                        }
                    } else if (pilihan == 2){
                        System.out.println("------------------");
                        System.out.println("Berdasarkan NIM");
                        System.out.println("------------------");
                        System.out.print("Input NIM : ");
                        String nomor = in.next();
                        
                        int index = Collections.binarySearch(NIM, nomor);
                        String cariNama = name.get(index);
                        String cariNIM = NIM.get(index);
                        String cariTl = date.get(index);
                        int cariGender = gender.get(index);
                        
                        System.out.println("Nama : " + cariNama);
                        System.out.println("NIM : " + cariNIM);
                        System.out.println("Tanggal Lahir : " + cariTl);
                        System.out.println("Gender : " + cariGender);
                    }   break;
                case "4":
                    System.out.println("-----------------------");
                    System.out.println("   Tampilkan Data      ");
                    System.out.println("-----------------------");
                    for ( int i = 0; i < name.size(); i++) {
                        System.out.println("Nama : " + name.get(i));
                        System.out.println("NIM : " + NIM.get(i));
                        System.out.println("Tanggal Lahir : " + date.get(i));
                        System.out.println("Gender : " + gender.get(i));
                        System.out.println("-----------------------");
                        System.out.println("Jumlah mahasiswa : " + name.size());
                    }    
            case "5":
                break OUTER;
                }    
        }
    }
}
