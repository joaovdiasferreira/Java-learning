package classesinternas.test;

public class OuterClassesTest03 {
    private String name = "Ferreira";
    private static String nameStatic = "Ferreira";

    static class NestedClass {
        private String firstName = "João";
        void print() {
            System.out.println("name: " + new OuterClassesTest03().name);
            System.out.println("name: " + nameStatic +" "+ firstName);
        }
    }

    public static void main(String[] args) {
        NestedClass nestedClass = new NestedClass();
        nestedClass.print();
        new NestedClass().print();
    }
}
