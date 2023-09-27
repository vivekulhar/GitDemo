import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Car class demo");
        Car c1 = new Car(10000, 1200);
        Car c2 = new Car(20000, 1400);
        Car c3 = new Car(30000, 1600);
        Car c4 = new Car(40000, 1800);

        List<Car> carList = new ArrayList<>(Arrays.asList(c2,c1,c3,c4));
        carList.sort(new CarPriceComparator());
        System.out.println(carList);
    }
}