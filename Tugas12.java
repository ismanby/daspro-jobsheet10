import java.util.Scanner;

public class Tugas12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] survei = new int[10][6]; 
        String[] nama = new String[10];
        int totalPerOrang, totalPerPertanyaan, totalSeluruh = 0;
        double rataPerOrang, rataPerPertanyaan, rataSeluruh, jumlahData;

        System.out.println("===== SURVEY KEPUASAN PELANGGAN =====\n");

        for (int i = 0; i < survei.length; i++) {
            System.out.print("Masukkan nama responden ke-" + (i + 1) + ": ");
            nama[i] = sc.nextLine();

            totalPerOrang = 0;
            for (int j = 0; j < survei[i].length; j++) {
                System.out.print("Masukkan nilai untuk pertanyaan ke-" + (j + 1) + " (skala 1-5): ");
                survei[i][j] = sc.nextInt();

                totalPerOrang += survei[i][j];
                totalSeluruh += survei[i][j];
            }
            rataPerOrang = 0;
            rataPerOrang = (double) totalPerOrang / survei[i].length;

            System.out.println("Rata-rata nilai " + (nama[i]) + ": " + rataPerOrang);
            System.out.println();

            sc.nextLine();
        }

        System.out.println("==========================================================================");
        System.out.println("Hasil Survei :");
        for (int i = 0; i < survei.length; i++) {
            System.out.print("Responden ke-" + (i + 1) + ": ");
            for (int j = 0; j < survei[i].length; j++) {
                System.out.print(survei[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("==========================================================================");
        System.out.println("Rata-rata tiap pertanyaan :");

        for (int j = 0; j < survei[0].length; j++) {
            totalPerPertanyaan = 0;
            for (int i = 0; i < survei.length; i++) {
                totalPerPertanyaan += survei[i][j];
            }

            rataPerPertanyaan = (double) totalPerPertanyaan / survei.length;
            System.out.println("Rata-rata pertanyaan ke-" + (j+1) + ": " + rataPerPertanyaan);
        }
        
        jumlahData = survei.length * survei[0].length;
        rataSeluruh = totalSeluruh / jumlahData;

        System.out.println("==========================================================================");
        System.out.println("Rata-rata seluruh nilai survei: " + rataSeluruh);

        sc.close();
    }
}