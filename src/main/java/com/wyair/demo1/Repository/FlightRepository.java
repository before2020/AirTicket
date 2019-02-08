package com.wyair.demo1.Repository;

import com.wyair.demo1.entity.Flight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends CrudRepository<Flight, Long>
{
}
