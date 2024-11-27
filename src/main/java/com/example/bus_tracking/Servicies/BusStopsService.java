package com.example.bus_tracking.Servicies;


import com.example.bus_tracking.Repositories.BusStopsRepository;
import com.example.bus_tracking.ResourceNotFoundException;
import com.example.bus_tracking.model.BusStops;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusStopsService {

    @Autowired
    private BusStopsRepository busStopsRepository;

    public BusStops saveBusStop(BusStops busStop) {
        return busStopsRepository.save(busStop);
    }

    public BusStops findBusStopById(Long id) {
        return busStopsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Bus stop not found"));
    }

    public List<BusStops> findAllBusStops() {
        return busStopsRepository.findAll();
    }
}
