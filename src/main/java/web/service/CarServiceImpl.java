package web.service;
import model.Car;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
  private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("Car Model", 2019, "color"));
        cars.add(new Car("Car Model2", 2015, "red"));
        cars.add(new Car("Car Model3", 2009, "black"));
        cars.add(new Car("Car Model4", 2011, "green"));
        cars.add(new Car("Car Model5", 2012, "blue"));
    }
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> addCar(List<Car> cars, int count) {
        List<Car> newCarList = new ArrayList<>();
        for (int i = 0; i < count && i < cars.size(); i++) {
            newCarList.add(cars.get(i));
        }
        return newCarList;
    }
}
