package web.controller;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

import java.util.List;


@Controller
@RequestMapping
public class CarController {
     final CarServiceImpl carService;
     @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
     public String getCars(@RequestParam(required = false) String count , Model model) {
         List <Car> cars = carService.getCars();
         if (count == null || count.isEmpty()) {
             model.addAttribute("cars", cars);
         } else {
             model.addAttribute("cars", carService.addCar(cars, Integer.parseInt(count)));
         }
         return "allcars";
     }
}
