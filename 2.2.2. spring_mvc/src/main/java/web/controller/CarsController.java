package web.controller;

import entities.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarsController {
    CarService carService = new CarService();
    @GetMapping(value = "/cars")
    public String printCars(Model model, @RequestParam(value = "quality", required = false) Integer quality) {
        model.addAttribute("cars", carService.getCars(quality));
        return "cars";
    }
}
