package dates.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {

//        Locale locale = Locale.getDefault();
//        System.out.println(locale);

        ResourceBundle rb = ResourceBundle.getBundle("messages", Locale.getDefault());
        System.out.println(rb.getString("ola"));
        System.out.println(rb.getString("bom.dia"));

        rb = ResourceBundle.getBundle("messages", Locale.US);
        System.out.println(rb.getString("ola"));
        System.out.println(rb.getString("bom.dia"));

    }
}
