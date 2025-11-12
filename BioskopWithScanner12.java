import java.util.Scanner;

public class BioskopWithScanner12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu;
        String nama, next;

        String[][] penonton = new String[4][2];

        System.out.println("Menu 1 :  Input data penonton");
        System.out.println("Menu 2 :  Tampilkan daftar penonton");
        System.out.println("Menu 3 :  Exit");

        while (true) {
            System.out.print("Pilih menu (1/2/3): ");
            menu = sc.nextInt();

            sc.nextLine();

            if (menu == 1) {
                do {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();

                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine(); 

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
