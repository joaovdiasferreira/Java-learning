package wrappers.test;

import exceptions.exception.dominio.LoginInvalidoException;

public class WrapperTest01 {
/*
    TIPOS PRIMITIVOS:
    byte, char, short, int, double, float, long, boolean
*/
    public static void main(String[] args) throws LoginInvalidoException {
        byte byteP = 1;
        char charP = 'a';
        short shortP = 2;
        int intP = 3;
        long longP = 4L;
        float floatP = 5F;
        double doubleP = 6D;
        boolean booleanP = true;

        Byte byteW = 1;
        Character charW = 'a';
        Short shortW = 2;
        Integer intW = 3; //autoboxing
        Long longW = 4L;
        Float floatW = 5F;
        Double doubleW = 6D;
        Boolean booleanW = true;

        int i = intW; //unboxing
        Integer intW2 = Integer.parseInt("2");
        //Int intW3 = new Integer("2");

        Boolean booleanW2 = Boolean.parseBoolean("TrUe"); // não é case sensitive
        System.out.println(booleanW2);


    }

}
