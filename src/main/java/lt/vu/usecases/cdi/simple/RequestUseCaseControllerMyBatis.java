package lt.vu.usecases.cdi.simple;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import lt.vu.usecases.mybatis.dao.FlightMapper;
import lt.vu.usecases.mybatis.dao.FlightPassengerMapper;
import lt.vu.usecases.mybatis.dao.PassengerMapper;
import lt.vu.usecases.mybatis.model.Flight;
import lt.vu.usecases.mybatis.model.FlightPassenger;
import lt.vu.usecases.mybatis.model.Passenger;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@Model // tas pats kaip: @Named ir @RequestScoped
@Slf4j
public class RequestUseCaseControllerMyBatis {

    @Getter
    private Flight flight = new Flight();

    @Getter
    private Passenger passenger = new Passenger();

    @Inject
    private FlightMapper flightMapper;
    @Inject
    private PassengerMapper passengerMapper;
    @Inject
    private FlightPassengerMapper flightPassengerMapper;

    public List<lt.vu.usecases.mybatis.model.Flight> getAllFlights() {
        return flightMapper.selectAll();
    }

    @Transactional
    public void createFlightPassenger() {
        flightMapper.insert(flight);
        passengerMapper.insert(passenger);
        FlightPassenger flightPassenger = new FlightPassenger();
        flightPassenger.setFlightId(flight.getId());
        flightPassenger.setPassengerId(passenger.getId());
        flightPassengerMapper.insert(flightPassenger);
        log.info("Maybe OK...");
    }
}
