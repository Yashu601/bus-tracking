package com.example.bus_tracking.Controllers;

import com.example.bus_tracking.Servicies.BusStopsService;
import com.example.bus_tracking.model.BusStops;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bus-stops")
public class BusStopsController {

    @Autowired
    private BusStopsService busStopsService;

    @PostMapping
    public ResponseEntity<BusStops> createBusStop(@RequestBody BusStops busStop) {
        BusStops savedBusStop = busStopsService.saveBusStop(busStop);
        return new ResponseEntity<>(savedBusStop, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BusStops> getBusStop(@PathVariable Long id) {
        BusStops busStop = busStopsService.findBusStopById(id);
        return new ResponseEntity<>(busStop, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<BusStops>> getAllBusStops() {
        List<BusStops> busStops = busStopsService.findAllBusStops();
        return new ResponseEntity<>(busStops, HttpStatus.OK);
    }
}
