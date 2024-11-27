package com.example.bus_tracking.Servicies;

import com.example.bus_tracking.Repositories.BusRepository;
import com.example.bus_tracking.ResourceNotFoundException;
import com.example.bus_tracking.model.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusService {

    @Autowired
    private BusRepository busRepository;

    public Bus saveBus(Bus bus) {
        return busRepository.save(bus);
    }

    public Optional<Bus> findBusById(Long id) {
        return busRepository.findById(id); // No change needed here
    }

    public List<Bus> findAllBuses() {
        return busRepository.findAll();
    }
}
