package com.wyair.demo1.controller;

import com.wyair.demo1.Service.FlightService;
import com.wyair.demo1.entity.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flight")
public class FlightController
{
    @Autowired
    FlightService flightService;

    @GetMapping
    public Iterable<Flight> getFlights() {
        return flightService.getFlights();
    }

    @GetMapping("/{id}")
    public Flight getOneById(Model model, @PathVariable("id") Long id) {
        return flightService.getOneById(id);
    }

    @PostMapping
    public void addFlight(@RequestBody Flight flight) {
        System.out.println(flight);
        flightService.addFlight(flight);
    }

    @PutMapping
    public void updateFlight(@RequestBody Flight flight) {
        flightService.updateFlight(flight);
    }

    @DeleteMapping("/{id}")
    public void deleteFlight(@PathVariable("id") Long id) {
        flightService.deleteFlight(id);
    }
}
