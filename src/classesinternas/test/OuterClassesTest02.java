package classesinternas.test;

public class OuterClassesTest02 {

    private String name = "Roronoa";

    void metodo() {
        String lastName = "Zoro"; //final

        //abstract or final
        class LocalClass {

            public void metodoClasseLocal() {
                System.out.println(name +" " + lastName);
            }
        }

        new LocalClass().metodoClasseLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 obj = new OuterClassesTest02();
        obj.metodo();
    }
}
