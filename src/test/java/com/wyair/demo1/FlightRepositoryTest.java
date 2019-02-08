package com.wyair.demo1;

import com.wyair.demo1.Repository.FlightRepository;
import com.wyair.demo1.entity.Flight;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;
@SpringBootTest
public class FlightRepositoryTest
{
    @Autowired
    FlightRepository flightRepository;

    @Test
    public void testAddFlight() {
        Flight flight = new Flight("北京","北京极场","南京","南京极场",null,null,null,null,null,null);
        flightRepository.save(flight);
    }
}
