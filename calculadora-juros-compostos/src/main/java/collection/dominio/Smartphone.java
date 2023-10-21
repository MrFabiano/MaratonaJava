package collection.dominio;

public class Smartphone {

    private int serial;
    private String marca;

    public Smartphone(int serial, String marca) {
        this.serial = serial;
        this.marca = marca;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
