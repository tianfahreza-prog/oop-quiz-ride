package main.java.id.ac.polinema.quiz2;

import id.ac.polinema.quiz2.Insurable;
import id.ac.polinema.quiz2.Passenger;

public abstract class CarRide extends Ride implements Insurable{
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
        return distanceKm * 4000;
    }

    public double insuranceFee() {
        return 3000;
    }
}
