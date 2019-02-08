package com.wyair.demo1.Service;

import com.wyair.demo1.Repository.FlightRepository;
import com.wyair.demo1.entity.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FlightService
{
    @Autowired
    FlightRepository flightRepository;

    public Iterable<Flight> getFlights() {
        return flightRepository.findAll();
    }

    public void addFlight(Flight flight) {
        flightRepository.save(flight);
    }

    public Flight getOneById(Long id) {
        Optional<Flight> flight = flightRepository.findById(id);
        return flight.orElse(null);
    }

    public void updateFlight(Flight flight)
    {
        flightRepository.save(flight);
    }

    public void deleteFlight(Long id)
    {
        flightRepository.deleteById(id);
    }
}
