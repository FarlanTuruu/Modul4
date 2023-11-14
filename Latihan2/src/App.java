import java.util.Scanner;

public class App{

    public static void displayMenu() {
        System.out.println("=== MENU TEKS ANALYZER ===");
        System.out.println("1. Masukkan Teks");
        System.out.println("2. Hitung Jumlah Karakter");
        System.out.println("3. Hitung Jumlah Kata");
        System.out.println("4. Cari Kata dalam Teks");
        System.out.println("5. Keluar");
        System.out.print("Pilihan Anda: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan teks: ");
                    text = scanner.nextLine();
                    if (!text.isEmpty()) {
                        System.out.println("Teks telah dimasukkan!\n");
                    } else {
                        System.out.println("Teks kosong. Silakan masukkan teks terlebih dahulu.\n");
                    }
                    break;
                case 2:
                    int characterCount = countCharacters();
                    System.out.println("Jumlah karakter dalam teks: " + characterCount + "\n");
                    break;
                case 3:
                    int wordCount = countWords();
                    System.out.println("Jumlah kata dalam teks: " + wordCount + "\n");
                    break;
                case 4:
                    System.out.print("Masukkan kata yang ingin dicari: ");
                    String searchWord = scanner.nextLine();
                    int wordOccurrences = countWordOccurrences(searchWord);
                    System.out.println("Kata '" + searchWord + "' ditemukan sebanyak " + wordOccurrences + " kali dalam teks.\n");
                    break;
                case 5:
                    isRunning = false;
                    System.out.println("Terima kasih telah menggunakan program Teks Analisis!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.\n");
            }
        }

        scanner.close();
    }

    private static String text = "";

    public static int countCharacters() {
        return text.length();
    }

    public static int countWords() {
        String[] words = text.split("\\s+");
        return words.length;
    }

    public static int countWordOccurrences (String searchWord) {
        String[] words = text.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (word.equalsIgnoreCase(searchWord)) {
                count ++;
            }
        }

        return count;
    }
}
