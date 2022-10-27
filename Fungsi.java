package tugas_asistensi_md3;
import java.util.Scanner;

public class Fungsi {
    String tema, judul;
    int halaman;
    
    public Fungsi(String tema){
        this.tema = tema;
    }
    
    Scanner p = new Scanner(System.in);
    
    void input (){
        System.out.print("masukkan nama judul     : ");
        judul = p.nextLine();
        System.out.print("masukkan jumlah halaman : ");
        halaman = p.nextInt();
    }
    
    void outpput(){
        System.out.println("nama tema      : " + tema);
        System.out.println("nama judul     : " + judul);
        System.out.println("jumlah halaman : " + halaman);
    }
}
