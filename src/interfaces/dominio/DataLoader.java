package interfaces.dominio;

public interface DataLoader {

    // public abstract é o padrão nas interfaces (colocá-los é redundância)
    public abstract void load();

    // public static final é o padrão (redundante colocá-los)
    public static final int MAX_DATA_SIZE = 10;


    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    };


    // métodos estáticos em interface não podem ser sobrescritos
    static void retrieveMaxDataSize(){
        System.out.println("dentro do retrieveMaxDataSize");
    }

}
