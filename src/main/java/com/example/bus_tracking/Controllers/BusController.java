package com.example.bus_tracking.Controllers;

import com.example.bus_tracking.Servicies.BusLocationService;
import com.example.bus_tracking.Servicies.BusService;
import com.example.bus_tracking.model.Bus;
import com.example.bus_tracking.model.BusLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api")
public class BusController {

    @Autowired
    private BusService busService;

    @Autowired
    private BusLocationService busLocationService;

    @GetMapping("/buses")
    public ResponseEntity<List<Bus>> getAllBuses() {
        List<Bus> buses = busService.findAllBuses();
        return ResponseEntity.ok(buses);
    }

    @GetMapping("/bus-locations-info/{busId}") // Change to avoid conflict
    public ResponseEntity<?> getBusLocations(@PathVariable String busId) {
        List<BusLocation> busLocations = busLocationService.getLocationsByBusId(busId);

        if (busLocations.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    Collections.singletonMap("error", "Bus locations not found for ID: " + busId)
            );
        }

        return ResponseEntity.ok(busLocations);
    }

    @GetMapping("/buses/{busId}")
    public ResponseEntity<?> getBusById(@PathVariable Long busId) {
        Optional<Bus> bus = busService.findBusById(busId);

        if (!bus.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    Collections.singletonMap("error", "Bus not found for ID: " + busId)
            );
        }

        return ResponseEntity.ok(bus.get());
    }
}
