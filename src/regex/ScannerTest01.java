package regex;

public class ScannerTest01 {
    public static void main(String[] args) {
        String text = "Luffy, Zoro, Sanji, true, 5000";

        String[] nomes = text.split(",");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }



    }
}
