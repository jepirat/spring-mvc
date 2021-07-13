package web.controller;

import entities.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarsController {
    @GetMapping(value = "/cars")
    public String printCars(Model model, @RequestParam(value = "quality", required = false) Integer quality) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "200", "red"));
        cars.add(new Car("Ferrari", "250", "blue"));
        cars.add(new Car("Волга", "120", ",белая"));
        cars.add(new Car("Москвич", "120", "синий"));
        cars.add(new Car("Запорожец", "120", "красный"));
        if (quality != null) {
            List<Car> sortedCars = cars.stream().limit(quality).collect(Collectors.toList());
            model.addAttribute("cars", sortedCars);
            return "cars";
        } else {model.addAttribute("cars", cars);
            return "cars";
        }
    }
}
