import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class prob_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = new ArrayList<>();
        firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondList = new ArrayList<>();
        secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String in = "";

        while (!"nexus".equals(in = scanner.nextLine())) {
            String[] a = in.split("\\|");
            String[] firstStr = a[0].split(":");
            String[] secondStr = a[1].split(":");
            int[] firstCord = {Integer.parseInt(firstStr[0]), Integer.parseInt(firstStr[1])};
            int[] secondCord = {Integer.parseInt(secondStr[0]), Integer.parseInt(secondStr[1])};
            boolean paramFirs = (firstList.size() - 1 >= firstCord[0] && firstList.size() - 1 >= secondCord[0]) && (firstCord[0] >= 0 && secondCord[0] >= 0);
            boolean paramSec = (secondList.size() - 1 >= secondCord[1] && secondList.size() - 1 >= firstCord[1]) && (firstCord[1] >= 0 && secondCord[1] >= 0);
            if (paramFirs && paramSec) {

                int sum = firstList.get(firstCord[0]) + firstList.get(secondCord[0]) + secondList.get(firstCord[1]) + secondList.get(secondCord[1]);

                if (secondCord[0] >= firstCord[0]) {

                    for (int i = secondCord[0]; i >= firstCord[0]; i--) {
                        firstList.remove(i);

                    }
                } else {
                    for (int i = firstCord[0]; i >= secondCord[0]; i--) {
                        firstList.remove(i);

                    }
                }
                if(firstCord[1]>=secondCord[1]) {
                    for (int i = firstCord[1]; i >= secondCord[1]; i--) {
                        secondList.remove(i);

                    }
                }else{
                    for (int i = secondCord[1]; i >= firstCord[1]; i--) {
                        secondList.remove(i);

                    }
                }

                firstList = firstList.stream().map(e -> {
                    return e + sum;
                }).collect(Collectors.toList());
                secondList = secondList.stream().map(e -> {
                    return e + sum;
                }).collect(Collectors.toList());
            }

        }
        System.out.println(firstList.toString().replaceAll("\\[", "").replaceAll("\\]", ""));
        System.out.println(secondList.toString().replaceAll("\\[", "").replaceAll("\\]", ""));

    }
}
