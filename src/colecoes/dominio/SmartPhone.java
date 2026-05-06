package colecoes.dominio;

import java.util.Objects;

public class SmartPhone implements Comparable<SmartPhone>{
    private String serialNumber;
    private String marca;

    public SmartPhone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    @Override
    public int compareTo(SmartPhone o) {
        return this.serialNumber.compareTo(o.serialNumber);
    }

    @Override
    public String toString() {
        return "SmartPhone{" + '\''+
                "serialNumber=" + serialNumber + '\'' +
                ", marca=" + marca + '}';
    }

    //Reflexivo: x.equals(x) tem que ser true para tudo diferente de null
    //Simétrico: para x e y != null, x.equals(y) == true -> y.equals(x) == true
    //Transitivo: para x, y e z != null, x.equals(y) == true e x.equals(x) == true -> y.equals(z) == true
    //Consistene: x.equals(x) sempre retorna true se x for diferente de null
    //x != null, x.equals(null) == false


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SmartPhone that = (SmartPhone) o;
        return Objects.equals(serialNumber, that.serialNumber) && Objects.equals(marca, that.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, marca);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
