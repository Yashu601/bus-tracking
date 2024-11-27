package com.example.bus_tracking.Controllers;

import com.example.bus_tracking.Servicies.BusLocationService;
import com.example.bus_tracking.model.BusLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/bus-locations")
public class BusLocationController {

    @Autowired
    private BusLocationService busLocationService;

    @PostMapping
    public ResponseEntity<BusLocation> saveBusLocation(@RequestBody BusLocation busLocation) {
        BusLocation savedLocation = busLocationService.saveBusLocation(busLocation);
        return new ResponseEntity<>(savedLocation, HttpStatus.CREATED);
    }

    @GetMapping("/{busId}")
    public ResponseEntity<?> getBusLocations(@PathVariable String busId) {
        List<BusLocation> locations = busLocationService.getLocationsByBusId(busId);

        if (locations.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    Collections.singletonMap("error", "Bus locations not found for ID: " + busId)
            );
        }

        return new ResponseEntity<>(locations, HttpStatus.OK);
    }
}
