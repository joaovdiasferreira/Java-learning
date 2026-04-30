package exceptions.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // CHECKED VS UNCHECKED
        // Checked -> filhas de Exception -> erro de compilação se não tratadas
        // Unchecked -> subclasses de RuntimeException ou Error -> o compilador não obriga a tratar

        Object obj = null;
        int[] arr= {1,2};

        //System.out.println(obj.toString());
        System.out.println(arr[2]);

    }
}
