import java.util.Scanner;
import java.util.LinkedList;

public class App {
    private static int banyak;
    private static int sisip;
    private static int set;
    private static int hapus;

    public static void main(String[] args) throws Exception {
        String no_Bp, nama_Mahasiswa, alamat;

        LinkedList<String> BP = new LinkedList<>();
        LinkedList<String> nama = new LinkedList<>();
        LinkedList<String> asal = new LinkedList<>();

        try (Scanner input = new Scanner(System.in)) {

                System.out.println("\n--------------------- Masukkan Data ---------------------\n");
                System.out.print("Masukkan banyak data yang ingin ditambahkan (maks 5) : ");
                banyak = input.nextInt(); input.nextLine();
                for (int i = 1; i <= banyak; i++) {
                System.out.print("\nNo BP     : ");
                no_Bp = input.nextLine();
                BP.add(no_Bp);
                
                System.out.print("Nama      : ");
                nama_Mahasiswa = input.nextLine();
                nama.add(nama_Mahasiswa);

                System.out.print("Alamat    : ");
                alamat = input.nextLine();
                asal.add(alamat);
                }
                System.out.println("\n------------------------------------");
                System.out.println("--------- DATA MAHASISWA -----------");
                System.out.println("------------------------------------");
                System.out.println("\nNo Bp   yang ditambahkan    : " +BP);
                System.out.println("Nama    yang ditambahkan    : " +nama);
                System.out.println("Alamat  yang ditambahkan    : " +asal);

                System.out.println("\n--------------------- Hitung Banyak data ---------------------\n");
                System.out.println("Banyak Data No Bp   : " +BP.size());
                System.out.println("Banyak Data Nama    : " +BP.size());
                System.out.println("Banyak Data Alamat  : " +BP.size());
                
                System.out.println("\n--------------------- Menyisipkan data ---------------------\n");
                System.out.println("Menyisipkan data index ke (Maks indeks < " +BP.size()+ " ) :");
                sisip = input.nextInt(); input.nextLine();
                System.out.print("\nNo BP     : ");
                no_Bp = input.nextLine();
                BP.add(sisip, no_Bp);
                
                System.out.print("Nama      : ");
                nama_Mahasiswa = input.nextLine();
                nama.add(sisip, nama_Mahasiswa);

                System.out.print("Alamat    : ");
                alamat = input.nextLine();
                asal.add(sisip, alamat);

                System.out.println("\n------------------------------------");
                System.out.println("--------- DATA MAHASISWA -----------");
                System.out.println("------------------------------------");
                System.out.println("\nNo Bp   yang ditambahkan    : " +BP);
                System.out.println("Nama    yang ditambahkan    : " +nama);
                System.out.println("Alamat  yang ditambahkan    : " +asal);

                System.out.println("\n--------------------- Menukar data ---------------------\n");
                System.out.println("Menukar data index ke (Maks indeks < " +BP.size()+ " ) :");
                set = input.nextInt(); input.nextLine();
                System.out.print("\nNo BP     : ");
                no_Bp = input.nextLine();
                BP.set(set, no_Bp);
                
                System.out.print("Nama      : ");
                nama_Mahasiswa = input.nextLine();
                nama.set(set, nama_Mahasiswa);

                System.out.print("Alamat    : ");
                alamat = input.nextLine();
                asal.set(set, alamat);

                System.out.println("\n------------------------------------");
                System.out.println("--------- DATA MAHASISWA -----------");
                System.out.println("\n------------------------------------");
                System.out.println("\nNo Bp   yang ditambahkan    : " +BP);
                System.out.println("Nama    yang ditambahkan    : " +nama);
                System.out.println("Alamat  yang ditambahkan    : " +asal);

                System.out.println("\n--------------------- Hapus data ---------------------\n");

                    System.out.println("Masukkan indeks data yang ingin dihapus : ");
                    hapus = input.nextInt(); input.nextLine();
                    BP.remove(hapus);
                    nama.remove(hapus);
                    asal.remove(hapus);

                    System.out.println("\n------------------------------------");
                    System.out.println("--------- DATA MAHASISWA -----------");
                    System.out.println("\n------------------------------------");
                    System.out.println("\nNo Bp   yang ditambahkan    : " +BP);
                    System.out.println("Nama    yang ditambahkan    : " +nama);
                    System.out.println("Alamat  yang ditambahkan    : " +asal);
                    
                   
                }

    }
}

