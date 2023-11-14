import java.util.Scanner;

public class App {

    public static void displayMenu() {
        System.out.println("=== Calculator ===");
        System.out.println("1. Akar Kuadrat");
        System.out.println("2. Pangkat");
        System.out.println("3. Logaritma");
        System.out.println("4. Faktorial");
        System.out.println("5. Keluar");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean Pilih = true;

        while (Pilih) {
            displayMenu();
            System.out.print("Pilih operasi (1/2/3/4/5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan angka: ");
                    double squareRootInput = scanner.nextDouble();
                    double squareRootResult = Math.sqrt(squareRootInput);
                    System.out.println("Hasil akar kuadrat dari " + squareRootInput + " adalah " + squareRootResult);
                    break;
                case 2:
                    System.out.print("Masukkan angka: ");
                    double base = scanner.nextDouble();
                    System.out.print("Masukkan pangkat: ");
                    double exponent = scanner.nextDouble();
                    double powerResult = Math.pow(base, exponent);
                    System.out.println(base + " pangkat " + exponent + " adalah " + powerResult);
                    break;
                case 3:
                    System.out.print("Masukkan angka: ");
                    double logInput = scanner.nextDouble();
                    double logResult = Math.log(logInput);
                    System.out.println("Logaritma natural dari " + logInput + " adalah " + logResult);
                    break;
                case 4:
                    System.out.print("Masukkan angka: ");
                    int factorialInput = scanner.nextInt();
                    long factorialResult = calculateFactorial(factorialInput);
                    System.out.println("Faktorial dari " + factorialInput + " adalah " + factorialResult);
                    break;
                case 5:
                    Pilih = false;
                    System.out.println("Terima kasih telah menggunakan kalkulator ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }

    public static long calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            long result = 1;
            for (int i = 2; i <= number; i++) {
                result *= i;
            }
            return result;
        }
    }
}
