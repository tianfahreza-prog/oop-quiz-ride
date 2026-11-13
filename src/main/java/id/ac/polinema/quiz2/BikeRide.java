package main.java.id.ac.polinema.quiz2;

import id.ac.polinema.quiz2.Passenger;

public abstract class BikeRide extends Ride{

    String rideId;
    double distanceKm;
    Passenger passenger;

    public BikeRide(String rideId, Passenger passenger, double distanceKm) {
        this.rideId = rideId;
        this.passenger = passenger;
        this.distanceKm = distanceKm;
    }

    @Override
    public double calculateFare() {
        return distanceKm * 2.500;
    }
}
