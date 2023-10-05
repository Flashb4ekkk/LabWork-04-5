import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x, y, R;
        DecimalFormat df2 = new DecimalFormat("0.000");
        Random rand = new Random();
        Scanner skan = new Scanner(System.in);

        System.out.print("R = ");
        R = skan.nextDouble();

        for (int i = 0; i < 2; i++) {
            System.out.print("x = ");
            x = skan.nextDouble();
            System.out.print("y = ");
            y = skan.nextDouble();

            if (y <= Math.pow(R, 2) - Math.pow(x, 2) && y >= 0 && x >= 0
                    || y >= (-R - 0) / (0 - (-R)) * (x - (-R)) && x <= 0 && y <= 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        for (int i = 0; i < 10; i++) {
            x = rand.nextDouble(201) - 100;
            y = rand.nextDouble(201) - 100;
            x = Math.round(x * 100.0) / 100.0;
            y = Math.round(y * 100.0) / 100.0;

            if (y <= Math.pow(R, 2) - Math.pow(x, 2) && y >= 0 && x >= 0
                    || y >= (-R - 0) / (0 - (-R)) * (x - (-R)) && x <= 0 && y <= 0)
                System.out.println(" | " + String.format("%7s", x) + " | " + String.format("%7s", y) + " yes" + " |");
            else {
                System.out.println(" | " + String.format("%7s", x) + " | " + String.format("%7s", y) + " no" + " |");
            }
        }
    }
}