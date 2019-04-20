import java.util.Scanner;

public class prob_01 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double result = Integer.MIN_VALUE;
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int sumOfInt = a + b + c;

        boolean isDigitvision = false;
        for (int i = 0; i < 6; i++) {

            if (isDigitvision) {
                break;
            }
            String sequenceInt = "" + a+b+c;
            String secondSwap = "";

            for (int j = 0; j < 2; j++) {

                if (Double.parseDouble(sequenceInt) % sumOfInt == 0) {
                    isDigitvision = true;
                    break;
                }
                if (j == 0) {
                    String[] secSwap = sequenceInt.split("");
                    sequenceInt = secSwap[0] + secSwap[2] + secSwap[1];
                    {
                    }

                    String[] swap = sequenceInt.split("");
                    sequenceInt = swap[1] + swap[0] + swap[2];

                }


            }
        }
        if (isDigitvision) {
            System.out.println("Digitivision successful!");
        } else {
            System.out.println("No digitivision possible.");
        }
    }
}

