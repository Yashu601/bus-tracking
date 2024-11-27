package com.example.bus_tracking.Repositories;


import com.example.bus_tracking.model.BusStops;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusStopsRepository extends JpaRepository<BusStops, Long> {
    // You can define custom query methods here if needed
}
