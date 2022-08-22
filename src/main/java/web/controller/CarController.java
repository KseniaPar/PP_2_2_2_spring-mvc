package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;

@Controller
public class CarController {

    private final CarService cars;

    public CarController(CarServiceImp cars) {
        this.cars = cars;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count",required = false, defaultValue = "3") int count,
                            Model model) {
        model.addAttribute("cars", cars.getCars(count));
        return "cars";
    }
}
