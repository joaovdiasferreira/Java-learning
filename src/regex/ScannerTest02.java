package regex;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {

        String text = "Luffy, Zoro, Sanji, true, 5000";

        Scanner sc = new Scanner(text);
        sc.useDelimiter(",\\s*");
        while (sc.hasNext()) {

            if (sc.hasNextBoolean()) {
                boolean bool = sc.nextBoolean();
                System.out.println("boolean: " + bool);
            } else if (sc.hasNextInt()) {
                int num = sc.nextInt();
                System.out.println("int: " + num);
            } else {
                System.out.println(sc.next());
            }

        }



    }
}
