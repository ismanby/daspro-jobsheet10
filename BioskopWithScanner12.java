import java.util.Scanner;

public class BioskopWithScanner12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu;
        String nama, next = "null";

        String[][] penonton = new String[4][2];

        System.out.println("Menu 1 :  Input data penonton");
        System.out.println("Menu 2 :  Tampilkan daftar penonton");
        System.out.println("Menu 3 :  Exit");

        while (true) {
            System.out.print("\nPilih menu (1/2/3): ");
            menu = sc.nextInt();

            sc.nextLine();

            if (menu == 1) {
                do {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();

                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        
                        sc.nextLine(); 

                        if (baris <= 0 || baris > penonton.length || kolom <= 0 || kolom > penonton[0].length ) {
                            System.out.println("Baris/kolom tidak valid, silahkan input ulang!");
                            continue;
                        }

                        if (penonton[baris-1][kolom-1] != null) {
                            System.out.println("Kursi yang anda pilih sudah terisi oleh penonton lainnya. Silahkan pilih kursi yang lain");
                            continue;
                        }

                        break;
                    }

                    penonton[baris-1][kolom-1] = nama;

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                } while (next.equalsIgnoreCase("y"));

            } else if (menu == 2) {
                for (int j = 0; j < penonton.length; j++) {
                    System.out.println("Penonton pada baris ke-" + (j+1) + ": " + String.join(", ", penonton[j]));
                }

            } else if (menu == 3) {
                System.out.println("Program berhenti. Terima kasih!");
                break;

            } else {
                System.out.println("Pilihan tidak valid! Silahkan pilih 1, 2 atau 3.");
            }

        }

        sc.close();
    }
}