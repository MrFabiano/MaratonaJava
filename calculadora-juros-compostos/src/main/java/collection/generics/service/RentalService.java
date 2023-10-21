package collection.generics.service;

import java.util.List;

public class RentalService<T> {
    
    private final List<T> objetosDisponiveis;
    
    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T retrieveAvailableCar(){
        System.out.println("Buscando t disponivel");
        T t =  objetosDisponiveis.remove(0);
        System.out.println("Alugando t: " +t);
        System.out.println("Carros disponiveis para alugar");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarCarroAlugado(T t){
        System.out.println("Devolvendo t " + t);
        objetosDisponiveis.add(t);
        System.out.println("Carros disponiveis para alugar");
        System.out.println(objetosDisponiveis);
    }
}
