package com.example.bus_tracking.Repositories;

import com.example.bus_tracking.model.BusLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusLocationRepository extends JpaRepository<BusLocation, Long> {
    List<BusLocation> findByBusId(String busId);
}
