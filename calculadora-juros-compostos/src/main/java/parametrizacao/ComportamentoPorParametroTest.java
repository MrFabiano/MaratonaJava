package parametrizacao;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest {

   private static final List<Car> cars = List.of(
            new Car("green", 2012),
            new Car("black", 2019),
            new Car("red", 2022)
    );

    public static void main(String[] args) {
        System.out.println(filterGreenCard(cars));
        System.out.println(filterRedCard(cars));
        System.out.println(filterByColor(cars, "red"));
        System.out.println(filterByColor(cars, "green"));
        System.out.println(filterByYear(cars, 2015));
    }

    private static List<Car> filterGreenCard(List<Car> cars){
        List<Car> filterColor = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equals("green")){
                filterColor.add(car);
            }
        }
        return filterColor;
    }

    private static List<Car> filterRedCard(List<Car> cars){
        List<Car> filterColor = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equals("red")){
                filterColor.add(car);
            }
        }
        return filterColor;
    }

    private static List<Car> filterByColor(List<Car> cars, String cor){
        List<Car> filterColor = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equals(cor)){
                filterColor.add(car);
            }
        }
        return filterColor;
    }

    private static List<Car> filterByYear(List<Car> cars, int year){
        List<Car> filterYear = new ArrayList<>();
        for (Car car : cars) {
            if(car.getYear() < year){
                filterYear.add(car);
            }
        }
        return filterYear;
    }

}
