package com.example.bus_tracking.Servicies;

import com.example.bus_tracking.Repositories.BusLocationRepository;
import com.example.bus_tracking.model.BusLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusLocationService {

    @Autowired
    private BusLocationRepository busLocationRepository;

    /**
     * Saves a BusLocation entity to the database.
     *
     * @param busLocation the BusLocation entity to save
     * @return the saved BusLocation entity
     */
    public BusLocation saveBusLocation(BusLocation busLocation) {
        return busLocationRepository.save(busLocation);
    }

    /**
     * Retrieves locations by bus ID.
     *
     * @param busId the ID of the bus
     * @return a list of BusLocation entities for the given bus ID
     */
    public List<BusLocation> getLocationsByBusId(String busId) {
        List<BusLocation> locations = busLocationRepository.findByBusId(busId);

        // Logging for debugging
        if (locations == null || locations.isEmpty()) {
            System.out.println("No locations found for busId: " + busId);
        } else {
            System.out.println("Locations found for busId: " + busId + " - Count: " + locations.size());
        }
        return locations;
    }
}
