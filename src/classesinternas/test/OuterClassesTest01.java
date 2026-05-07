package classesinternas.test;

public class OuterClassesTest01 {
    private String name = "João V. Ferreira";

    class InnerClass {
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
            System.out.println(OuterClassesTest01.this.name);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 obj1 = new OuterClassesTest01();
        InnerClass innerClass1 = obj1.new InnerClass();
        InnerClass innerClass2 = new OuterClassesTest01().new InnerClass();

        innerClass1.printOuterClassAttribute();
        //innerClass2.printOuterClassAttribute();
    }
}
