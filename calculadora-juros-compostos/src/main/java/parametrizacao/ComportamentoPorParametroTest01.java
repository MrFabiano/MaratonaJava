package parametrizacao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest01 {

   private static final List<Car> cars = List.of(
            new Car("green", 2012),
            new Car("black", 2019),
            new Car("red", 2022)
    );

    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("green");
            }
        });
        System.out.println(greenCars);
        //List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        //System.out.println(filter(nums, num -> num % 2 == 0));

    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate){
        List<Car> filterColor = new ArrayList<>();
        for (Car car : cars) {
          if(carPredicate.test(car)){
              filterColor.add(car);
          }
        }
        return filterColor;
    }
    private static <T> List<T> filterList(List<T> list, Predicate<T> predicate){
        List<T> tList = new ArrayList<>();
        for(T e: list){
            if(predicate.test(e)){
                tList.add(e);
            }
        }
        return tList;
    }
}
