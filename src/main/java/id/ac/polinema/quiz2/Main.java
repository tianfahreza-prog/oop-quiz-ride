package id.ac.polinema.quiz2;

import java.util.List;

/**
 * Tempat bebas untuk mencoba programmu. Kelas ini TIDAK dinilai.
 *
 * Ide percobaan (tulis sendiri setelah tiap tahap selesai):
 *  1. Buat satu Passenger, lalu coba ubah namanya.
 *  2. Buat satu BikeRide dan satu CarRide, lalu tampilkan tarif-nya.
 *  3. Masukkan keduanya ke RideCalculator.totalFare(...) lewat sebuah List.
 *  4. Buat RideDispatcher dengan new CashPayment(), tambahkan perjalanan, lalu panggil checkout(...).
 *
 * Jalankan lewat NetBeans (Run Project), VS Code (Run di atas main),
 * atau terminal: mvn -q compile exec:java
 */
public class Main {

    public static void main(String[] args) {
        Passenger passenger = new Passenger("P1", "Tian");
        passenger.setName("Tian Fahreza");
        System.out.println("Penumpang: " + passenger.getPassengerId() + " - " + passenger.getName());

        BikeRide bikeRide = new BikeRide("L1", passenger, 5);
        CarRide carRide = new CarRide("L2", passenger, 5);
        System.out.println("Tarif BikeRide (5 km): " + bikeRide.calculateFare());
        System.out.println("Tarif CarRide (5 km): " + carRide.calculateFare());
        System.out.println("Biaya asuransi CarRide: " + carRide.insuranceFee());

        List<Ride> rides = List.of(bikeRide, carRide);
        System.out.println("Total tarif: " + RideCalculator.totalFare(rides));
        System.out.println("Total asuransi: " + RideCalculator.totalInsurance(rides));

        RideDispatcher dispatcher = new RideDispatcher(new CashPayment());
        dispatcher.add(bikeRide);
        dispatcher.add(carRide);
        dispatcher.checkout("L1");
    }
}
