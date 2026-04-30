package interfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando os dados do Banco de Dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo os dados do Banco de Dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Sobrescrevendo verificação em DatadaseLoader");
    }

    public void retrieveMaxDataSize(){
        System.out.println("dentro do retrieveMaxDataSize em DatadaseLoader");
    }
}
