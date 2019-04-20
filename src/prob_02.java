import java.util.Scanner;

public class prob_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int height = (num * 4) + 2;
        int width = num * 5;
        String a = "";
        String b = "";
        for (int i = 0; i < width - num * 2; i++) {
            if (i % 2 == 0) {
                a += " ";
            } else {
                a += "#";
            }
        }
        for (int i = 0; i < (width - num * 2); i++) {
            if (i % 2 == 1) {
                b += "#";
            } else {
                b += " ";
            }
        }
        for (int i = 0; i < num / 2; i++) {

            System.out.println(" ".repeat(num) + "#".repeat(width - num * 2) + " ".repeat(num));
        }
        System.out.println("#".repeat(num) + " ".repeat(width - num * 2) + "#".repeat(num));
        System.out.println("#".repeat(num) + a + "#".repeat(num));
        System.out.println("#".repeat(num) + " " + b.substring(2) + " " + "#".repeat(num) + "  ");
        System.out.println("#".repeat(num) + a + "#".repeat(num));
        System.out.println("#".repeat(num) + " " + b.substring(2) + " " + "#".repeat(num) + "  ");
        System.out.println("#".repeat(num) + a + "#".repeat(num));
        System.out.println("#".repeat(num) + " ".repeat(width - num * 2) + "#".repeat(num));
        System.out.println("#".repeat(width));
        System.out.println("#".repeat(num) + a + "#".repeat(num));
        System.out.println("#".repeat(width));
        System.out.println("#".repeat(num) + a + "#".repeat(num));
        System.out.println("#".repeat(width));
        for (int i = 0; i < num / 2; i++) {

            System.out.println(" ".repeat(num) + "#".repeat(width - num * 2) + " ".repeat(num));
        }

    }
}
