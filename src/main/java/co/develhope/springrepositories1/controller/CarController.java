package co.develhope.springrepositories1.controller;

import co.develhope.springrepositories1.entities.Car;
import co.develhope.springrepositories1.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    CarRepository repoCar;

    @PostMapping("/create")
    public Car createCar(@RequestBody Car newCar){
        repoCar.saveAndFlush(newCar);
        return newCar;
    }

    @GetMapping("/all")
    public List<Car> getAllCars(){
        return repoCar.findAll();
    }

}
