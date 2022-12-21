package programer.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Smartphone {

    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return Objects.equals(serialNumber, smartphone.serialNumber) && Objects.equals(marca, smartphone.marca);
    }

    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    /*
    Object equals?
     */
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABCD", "iphone");
        Smartphone s2 = new Smartphone("1ABCD", "iphone");
        List<Smartphone> smartphone = new ArrayList<>();
        smartphone.add(s1);
        smartphone.add(s2);
        smartphone.add(0, s2);

              for(Smartphone smartphone1 : smartphone){
                  System.out.println(smartphone1);
              }

              //Contains verifica se tem um objeto, retorna true ou false
              Smartphone s4 = new Smartphone("1ABCD", "iphone");
               System.out.println(smartphone.contains(s2));
               int indexSmartphone4 = smartphone.indexOf(s4);
        System.out.println(smartphone.get(indexSmartphone4));
        System.out.println(indexSmartphone4);

        }

    }
