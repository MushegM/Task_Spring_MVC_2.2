package web.service;

import model.Car;

import java.util.List;

public interface CarService {
    List<Car> addCar(List<Car> cars, int count);
}
