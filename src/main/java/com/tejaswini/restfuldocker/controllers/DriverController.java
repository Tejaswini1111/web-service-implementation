package com.tejaswini.restfuldocker.controllers;


import com.tejaswini.restfuldocker.repository.CarRepository;
import com.tejaswini.restfuldocker.repository.DriverRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller()
public class DriverController {
    private final DriverRepository driverRepository;
    private final CarRepository carRepository;

    public DriverController(DriverRepository driverRepository, CarRepository carRepository) {
        this.driverRepository = driverRepository;
        this.carRepository = carRepository;
    }

    @GetMapping("/")
    public String redirect(Model model){
        return "redirect:/driver";
    }

    @GetMapping("driver")
    public String getAllDrivers(Model model){
        model.addAttribute("driverList", driverRepository.findAll());
        return "index";
    }

    @GetMapping("driver/{id}")
    public String getDriverById(@PathVariable("id") Long id, Model model){
         driverRepository.findById(id).ifPresent(driver -> model.addAttribute("driver", driver));
         return "driver-details";
    }

    @GetMapping("driver/{id}/car")
    public String getCarsByDriverId(@PathVariable("id") Long driverId, Model model){
        model.addAttribute("carsList", carRepository.findByDriver(driverId));
        return "cars-list";
    }

    @GetMapping("driver/{driverId}/car/{carId}")
    public String getCarByDriverIdAndCarId(@PathVariable("driverId") Long driverId, @PathVariable("carId") Long carId, Model model){
        carRepository.findById(carId).ifPresent(car -> model.addAttribute("car", car));
        return "car-details";
    }
}
