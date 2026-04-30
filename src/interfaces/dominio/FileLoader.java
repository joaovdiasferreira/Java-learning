package interfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando os dados dos arquivos");
    }

    @Override
    public void remove() {
        System.out.println("Removendo os dados dos arquivos");
    }
}
