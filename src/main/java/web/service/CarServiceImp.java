package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {

    private final List <Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", 2013, "black"));
        cars.add(new Car ("LADA", 2020, "white"));
        cars.add(new Car("Mercedes", 2005, "black"));
        cars.add(new Car ( "Honda", 2010,"red"));
        cars.add(new Car( "Toyota", 2017, "white"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count < 0) { count = 0; }
        return cars.stream().limit(count).toList();
    }

}
